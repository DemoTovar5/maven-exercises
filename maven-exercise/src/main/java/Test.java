import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something: ");
         String string = sc.nextLine();
         if(StringUtils.isNumeric(string)){
             System.out.println(string  + " is a number");
         }else{
             System.out.println(string + " is not a number");
         }
        System.out.println("Flipped case is: " + StringUtils.swapCase(string));
        System.out.println("Reversed case is: " + StringUtils.swapCase(string));


    }







}