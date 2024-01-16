/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistdemo;

//ctrl + shift + i to import
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Alondra Bio
 */
public class ArraylistDemo {

/**
 
    JOPTIONPANE
    1. MESSAGE - JOptionPane.showMessageDialog(parentComponent, object message);
    2. INPUT - JOptionPane.showInputDialog(parentComponent, object message);
    3. OPTIONS (Buttons) - JOptionPane.showOptionDialog(parentComponent, Object message, String title,
    int optionType,int messageType, Icon icon, Object[] options,Object initialValue);
    4. DROPDOWN - (String)JOptionPane.showInputDialog(parentComponent, object message, String title, messageType, icon, object[], initialValue);
    5. CONFIRMATION - JOptionPane.showConfirmDialog(parentComponent, object message, String title, int optionType);
    * 
    ARRAYLIST vs ARRAY
    * ArrayList - dynamic collection that can grow or shrink in size (objects)
    * Syntax : ArrayList<datatype> identifier = new ArrayList<>();
    * Array - fixed size collection elements (can store objects and primitive data type)
    * Syntax : DataType[] arrayName = new DataType[length]
    * Array vs ArrayList
        1. Declaration and Initialization
        2. Populating 
        3. Getting the size
        4. Add element
        5. set an element
        6. Remove an element
        7. Printing elements
    
    COMMONLY USED ARRAYLIST METHODS
    1. add(element) - add elements to the end of the arraylist
    2. remove(int index) - removes the element at the specified index
    3. get(int index) - returns the element at the specified index
    4. size() - returns the number of elements in the arraylist
    5. contains(object) - returns true if the arraylist contains the specified element
    6. set(int index) - replace the element at the specified index
    7. add (int index, element) - insert an element at the specified index
    8. remove(object) - removes the first occurence of the specified element
    9. clear() - removes all elements from the arraylist
    10. indexOf(object) - returns the index of the specified index
    Collections.sort(ArrayList)
    * 
    * Wrapper Class - Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
        int - Integer
        double - Double
        char - Character
        long - Long
        short - Short
        boolean - Boolean
   
 */
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
	ArrayVsArraylist();
	}
	
	/** 
	 * Searching Algorithm (Array)
	 */
	public static void searchingArray() {
		String[] seedless = {"watermelon",
			"apple",
			"grape",
			"tomato",
			"orange",
			"lemon",
			"cucumber",
			"pear",
			"plum",
			"avocado",
			"lime",
			"banana",
			"pineapple",
			"eggplant"};
		String input = JOptionPane.showInputDialog(null, "Search:");
		boolean found = false;
		for (int i = 0; i < seedless.length; i++) {
			if (seedless[i].equalsIgnoreCase(input)) {
				JOptionPane.showMessageDialog(null, 
					"Correct! We have "+ seedless[i] +" in our collection.");
				found = true;
				break;
			}
		}
		
		if (!found) {
			JOptionPane.showMessageDialog(null, 
				"Sorry, we don't have "+input+" in our collection.");
		}
	}
	
	/** 
	 * Searching Algorithm (ArrayList)
	 */
	public static void searchingArrayList() {
		ArrayList<String> seedless = new ArrayList<>(
			Arrays.asList("watermelon",
				"apple",
				"grape",
				"tomato",
				"orange",
				"lemon",
				"cucumber",
				"pear",
				"plum",
				"avocado",
				"lime",
				"banana",
				"pineapple",
				"eggplant"));
		String input = JOptionPane.showInputDialog(null, "Search:");
		boolean found = false;
		for (int i = 0; i < seedless.size(); i++) {
			if (seedless.get(i).equalsIgnoreCase(input)) {
				JOptionPane.showMessageDialog(null, 
					"Correct! We have "+ seedless.get(i) +" in our collection.");
				found = true;
				break;
			}
		}
		
		if (!found) {
			JOptionPane.showMessageDialog(null, 
				"Sorry, we don't have "+input+" in our collection.");
		}
	}
	
	
	public static void searchingArrayList2() {
		ArrayList<String> seedless = new ArrayList<>(
			Arrays.asList("watermelon",
				"apple",
				"grape",
				"tomato",
				"orange",
				"lemon",
				"cucumber",
				"pear",
				"plum",
				"avocado",
				"lime",
				"banana",
				"pineapple",
				"eggplant"));
		ArrayList<Double> price = new ArrayList<>(){{
				add(300.25);
				add(40.00);
				add(350.00);
				add(20.00);
				add(30.00);
				add(60.00);
				add(20.00);
				add(30.00);
				add(25.20);
				add(200.50);
				add(20.00);
				add(30.50);
				add(45.00);
				add(20.00);
		}};
		String input = JOptionPane.showInputDialog(null, "Search:").toLowerCase();
		int fruitIndex = seedless.indexOf(input);
		if (fruitIndex != -1) {
			JOptionPane.showMessageDialog(null, "Correct! We have "
				+ seedless.get(fruitIndex) + 
				" in our collection.\nThat would be PHP"+ price.get(fruitIndex));
		} else {
			JOptionPane.showMessageDialog(null, 
				"Sorry, we don't have "
				+ input + " in our collection.");
		}
	}
	
	public static void ArrayVsArraylist() {
		//ARRAYLIST vs ARRAY
		//1. Declaration and Initialization
		String[] name = new String[5];
		
		ArrayList<String> names = new ArrayList<>(); //String
		ArrayList<Double> price = new ArrayList<>(); //double
		ArrayList<Integer> scores = new ArrayList<>(); //int
		ArrayList<Character> letters = new ArrayList<>(); //char
		ArrayList<Boolean> validity = new ArrayList<>(); //boolean
		
		//2. Add element
		name[0] = "Daryl";
		scores.add(50);
		
		//3. Populating
		String[] vegetables = {"Okra", "Kalabasa", "Carrot","Lettuce","Sitaw"};
		
		//ANOTHER WAY TO POPULATE AN ARRAYLIST
//		ArrayList<String> fruits = new ArrayList<>(){{
//		add("Mango");
//		add("Banana");
//		add("Strawberry");
//		add("Grapes");
//		add("Kiwi");
//		}};
//		
		ArrayList<String> fruits 
			=  new ArrayList<>(Arrays.asList(
			"Mango",
			"Banana",
			"Strawberry",
			"Grapes",
			"Kiwi"));
		
		//4. Get the size
		System.out.println("The length of array vegetables : " + vegetables.length);
		System.out.println("The length of ArrayList fruits : " + fruits.size());
		
		//5. PRINTING
		System.out.println(vegetables); //array
		System.out.println(fruits); // ArrayList (original)
		System.out.println("VEGETABLES:");
		for (int i = 0; i < vegetables.length; i++) {
			System.out.println((i+1) + ". " + vegetables[i]);
		}
		System.out.println("FRUITS:");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println((i+1) + ". " + fruits.get(i));
		}
		
		//SORTING
		Collections.sort(fruits); //To sort ArrayList elements
		System.out.println(fruits); //Sorted ArrayList elements
		Arrays.sort(vegetables); //To sort Array elements
		System.out.println(Arrays.toString(vegetables)); //Sorted Array elements
		
		//6. Set or Update element
		vegetables[2] = "Petchay";
		fruits.set(0, "Chico");
		
		System.out.println("UPDATED VEGETABLES:");
		for (String veg : vegetables) {
			System.out.println(veg);
		}
		System.out.println("UPDATED FRUITS:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
	}
	
	public static void joptionsample() {
		
		//JOptionPane Input Dialog
		String name = JOptionPane.showInputDialog(null, "Enter your name");
		
		//JOptionPane Message Dialog
		JOptionPane.showMessageDialog(null, "Good Morning "+name+"!");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
		checkAge(age);
	}
	private static void checkAge(int age) {
		if (age >= 18 && age <= 100) {
			JOptionPane.showMessageDialog(null, "Welcome to Food hub!");
			breakfast();
		} else {
			JOptionPane.showMessageDialog(null, "You must be in legal age to access this site.");
		}
	}

	private static void breakfast() {
		String[] meals = {"Silog","Tapa","Lugaw","Exit"};
		int ml = JOptionPane.showOptionDialog(null, "Please choose your breakfast", 
                        "BREAKFAST MEALS", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, meals, meals[0]);
		switch (ml) {
			case 0:
				JOptionPane.showMessageDialog(null,"You ordered Silog");
				break;
			case 1:
				JOptionPane.showMessageDialog(null,"You ordered Tapa");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"You ordered Lugaw");
				break;
			case 3:
				int confirm = JOptionPane.showConfirmDialog(null, 
                                        "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
				if (confirm == 0) {
					JOptionPane.showMessageDialog(null, "Sad to see you go :(");
				} else {
					breakfast();
				}
				break;
		}
	}
	
	public static void dropdownSample() {
		String[] desserts = {"Cake","Ice cream","Halo-halo","Leche Flan"};
		String des = (String)JOptionPane.showInputDialog(null, "Pick your dessert", 
                        "DESSERTS", JOptionPane.ERROR_MESSAGE, null, desserts, desserts[1]);
		
		switch (des) {
			case "Cake":
				JOptionPane.showMessageDialog(null, "I love cake too!");
				break;
			case "Ice cream":
				JOptionPane.showMessageDialog(null, "I love the coldness and sweetness of ice cream");
				break;
			case "Halo-halo":
				JOptionPane.showMessageDialog(null, "Halo-halo is nice if marami sahog");
				break;
			case "Leche Flan":
				JOptionPane.showMessageDialog(null, "Leche Flan is my favorite dessert. (●'◡'●)");
				break;
		}
	}
	
	
}
