/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.encapsulation;

/**
 *
 * @author Alondra Bio
 */
public class employeeClass {
	//Attributes / instance variables/ fields/ global Variable
	private String EmpID;
	private String name;
	private double rate;
	private String position;
	private int workHrs;

	/**
	 * @return the EmpID
	 * getters:
	 * public Returntype methodName(){
	 * return statement;
	 * }
	 */
	public String getEmpID() {
		return EmpID;
	}

	/**
	 * @param EmpID the EmpID to set
	 * setters:
	 * public void methodName(parameter){
	 * this.InstanceVar = parameter;
	 * }
	 */
	public void setEmpID(String EmpID) {
		this.EmpID = EmpID;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the workHrs
	 */
	public int getWorkHrs() {
		return workHrs;
	}

	/**
	 * @param workHrs the workHrs to set
	 */
	public void setWorkHrs(int workHrs) {
		this.workHrs = workHrs;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
