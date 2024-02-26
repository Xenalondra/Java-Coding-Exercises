/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hr;

/**
 *
 * @author Alondra Bio
 */
public class Department {
    private Employee[] employees = new Employee[10];
    private String departmentName;
    private int lastEmployeeIndex = -1;
    
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public int getNumberOfEmployees(){
        return lastEmployeeIndex + 1;
    }
    
    public void addEmployee(Employee emp){
        if (lastEmployeeIndex < employees.length) {
            lastEmployeeIndex++;
            employees[lastEmployeeIndex] = emp;
        }
        
    }
    
    public Employee[] getEmployees(){
        Employee[] actualEmployees = new Employee[lastEmployeeIndex + 1];
        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }
    
    public String getEmployeeByID(int ID){
        String errorMsg = "";
        try {
            for (Employee employee : employees) {
                if (employee.getIdNumber() == ID) {
                    return employee.getName();
                }
            }
        } catch (Exception e) {
            errorMsg = "No employee with ID:" + ID + " found.";
        }
        return errorMsg;
    }
    
    public double getTotalSalary(){
        double totalSalary = 0;
        for (int i = 0; i <= lastEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }
    
    public double getAverageSalary(){
        double averageSalary =0;
        try {
            averageSalary = getTotalSalary() /(lastEmployeeIndex+1);
        } catch (Exception e) {
            System.out.println("There are currently no employee on the list.");
        }
        return averageSalary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    @Override
    public String toString(){
        return "Department " + getDepartmentName();
    }
}
