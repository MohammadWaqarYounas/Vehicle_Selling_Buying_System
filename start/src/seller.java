import java.io.*;
import java.util.Scanner;

public class seller extends VehicleEntry {
//    int a;
//    String b;
//    long no;
//    Scanner sc= new Scanner(System.in);
//    public void PostAdd()
//    {
//        do {
//            System.out.println("                             .................Welcome to Seller Panel.................\n\n");
//            System.out.println("\n How Many Adds You Want to post?  : ");
//            this.count=sc.nextInt();
//            System.out.println("                   .................Fill out the Form to Advertise your Vehicle.................\n");
//
//            for (int i=0; i < this.count; i++)
//            {
//                System.out.println("Enter Manufacture Year of Your Vehicle:");
//                a=sc.nextInt();
//                this.year[i]=a;
//                System.out.println("Enter Company of Your Vehicle (HINT-> TOYOTA, HONDA, SUZUKI etc..): ");
//                b=sc.next();
//                this.make[i]=b;
//                System.out.println("Enter Your Vehicle Model (HINT-> CIVIC, COROLLA, SWIFT etc..): ");
//                b=sc.next();
//                this.model[i]=b;
//                System.out.println("Enter Your Vehicle Engine capacity (HINT-> 600,1000.1500,1800 etc..): ");
//                a=sc.nextInt();
//                this.engine[i]=a;
//                System.out.println("Enter Your Your Mobile Number: ");
//                no=sc.nextLong();
//                this.Number[i]=no;
//                System.out.println("\nThis Add has been posted...\n");
//            }-------------------------------------------------------------------------------------------------------------------------------------
//            System.out.println("Enter Your Vehicle Engine capacity (HINT-> 600,1000.1500,1800 etc..): ");
//            a=sc.nextInt();
//            this.setEngine(a);
//            System.out.println("Enter Your Your Mobile Number: ");
//            no=sc.nextLong();
//            this.setNumber(no);
//            for (int i=0; i < this.count; i++)
//            {
//            System.out.println("Manufacture Year:  "+this.year[i]);
//            System.out.println("Car Company:  "+this.make[i]);
//            System.out.println("Car Model:  "+this.model[i]);
//            System.out.println("Engine Capacity:  "+this.engine[i]);
//            System.out.println("Seller Mobile No:  "+this.Number[i]);
//            System.out.println("\nThis Add has been posted...\n");
//            }
    int a;
    String b;
    long no;
    VehicleInformation vi = new VehicleInformation();
    Scanner sc= new Scanner(System.in);
    public void PostAdd()
    {
        do {
            System.out.println("                             .................Welcome to Seller Panel.................\n\n");
            System.out.println("\n How Many Adds You Want to post?  : ");
            vi.count=sc.nextInt();
            System.out.println("                   .................Fill out the Form to Advertise your Vehicle.................\n");

            for (int i=0; i < vi.count; i++)
            {
                VehicleInformation vi = new VehicleInformation();
                System.out.println("Enter Manufacture Year of Your Vehicle:");
                a=sc.nextInt();
                vi.setYear(a);
                System.out.println("Enter Company of Your Vehicle (HINT-> TOYOTA, HONDA, SUZUKI etc..): ");
                b=sc.next();
                vi.setMake(b);
                System.out.println("Enter Your Vehicle Model (HINT-> CIVIC, COROLLA, SWIFT etc..): ");
                b=sc.next();
                vi.setModel(b);
                System.out.println("Enter Your Vehicle Engine capacity (HINT-> 600,1000.1500,1800 etc..): ");
                a=sc.nextInt();
                vi.setEngine(a);
                System.out.println("Enter Your Your Mobile Number: ");
                no=sc.nextLong();
                vi.setNumber(no);
                System.out.println("\nThis Add has been posted...\n");
                this.advertise.add(vi);
            }
            for (int i=0;i<this.advertise.size();i++){
                System.out.println("Manufacture Year:  "+advertise.get(i).getYear());
                System.out.println("Car Company:  "+advertise.get(i).getMake());
                System.out.println("Car Model:  "+advertise.get(i).getModel());
                System.out.println("Engine Capacity:  "+advertise.get(i).getEngine());
                System.out.println("Seller Mobile No:  "+advertise.get(i).getNumber());
                System.out.println("\nThis Add Is Posted...\n");
            }

            System.out.println("Press (1) For MAIN MENU || OR || Press (2) To Again POST an Add");
            this.check=sc.nextInt();
        }while (this.check==2);
            }
}