import java.util.Scanner;

public class buyer extends VehicleEntry{

    Scanner sc= new Scanner(System.in);
    public void ShowAdd(){
        if(advertise.size()==0){
            System.out.println("Sorry No Adds Available...");
        }else {
            for (int i = 0; i < advertise.size(); i++)
            {
                VehicleInformation vi = new VehicleInformation();

                vi = advertise.get(i);

                System.out.println("Manufacture Year:  "+vi.getYear());
                System.out.println("Car Company:  "+vi.getMake());
                System.out.println("Car Model:  "+vi.getModel());
                System.out.println("Engine Capacity:  "+vi.getEngine());
                System.out.println("Seller Mobile No:  "+vi.getNumber());
                System.out.println("\n\n");
            }
        }
    }
    public void Compair()
    {
        System.out.println("Press (1) If you want to see the whole list || OR || Press (2) to Apply Filter to vehicles");
    }

    public void Filtering(){
        if(advertise.size()==0){
            System.out.println("Sorry No Adds Available...");
        }else{
            do {
                System.out.println("Select an option:");
                System.out.println("(1) By Vehicle Manufacture year.");
                System.out.println("(2) By Vehicle Manufacturer Company name.");
                System.out.println("(3) By Vehicle Model.");
                System.out.println("(4) By Vehicle Engine Capacity.");
                int filter=sc.nextInt();

            switch (filter)
            {
                case 1:{
                    int year;
                    System.out.println("Enter Manufacture Year:");
                    year=sc.nextInt();
                    for (int i = 0; i < advertise.size(); i++){
                        VehicleInformation vi = new VehicleInformation();
                        vi=advertise.get(i);
                        if (year==vi.getYear()){
                            System.out.println("Manufacture Year:  "+vi.getYear());
                            System.out.println("Car Company:  "+vi.getMake());
                            System.out.println("Car Model:  "+vi.getModel());
                            System.out.println("Engine Capacity:  "+vi.getEngine());
                            System.out.println("Seller Mobile No:  "+vi.getNumber());
                            System.out.println("\n\n");
                        }else {
                            System.out.println("\n");
                        }
                    }
                    break;
                    }
                case 2:
                {
                    String make;
                    System.out.println("Enter Manufacturer Company:");
                    make=sc.next();
                    for (int i=0; i<advertise.size();i++) {
                        VehicleInformation vi = new VehicleInformation();
                        vi=advertise.get(i);
                        if (make==vi.getMake()){
                            System.out.println("Manufacture Year:  "+vi.getYear());
                            System.out.println("Car Company:  "+vi.getMake());
                            System.out.println("Car Model:  "+vi.getModel());
                            System.out.println("Engine Capacity:  "+vi.getEngine());
                            System.out.println("Seller Mobile No:  "+vi.getNumber());
                            System.out.println("\n\n");
                        }else {
                            System.out.println("");
                        }
                    }
                    break;

                    }
                case 3:
                {
                    String model;
                    System.out.println("Enter vehicle Model:");
                    model=sc.next();
                    for (int i=0; i<advertise.size();i++) {
                        VehicleInformation vi = new VehicleInformation();
                        vi=advertise.get(i);
                        if (model==vi.getModel()){
                            System.out.println("Manufacture Year:  "+vi.getYear());
                            System.out.println("Car Company:  "+vi.getMake());
                            System.out.println("Car Model:  "+vi.getModel());
                            System.out.println("Engine Capacity:  "+vi.getEngine());
                            System.out.println("Seller Mobile No:  "+vi.getNumber());
                            System.out.println("\n\n");
                        }else {
                            System.out.println("");
                        }
                    }
                    break;
                }
                case 4:
                {
                    int engine;
                    System.out.println("Enter Manufacture Year:");
                    engine=sc.nextInt();
                    for (int i = 0; i < advertise.size(); i++){
                        VehicleInformation vi = new VehicleInformation();
                        vi=advertise.get(i);
                        if (engine==vi.getEngine()){
                            System.out.println("Manufacture Year:  "+vi.getYear());
                            System.out.println("Car Company:  "+vi.getMake());
                            System.out.println("Car Model:  "+vi.getModel());
                            System.out.println("Engine Capacity:  "+vi.getEngine());
                            System.out.println("Seller Mobile No:  "+vi.getNumber());
                            System.out.println("\n\n");
                        }else {
                            System.out.println("\n");
                        }
                    }
                    break;
                }
                default:{
                    System.out.println("Invalid Selection...");
                }
                }
                System.out.println("Press (1) For MAIN MENU || OR || Press (2) To Again Apply Filtering");
                this.check=sc.nextInt();
            }while (this.check==2);
            }
        }

    }
