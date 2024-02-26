/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hr;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

/**
 *
 * @author Alondra Bio
 */
public class EmployeeList implements Handler{
    private Employee[] employees;

    public EmployeeList(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);
        
        res.headers().put("Content-Type", "text/plain; charset=UTF-8");
        
        StringBuilder result = new StringBuilder();
        for (Employee employee : employees) {
            result.append(employee).append("\n");
        }
        
        res.send(result.toString());
    }
    
    
}
