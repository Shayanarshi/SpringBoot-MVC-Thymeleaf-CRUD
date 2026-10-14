package in.ashokit.service;

import in.ashokit.entity.Employee;
import in.ashokit.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repo;

    public  Employee save(Employee employee){
        return  repo.save(employee);
    }

    public List<Employee> findAll(){
        return  repo.findAll();
    }

    public Employee updateUser( Employee employee){
        return repo.save(employee);
    }

    public void deleteUser(Long empno){
        repo.deleteById(empno);
    }

    public Employee findById(Long empno) {
        return repo.findById(empno).orElse(null);
    }

}
