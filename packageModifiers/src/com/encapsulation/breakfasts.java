/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.encapsulation;

/**
 *
 * @author Alondra Bio
 */

//example of a final class = cannot be extended
public final class breakfasts {
	//Default
	//String name;
	private String name;
	private double price;
	private String servings;
	private String drinks;
	
	
	void displayName() {
		System.out.println("Food name: "+getName());
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

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the servings
	 */
	public String getServings() {
		return servings;
	}

	/**
	 * @param servings the servings to set
	 */
	public void setServings(String servings) {
		this.servings = servings;
	}

	/**
	 * @return the drinks
	 */
	public String getDrinks() {
		return drinks;
	}

	/**
	 * @param drinks the drinks to set
	 */
	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}
}
