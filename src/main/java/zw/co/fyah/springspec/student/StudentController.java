package zw.co.fyah.springspec.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> students = Arrays.asList(
            new Student(1L,"Shelton"),
            new Student(2L, "Ashton"),
            new Student(3L,"Hilton"),
            new Student(1L,"Clayton")
    );


    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable Long id){
        return students.stream().filter(student -> id.equals(student.getId())).findFirst().orElseThrow(()-> new IllegalStateException("Not Found"));
    }

    @GetMapping("/home")
    public String home(){
        return  "index";
    }
}
