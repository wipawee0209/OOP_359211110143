package ooplab3;

import java.util.Scanner;

public class TestWhileLoopPin {
    public static void main(String[] args) {
        String PIN = "1234";
        String input;
        Scanner scanner = new Scanner(System.in);
          int count =0;
        do {
            System.out.print("Pin");
            input =scanner.nextLine();
            if (input.equals(PIN))
            {
                System.out.print("Welcome");
                break;

            }
            else
            {
                count++;
                if (count==3) {
                    System.out.print("Locked");
                    break;
                }
            }
        }while (!input.equals(PIN));

    }//main
}//class
