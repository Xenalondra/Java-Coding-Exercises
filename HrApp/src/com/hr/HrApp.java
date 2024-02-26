/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.hr;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Alondra Bio
 */
public class HrApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("HR App Starts");
        
        Department department = new Department("Education");
        System.out.println("Department: "+ department);
        
        Employee[] employees = {
            new Employee(101, "Ann", 1234.56),
            new Employee(102, "Bob", 1200.34),
            new Employee(103, "Ray", 1122.33),
        };
        
        for (Employee employee : employees) {
            department.addEmployee(employee);
        }
        
        double totalSalary = department.getTotalSalary();
        double average = department.getAverageSalary();
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + average);
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Find employee by ID: ");
//        System.out.println(department.getEmployeeByID(scanner.nextInt()));

        try {
            EmployeeList empList = new EmployeeList(employees);
            
            Routing routing = Routing.builder().get("/items", empList).build();
            
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            
            WebServer web = WebServer.create(config, routing);
            web.start();
        } catch (UnknownHostException e) {
        }
    }
    
}
