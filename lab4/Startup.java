/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import common.Employee;
import java.util.*;

/**
 *
 * @author Timothy
 */
public class Startup {
    public static void main(String[] args) {
        
        //Stores employee object by the ssn
        HashMap<String, Employee> employees = new HashMap<String, Employee>();
        employees.put("555-55-5555", new Employee("Christensen", "Tim", "555-55-5555"));
        employees.put("333-33-3333", new Employee("Doe", "John", "333-33-3333"));
        employees.put("333-33-3333", new Employee("Doe", "John", "333-33-3333"));
        employees.put("444-44-4444", new Employee("Doe", "Jane", "444-44-4444"));
        
        System.out.println("Employee: 333-33-3333 " + employees.get("333-33-3333").toString());
        
        //Old employee at that ssn will be replaced with the new object
        employees.put("444-44-4444", new Employee("James", "LeBron", "444-44-4444"));
        
        Iterator<String> i = employees.keySet().iterator();
        
        while(i.hasNext()) {
            String key = i.next();
            System.out.println(employees.get(key).toString());
        }
       
              
        
        
        
        
    }
}
