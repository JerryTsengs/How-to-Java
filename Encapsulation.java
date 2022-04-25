//include and import the scanner libs
import java.util.Scanner;

class Human{
    private String firstName;
    private String lastName;
    private int age = -1;

    public void setName(String first,String last){
        if( first == null || last == null || first.length()==0 || last.length()==0 ){
            System.out.println("ERROR: first name or last name can not be empty!");
        }else{
            firstName = first;
            lastName = last;
        }
    }
    public void setAge(int a){
        if(a < 0){
            System.out.println("ERROR: age can not be empty!");
        }else{
            age = a;
        }
    }
    public String getName(){
        if( firstName==null || lastName==null)
            return "unset";
        else
            return "This human is " + firstName + " " + lastName + " and age ";
    }
    public int getAge(){
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        
        String str1,str2;
        int num1;
        
        Human s1 = new Human();
        Scanner my_scanner = new Scanner(System.in);
        
        System.out.print("Enter a human first name: ");
        str1 = my_scanner.nextLine();
        System.out.print("Enter this human last name: ");
        str2 = my_scanner.nextLine();
        s1.setName(str1,str2);
        
        System.out.print("Enter this human age: ");
        
        while(true){
            try{
                num1 = my_scanner.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Don't try to play with me, I told you to enter a age. Now, do it again!");
                my_scanner.next();
            }    
        }
        s1.setAge(num1);
        
        System.out.print(s1.getName());
        System.out.println(s1.getAge());

        //Human s2 = new Human();
        //s2.setName("Tina", "Lee");
        //s2.setAge(18);
        //System.out.println(s2.getName());
        //System.out.println(s2.getAge());

    }
}
