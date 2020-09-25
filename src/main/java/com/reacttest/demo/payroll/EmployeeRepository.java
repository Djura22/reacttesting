package com.reacttest.demo.payroll;


import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> { (1)

}
