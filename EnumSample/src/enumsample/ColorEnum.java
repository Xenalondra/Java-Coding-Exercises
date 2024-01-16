/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumsample;

/**
 *
 * @author Alondra Bio
 */
public enum ColorEnum {
   Red("Red has the longest wavelength."),
   Green("Green is the combination of blue and yellow."),
   Yellow("Yellow is the color of the sun"),
   Blue("Blue is one of the coolest color."),
   Violet("Violet has the shortest wavelength"),
   Indigo("Indigo is one of the colors of the rainbow"),
   Orange("Orange is the combination of red and yellow.");
   
   private final String Description;
   
   //Constructor
   ColorEnum(String Description){
       this.Description = Description;
   }
   
   //Access Method = Getter method
   public String getDescription(){
       return Description;
   }
}
