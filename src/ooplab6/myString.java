package ooplab6;

public class myString {
    public static void main(String[] args) {
        char []c = {'H','e','l','l','o'};
        String str1 = new String(c);
        System.out.println(str1);

        String str2 ="Wipawee";
        System.out.println(str2);

        String str3= new String("RMUTSV");
        System.out.println(str3);

        //concatenation String
        //type (+)
        String str4 =str1 +" "+ str2;
        System.out.println(str4);
        //type (comcat() method)
        String str5 =str1.concat(" "+str3);
        System.out.println(str5);

        //String size
        int length =str4.length();
        System.out.println(length);
        System.out.println(str5.length());

        //String method

        System.out.println(str5.toLowerCase());//ตัวอักษรเล็ก
        System.out.println(str5.toUpperCase());//ตัวอักษรใหญ่
        System.out.println(str5.replace('l','s'));//เปลี่ยนแทนที่อักษร
        System.out.println(str5.indexOf('V'));//ค้นหาว่าอักษรตัวนั้นมีกี่อักกขระ

        //trim()
        String str6 ="  Hello  ";
        System.out.println(str6.length());
        System.out.println("*"+str6+"*");
        System.out.println("*"+str6.trim()+"*");




    }//main
}
