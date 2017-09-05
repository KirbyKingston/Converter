package converter;

import java.util.Scanner;

/**
 *
 * @author Mitch
 */
public class Start {
    
    

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int convInput;
        
        System.out.println("Welcome to the converter. \n" +
                           "Please enter a number to convert to binary." ); 
        
        convInput = Integer.parseInt(keyboard.nextLine());
        Converter converter = new Converter(convInput);
        
        
    }
    
}
