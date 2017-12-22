package ooplab5;

import java.util.ArrayList;

//ลบเพิ่มได้
public class myArrayList {
    public static void main(String[] args) {
        //ArrayList
        ArrayList list = new ArrayList();
        String name ="August";
        list.add(name);
        System.out.println(list);
        list.add("Toye");
        list.add("Tan");
        System.out.println(list);
        list.add(2,"ADAM");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove("Tan");//ลบ
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));//เรียกชื่อตำแหน่งที่2
        System.out.println(list.indexOf("ADAM"));//ชื่ออยู่ตำแหน่งไหน
    }//main
}//class
