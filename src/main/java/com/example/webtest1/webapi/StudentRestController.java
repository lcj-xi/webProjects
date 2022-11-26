package com.example.webtest1.webapi;

import antlr.StringUtils;
import com.example.webtest1.Untils.PageUntils;
import com.example.webtest1.domain.Student;
import com.example.webtest1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("webapi/student")
public class StudentRestController {

    @Autowired
    StudentService studentService;

    /**
     * url:https://localhost:8080/webapi/student/list
     *
     * @return List<Student>
     */
    @GetMapping("list")
    public List<Student> getAll() {
        return studentService.getAllStu();
    }

    @GetMapping("getByPage")
    public PageUntils getByPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                @RequestParam(value = "size", defaultValue = "10") Integer size,
                                @RequestParam(value = "name", defaultValue = "") String name) {

        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        if (name == null || name.equals("")) {



            Pageable pageable = PageRequest.of(page, size, sort);
            Page<Student> students = studentService.getAll(pageable);
            PageUntils pageUntils = new PageUntils(students.getContent(), students.getTotalElements());
            return pageUntils;
        }
        else {
            Student student = new Student();
            student.setName(name);
            ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("name",ExampleMatcher.GenericPropertyMatchers.contains());
            Example<Student> example=Example.of(student,exampleMatcher);
            Pageable pageable = PageRequest.of(page, size, sort);
            Page<Student> students = studentService.getAll(example,pageable);
            PageUntils pageUntils = new PageUntils(students.getContent(), students.getTotalElements());
            return pageUntils;

        }

    }

    @GetMapping("findbyname")
    public List<Student> findByname(@RequestParam("name") String sname) {

        List<Student> byName = studentService.getByName(sname);
        return byName;
    }

    @GetMapping("findById")
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @PostMapping("insert")
    public Student insert(Student student) {
        Student stu = studentService.insert(student);
        return stu;
    }

    @PutMapping("update")
    public Student update(Student student) {
        return studentService.insert(student);
    }

    @DeleteMapping("delete")
    public Student delete(Student student) {

        return studentService.delete(student);

    }


}
