
package converter;

import java.util.Arrays;

/**
 *
 * @author Mitch
 */
public class Converter {
    
    private int input;
    private int output[];

    
    
    public Converter(int input){
        this.input = input;
    }
    
    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }
    public void convertInput(int input){
    int output[] = new int[input];
    int index = 0;
    while(input > 0){
        output[index++] = input%2;
        input = input/2;
        }
    System.out.println (Arrays.toString(output));
    }
    public int[] getOutput() {
        return output;
    }

    public void setOutput(int output[]) {
        this.output = output;
    }
    public void displayOutput(int output[]){
    System.out.println (Arrays.toString(output));
    }

}
