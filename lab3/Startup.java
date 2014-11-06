/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import common.Employee;
import java.util.*;

/**
 *
 * @author Timothy
 */
public class Startup {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Christensen", "Tim", "555-55-5555"));
        employees.add(new Employee("Doe", "John", "333-33-3333"));
        employees.add(new Employee("Doe", "John", "333-33-3333"));
        employees.add(new Employee("Doe", "Jane", "444-44-4444"));
        
        Set<Employee> noDupes = new LinkedHashSet<Employee>(employees);
        employees = new ArrayList<Employee>(noDupes);
        
        
        
        System.out.println("Size of employees: " + employees.size());
        Employee employee = employees.get(2);
        System.out.println("Second employee " + employee.toString());
              
        for(Employee e : employees) {
            System.out.println(e.toString());
        }
        
        
        
    }
}
