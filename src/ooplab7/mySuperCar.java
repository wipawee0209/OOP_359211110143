package ooplab7;

import java.util.Scanner;

public class mySuperCar {

          public static void main(String[] args) {
            SuperCar A1 = new  SuperCar();
            A1 = inputData(A1);
            System.out.println(A1.toString());
        }

        private static SuperCar inputData(SuperCar a) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insent your student info: ");
            System.out.println("Car brand: ");
            a.setCarbrand(scanner.nextLine());
            System.out.println("Car color: ");
            a.setCarcolor(scanner.nextLine());
            System.out.println("Car engine size: ");
            a.setCarenginesize(scanner.nextLine());
            System.out.println("Max speed: ");
            a.setMaxspeed(scanner.nextLine());
            System.out.println("Country of origin: ");
            a.setCountryoforigin(scanner.nextLine());

            return a;
        }

    }
