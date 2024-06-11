package in.Report.repo;

import in.Report.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "select * from Student_data", nativeQuery = true )
    public List<Student> getStud();


}