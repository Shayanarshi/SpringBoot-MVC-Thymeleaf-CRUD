package in.ashokit.repository;

import in.ashokit.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Employee findByEname(String ename);
    Employee findByDepartment(String dept);
    Employee findBySal(Double sal);
}
