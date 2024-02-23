/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodsclasses.exercise4;


/**
 *
 * @author Alondra Bio
 */
public class Customer {

    /**
     * @return the items
     */
    
    private String name;
    private String size;
    private Clothing[] items;
    
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    
    public void addItem(Clothing[] someItems){
        items = someItems;
    }
    
    public Clothing[] getItems() {
        return items;
    }
    
    public double getTotalCloathingCost(){
        double total = 0;
        for (Clothing item : items) {
            total += (item.getPrice());
            System.out.println(item.invoice());
        }
        return total;
    }
    
}
