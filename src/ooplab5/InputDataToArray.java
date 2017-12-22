package ooplab5;

import java.util.Scanner;

public class InputDataToArray {
    private static int MAX =5;
    public static void main(String[] args) {
      int number[]= new int[MAX];
      //  System.out.println(number.length);//lengthนับค่าความยาวของอาร์เรย์
        //for
        number = inputData(number);
        showData(number);
        showDataEnchace(number);

    }//main

    private static void showDataEnchace(int[] number) {
        System.out.println("Data in Array: ");
        for (int val:number)
            System.out.println(val+" ");

    }
    private static int[] showData(int[] number){
        System.out.println("Data in Array: ");
        for (int i=0; i<number.length; i++)
            System.out.print(number[i]+" ");

        return number;
    }

    private static int[] inputData(int[] number) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter an integer:");
        for (int i=0; i<number.length; i++){
            System.out.println("number["+i+"]:");
            number[i]= scanner.nextInt();

        }
        return number;
    }//inputData




}//class
