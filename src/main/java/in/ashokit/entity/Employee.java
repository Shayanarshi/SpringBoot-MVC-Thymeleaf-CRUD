package in.ashokit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empNo;

    @Column(nullable = false)
    private String ename;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private Double sal;

}
