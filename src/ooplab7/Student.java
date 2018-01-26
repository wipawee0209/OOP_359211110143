package ooplab7;
//talking about student?
//1. student ID
//2. Name
//3. Person ID
//4. Address
//Access Control
//1.public
//2. private
//3. protected

public class Student {
    //propertis of student class
    private String id;
    private String name;
    private String pid;
    private String address;
    //Contructor
    //defult constructor
    public  Student(){}
        //create by own
        public Student(String id,String n,String pid,String a){
        // assign data to class properties
            this.id =id;
            this.name =n;
            this.pid =pid;
            this.address =a;

              }//Student
    //getter  and setter methodos etter อ่านค่า  setter เปลี่ยนแปลงภายในpropertiesที่ต้องการ
//Alt+insent-> getter  and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//Alt+insent-> to String()   @Override ห้ามพิมพ์เอง
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}//class
