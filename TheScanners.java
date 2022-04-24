//include and import the scanner libs
import java.util.Scanner;

//class name must same as java file name TheScanners.java
public class TheScanners {
    public static void main(String[] args) {
	
	//initialize valuables and the scanner as "my_scanner" (you can name whatever you want)
        String str1;
        int a, num1;
        double double1;
        Scanner my_scanner = new Scanner(System.in);
        
	//get a string by scanner "nextLine()" function
        System.out.print("Enter a string: ");
        str1 = my_scanner.nextLine();
        
	//get a number by scanner "nextInt" function and check if this is a number
        System.out.print("Enter a number: ");
        
        while(true){
            try{
                num1 = my_scanner.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Don't try to play with me, I told you to enter a number. Now, do it again!");
                my_scanner.next();
            }    
        }
        
        
	//get a floating number by scanner "nextDouble" function and check if this is a floating number
        System.out.print("Enter a floating number: ");
        
         while(true){
            try{
                double1 = my_scanner.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("Don't try to play with me, I told you to enter a floating number. Now, do it again!");
                my_scanner.next();
            }    
        }
        
	//all done, and show all of them back to the screen
        System.out.println("Your string is：" + str1);
        System.out.println("Your number is：" + num1);
        System.out.println("Your floating number is：" + double1);
    }
}

