package in.ashokit.controller;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @ModelAttribute("employee")
    public Employee createUser(){
        return new Employee();
    }
    @GetMapping(value = "/")
    public String returnIndexPage(){
        return "index";
    }

    @GetMapping(value = "/add")
    public String returnAddPage(){
        return "add";
    }

    @PostMapping(value = "/save")
    public  String saveEmployee(@ModelAttribute("employee") Employee employee, Model model){
        service.save(employee);
        model.addAttribute("message", "Added Successfully");
        return  "success";
    }

    @GetMapping(value = "/read")
    public String readEmployee(Model model){

        model.addAttribute("employees",service.findAll());
        return "read";

    }


    @GetMapping("/edit/{empno}")
    public String editEmployee(@PathVariable Long empno, Model model) {

        Employee employee = service.findById(empno);

        if (employee == null) {
            model.addAttribute("message", "Employee not found");
            return "read";
        }

        model.addAttribute("employee", employee);

        return "update";
    }



    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute("employee") Employee employee,
                                 Model model) {

        service.updateUser(employee);

        model.addAttribute("message", "Employee updated successfully");

        return "redirect:/read";
    }

    @GetMapping("/delete/{empno}")
    public String deleteEmployee(@PathVariable Long empno,
                                 Model model) {

        service.deleteUser(empno);

        model.addAttribute("message", "Employee deleted successfully");

        return "redirect:/read";
    }

}
