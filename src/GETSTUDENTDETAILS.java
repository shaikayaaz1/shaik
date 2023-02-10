       import java.util.Scanner;

       public class GETSTUDENTDETAILS {1

        public static void main(String[] args) {
                int roll;
                String name;
                String subject;

                Scanner SC = new Scanner(System.in);

                System.out.println("Enter roll:");
                roll = SC.nextInt();

                System.out.println("Enter name:");
                name = SC.next();

                System.out.println("Enter subject:");
                subject = SC.next();

//                System.out.println("Enter name,roll,subject");
//                name = SC.nextLine();
//                roll = SC.nextInt();
//                subject = SC.nextInt();

                System.out.println("Result:" + name + "\t" +
                        "1" + roll + "\n" + subject);
        }
}





