package ooplab8;

public class PersonApp {
    public static void main(String[] args) {
        //create object as studentt
        Student student = new Student("1111111111111",
                "Boy Saiyai",
                "109 M.2 Thungsong",
                "Maie",
                "STD00001",
                "Information System");
        System.out.println(student.toString());
        student.setName("Boy Saiyong"); //set คือการเปลี่ยนค่า
        System.out.println(student.getName());
        System.out.println(student.toString());
        {
            Employee employee = new Employee("1809900638256",
                    "Wipawee",
                    "125/1 M.3",
                    "aaaa",
                    "AAA",
                    "30000",
                    "ZZZZZZZ");
            System.out.println(employee.toString());
        }

    }//main
}//class
