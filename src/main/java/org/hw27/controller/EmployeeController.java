package org.hw27.controller;
import org.hw27.model.Employee;
import org.hw27.service.EmployeeService;


import java.util.List;




import java.util.List;

@RestController

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam("firstName") String name,
                        @RequestParam("lastname") String surname) {

        return employeeService.addEmployee(name, surname);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam("firstName") String name,
                           @RequestParam("lastName") String surname) {
        return employeeService.removeEmployee(name, surname);

    }

    @GetMapping("/find")
    public Employee find(@RequestParam("firstName") String name,
                         @RequestParam("lastName") String surname) {
        return employeeService.findEmployee(name,
                surname);
    }
    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();}

}