package attendance.demo.controller;

import java.util.List;
import attendance.demo.domain.Student;
import attendance.demo.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/faculty/students/session/{sessionid}")
	public List<Student> getStudentListBySession(@PathVariable("sessionid") int sessionId) {
		return studentService.getStudentListBySession(sessionId);
	}

	@GetMapping(value = "/faculty/students/courseoffering/{courseofferingid}")
	public List<Student> getStudentListByCourseOffering(@PathVariable("courseofferingid") int courseOfferingId) {
		return studentService.getStudentListByCourseOffering(courseOfferingId);
	}

	@GetMapping(value = "/faculty/students/course/{courseid}")
	public List<Student> getStudentListByCourse(@PathVariable("courseid") String courseId) {
		return studentService.getStudentListByCourse(courseId);
	}

    @PreAuthorize("hasAuthority('USER')")
    @GetMapping(value = "/hello")
    public String test(){
        return "hello from attendance";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping(value = "/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
