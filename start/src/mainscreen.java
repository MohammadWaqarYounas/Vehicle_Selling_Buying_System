import java.util.Scanner;

public class mainscreen {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int option,mode;
        seller sell= new seller();
        buyer buy = new buyer ();

        do {
            System.out.println("                             .................Welcome to Car Buying & Selling.................\n\n");
            System.out.println("Press (1) for Watching Advertisements");
            System.out.println("Press (2) to Advertise your Car");
            System.out.println("Press (3) to EXIT.");
            option =sc.nextInt();
            switch (option){
                case 1:{
                    buy.Compair();
                    mode=sc.nextInt();
                    if (mode==1)
                    {
                        buy.ShowAdd();
                    }
                    else if (mode==2)
                    {
                        buy.Filtering();
                    }else{
                        System.out.println("Invalid Entry...");
                    }
                    break;
                } case 2:{
                    sell.PostAdd();
                    break;
                } default:{
                    System.out.println("Exited...");
                }
            }
        }while (option ==1 || option ==2);

    }
}
