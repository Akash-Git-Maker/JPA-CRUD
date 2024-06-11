package in.Report.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Student_data")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private Integer studentId;
    private String studentName;
    private Long studentMobile;
}
