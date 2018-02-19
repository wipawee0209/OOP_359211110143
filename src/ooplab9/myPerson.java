package ooplab9;

public class myPerson {
    public static void main(String[] args) {
        Person person = new Person("wipawee", 18,
                new Address("125/1", "Nakhorsithammarat",
                        "80180"),
                new Job("bitoey", 15000));


        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(50000);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());
    }
}
