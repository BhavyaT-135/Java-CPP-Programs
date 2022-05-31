package bhavya;

import java.util.Scanner;

public class Switchfruit {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("Mango is the king of fruits");
                break;
            case "Apple":
                System.out.println("Apple is a red fruit");
                break;
            case "Orange":
                System.out.println("Orange is a juicy fruit");
                break;
        
            default:
                System.out.println("I don't know that fruit");
                break;
        }
    }
}