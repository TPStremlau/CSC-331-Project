import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Bottom_Classes.Plane plane1 = new Bottom_Classes.Plane("Terminal 1", 25, 30.00,
                "Purchase", 600_000.00, 200, 300.00, 300,
                "Delta", "RDU", "6:00AM", "10:00AM");
        Bottom_Classes.Heli helicopter1 = new Bottom_Classes.Heli(300, "Purchase", 
                25, 30.00, 600_000.00, 6, "United", "JFK"
                , "6:00AM", "10:00AM");
        Bottom_Classes.Dirigible dirigible1 = new Bottom_Classes.Dirigible(500, "Purchase", 
                30.00, 600_000.00, 45_000.00, 300,
                "Delta", "RDU", "6:00AM", "10:00AM");
        Bottom_Classes.Hot_Air_Balloon hotAirBalloon = new Bottom_Classes.Hot_Air_Balloon(2000,
                "Purchase", 30.00,
                25, 600_000.00, 8, "Delta", "RDU", 
                "6:00AM", "10:00AM");

        Transportation[] air_list = new Transportation[4];
        air_list[0] = plane1;
        air_list[1] = helicopter1;
        air_list[2] = dirigible1;
        air_list[3] = hotAirBalloon;

        System.out.println("What type of transportation do you want to use: land, air, or water?");
        Scanner trans_type = new Scanner(System.in);
        String user_input = trans_type.nextLine();

        if (user_input.equalsIgnoreCase("land")){
            System.out.println();
        }
        if (user_input.equalsIgnoreCase("air")){
            for (int i = 0; i < 4; i++) {
                    System.out.println(air_list[i].getClass()); //to get the name of the air trans.
                    System.out.println(air_list[i].toString()); //display info abt each class
                }
                System.out.println("Which transportation would you like to purchase?");
                Scanner user_ticket = new Scanner(System.in);
                String user_input2 = user_ticket.nextLine();

                if (user_input2.equalsIgnoreCase("plane")) {
                    System.out.println("Are you sure you want a plane ticket?");
                    Scanner verify_choice = new Scanner(System.in);
                    String user_input3 = verify_choice.nextLine();
                    if (user_input3.equalsIgnoreCase("yes")) {
                        System.out.println(plane1.get_arrival_info());
                        System.out.println("How many tickets would you like to purchase?");
                        Scanner num_tickets = new Scanner(System.in);
                        int user_input4 = num_tickets.nextInt();
                        System.out.println(plane1.get_payment_info(user_input4));
                        cont_loop=false;
                    }
                    else{cont_loop=true;}
                }
                if (user_input2.equalsIgnoreCase("helicopter")) {
                    System.out.println("Are you sure you want a helicopter ticket?");
                    Scanner verify_choice = new Scanner(System.in);
                    String user_input3 = verify_choice.nextLine();
                    if (user_input3.equalsIgnoreCase("yes")) {
                        System.out.println(plane1.get_arrival_info());
                        System.out.println("How many tickets would you like to purchase?");
                        Scanner num_tickets = new Scanner(System.in);
                        int user_input4 = num_tickets.nextInt();
                        System.out.println(heli1.get_payment_info(user_input4));
                    }
                }
                if (user_input2.equalsIgnoreCase("dirigible")) {
                    System.out.println("Are you sure you want a dirigible ticket?");
                    Scanner verify_choice = new Scanner(System.in);
                    String user_input3 = verify_choice.nextLine();
                    if (user_input3.equalsIgnoreCase("yes")) {
                        System.out.println(plane1.get_arrival_info());
                        System.out.println("How many tickets would you like to purchase?");
                        Scanner num_tickets = new Scanner(System.in);
                        int user_input4 = num_tickets.nextInt();
                        System.out.println(dirigible1.get_payment_info(user_input4));
                    }
                    if (user_input3.equalsIgnoreCase("no")) {
                        System.out.println("Which transportation would you like to purchase?");
                        Scanner change_trans = new Scanner(System.in);
                        String user_input5 = change_trans.nextLine();
                        if (user_input5.equalsIgnoreCase("plane")) {
                        }
                    }
                }
            }
        }
        if (user_input.equalsIgnoreCase("water")){
            System.out.println();
        }



    }
}
