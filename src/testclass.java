
import java.util.Scanner;
   class Student {
       public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
           System.out.println("***Input the asked details***");
           System.out.println("Enter Roll Number:");
           int rollNo = sc.nextInt();

           System.out.println("Enter Name:");
           String name = sc.next();

           System.out.println("Enter Age:");
           int age = sc.nextInt();

           System.out.println("Enter City:");
           String city = sc.next();

           System.out.println("Enter Course:");
           String course = sc.next();

           System.out.println("***Inputed Student Details***");
           System.out.println("Roll Number:" + rollNo);
           System.out.println("Name:" + name);
           System.out.println("Age:" + age);
           System.out.println("City:" + city);
           System.out.println("Course:" + course);
       }
   }



