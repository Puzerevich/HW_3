import Package_1.Employee;
import Package_1.Car;
import Package_1.SameName;
import Package_2.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task_1");
        Employee [] staff = new Employee[3];
        staff[0] = new Employee("Kostyantin", "Java dev.", "mail1@mail.ua", "=380501112233", "21.02.1990");
        staff[1] = new Employee("Vlad", "QA", "mail2@mail.ua", "=380504445566", "31.05.1985");
        staff[2] = new Employee("Sasha", "Team lead", "mail3@mail.ua", "=380507778899", "11.12.1980");

        int i=0;
        System.out.println("Staff list:");
        for(Employee e : staff){
            i++;
            System.out.println(i+"). Full Name:"+e.getFullName()+",  Postion:"+e.getPosition()+",  Birth Date:"+e.getBirthDate()+",  phone:"+e.getPhone()+",  email:"+e.getEmail());
        }
        System.out.println("\nOverride \"toString\" in class Employee.");
        for (Employee e : staff){
            System.out.println(e.toString());
        }
        System.out.println("\nTest \"printf\"");
        for(Employee e : staff){
        System.out.printf("Full Name:%s" +
                    "\nPostion:%s"+
                    "\nBirth Date:%s"+
                    "\nphone:%s"+
                    "\nemail:%s", e.getFullName(), e.getPosition(), e.getBirthDate(), e.getEmail(), e.getPhone());
            System.out.println("\n");
        }

        System.out.println("Task_2");
        SameName sm1 = new SameName();
        Package_2.SameName sm2 = new Package_2.SameName();
        System.out.println(sm2.getRes());


        System.out.println("\nTask_3");
        System.out.println("Class \"Car\":");
        Car cr = new Car();
        cr.Start();
    }
}
