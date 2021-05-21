package com.example.managementappfinal.controller;

import com.example.managementappfinal.domain.Employee;
import com.example.managementappfinal.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Employee> employees = employeeService.findAllEmployees();
        model.addAttribute("listEmployees", employees);
        return "home";
    }

    @RequestMapping("/new")
    public String newEmployeePage(Model model) {
        Employee employee = new Employee();
        model.addAttribute(employee);
        return "add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("edit/{id}")
    public ModelAndView showEditEmployeePage(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        Employee employee = employeeService.findEmployeeById(id);
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @RequestMapping("delete/{id}")
    public String deleteEmployeePage(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }

}
