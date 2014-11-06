/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import common.Employee;
import java.util.*;

/**
 *
 * @author Timothy
 */
public class Startup {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Christensen", "Tim", "555-55-5555"));
        employees.add(new Employee("Doe", "John", "333-33-3333"));
        employees.add(new Employee("Doe", "John", "333-33-3333"));
        employees.add(new Employee("Doe", "Jane", "444-44-4444"));
        
        System.out.println("Size of employees: " + employees.size());
        Employee e = employees.get(2);
        System.out.println("Second employee " + e.toString());
        
        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
        employees.remove(2);
        System.out.println("Employees array is empty: " + employees.isEmpty());
        
        
    }
}
