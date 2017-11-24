package ooplab2;

public class TestVariabel {
    public static void main(String[] args) {
        // integer
        int i;
        i =10;
        System.out.print("i="+i);
        int j = 20;
        System.out.print("j ="+j);
        System.out.print("i+j+"+(i+j));

        //Double
        double v = 15.15;
        System.out.print(v);
        System.out.print(v*10);

        //Character
        char c = 'T';
        System.out.print(c);

        //String
        String s ="Hello, Word";
        System.out.print(s);
        String name = " I'm wipawee";
        String msg = s+ " "+name;
        System.out.print(msg);

        String msg2 = s.concat(" "+name);
        System.out.println(msg2);
        System.out.println(msg.length());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());

        //  boolean
        boolean b = true;
        boolean b1 = false;
        System.out.println(b);
        System.out.println(b1);

    }//main
}//class
