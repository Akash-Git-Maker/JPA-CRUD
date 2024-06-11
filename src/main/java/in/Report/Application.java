package in.Report;

import in.Report.entity.Student;
import in.Report.repo.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt = SpringApplication.run(Application.class, args);

		StudentRepository repo = cntxt.getBean(StudentRepository.class);

		// Creating student instances
//		Student s1 = new Student(1, "John Doe", 9876543210L);
//		Student s2 = new Student(2, "Jane Doe", 9876543211L);
//		Student s3 = new Student(3, "Alice Smith", 9876543212L);
//		Student s4 = new Student(4, "Bob Johnson", 9876543213L);
//		Student s5 = new Student(5, "Charlie Brown", 9876543214L);
//		Student s6 = new Student(6, "David Wilson", 9876543215L);
//		Student s7 = new Student(7, "Eve Davis", 9876543216L);
//		Student s8 = new Student(8, "Frank Miller", 9876543217L);
//		Student s9 = new Student(9, "Grace Lee", 9876543218L);
//		Student s10 = new Student(10, "Hank Moore", 9876543219L);
//
//		// Save all students to the database
//		repo.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));

		// Retrieve the student with ID 1 from the repository
//		Student studentToUpdate = repo.findById(1).orElse(null);
//		studentToUpdate.setStudentName("Arjun");
//
//		repo.save(studentToUpdate);

//-----------------------------------------------------------------------------------------------

		// to update the records

//		Student update = repo.findById(1).orElse(null);
//		update.setStudentId(1);
//
//		if (update != null) {
//			update.setStudentName("Akash");
//			update.setStudentMobile(8147627847l);
//
//			repo.save(update);
//		}else {
//			System.out.println("Student with ID 1 not found.");
//		}
//-----------------------------------------------------------------------------------------------

//		List<Student> Stud = repo.findAll();
//		all.forEach(System.out::println);
//-----------------------------------------------------------------------------------------------

//		Sort ascending = Sort.by("studentName").ascending();
//		List<Student> Stud = repo.findAll(ascending);
//		Stud.forEach(System.out::println);
//-----------------------------------------------------------------------------------------------

		//PAGINATION

		Sort ascending = Sort.by("studentName").ascending();

		int pageNo= 2;
		PageRequest page= PageRequest.of(1 - 1, 3);

		Page<Student> findALl = repo.findAll(page);
		List<Student> Stud = findALl.getContent();
		Stud.forEach(System.out::println);


	}


}
