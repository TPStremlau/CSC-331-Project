import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // initialize air instances
        Bottom_Classes.Plane plane1 = new Bottom_Classes.Plane("Terminal 1", 25, 30.00,
                600_000.00, 200, 300.00, 300,
                "Delta", "RDU", "6:00AM", "10:00AM");
        Bottom_Classes.Heli helicopter1 = new Bottom_Classes.Heli(300,
                25, 30.00, 600_000.00, 6, "United", "JFK"
                , "6:00AM", "10:00AM");
        Bottom_Classes.Dirigible dirigible1 = new Bottom_Classes.Dirigible(500,
                30.00, 600_000.00, 45_000.00, 300,
                "Delta", "RDU", "6:00AM", "10:00AM");
        Bottom_Classes.Hot_Air_Balloon hotAirBalloon = new Bottom_Classes.Hot_Air_Balloon(2000, 30.00,
                25, 600_000.00, 8, "Delta", "RDU",
                "6:00AM", "10:00AM");

        // initialize land instances
        Bottom_Classes.Car car = new Bottom_Classes.Car(10, 200,
                120, 6, "Diesel", 4);
        Bottom_Classes.Train train = new Bottom_Classes.Train(30, 20_000,
                180, 120, "Electric", "Hamburg Station");
        Bottom_Classes.Bus bus = new Bottom_Classes.Bus(20, 2000, 60,
                40, "Biodiesel", "Rigel Road Stop");
        Bottom_Classes.Bike bike = new Bottom_Classes.Bike(50, 10,
                20, 1, "None", "UNCW Bike Store");

        // initialize water instances
        Bottom_Classes.Boat boat = new Bottom_Classes.Boat(200, "Dock C", "5 min",
                "West View Yacht Center", 20, 500, 40,
                12);
        Bottom_Classes.Submarine sub = new Bottom_Classes.Submarine(200, "Dock A", "50min",
                "Carolina Yacht Club", 4000, 1_200_000, 35, 40);
        Bottom_Classes.Ship ship = new Bottom_Classes.Ship("Large", "Dock G", "2 Days",
                "Hamburg Port", 500, 2_000_000, 50, 5000);

        Transportation[] air_list = new Transportation[4];
        air_list[0] = plane1;
        air_list[1] = helicopter1;
        air_list[2] = dirigible1;
        air_list[3] = hotAirBalloon;

        Transportation[] land_list = new Transportation[4];
        land_list[0] = car;
        land_list[1] = train;
        land_list[2] = bus;
        land_list[3] = bike;

        Transportation[] water_list = new Transportation[3];
        water_list[0] = boat;
        water_list[1] = sub;
        water_list[2] = ship;

        System.out.println("Here are all the options:");
        print_lists(air_list,land_list,water_list);

        boolean cont_loop = true;

        while (cont_loop) {
            System.out.println("What type of transportation do you want to use: land, air, or water?");
            Scanner trans_type = new Scanner(System.in);
            String user_input = trans_type.nextLine();

            if (user_input.equalsIgnoreCase("land")) {
                print_specific_list(land_list);
                System.out.println();
            }
            if (user_input.equalsIgnoreCase("air")) {
                print_specific_list(air_list);
                System.out.println("Which transportation would you like to purchase?");
                Scanner user_ticket = new Scanner(System.in);
                String user_input2 = user_ticket.nextLine();

                if (user_input2.equalsIgnoreCase("plane")) {
                    System.out.println(plane1.toString());
                    cont_loop = get_air_info(user_input2, plane1);
                }
                if (user_input2.equalsIgnoreCase("helicopter")) {
                    System.out.println(helicopter1.toString());
                    cont_loop = get_air_info(user_input2, helicopter1);
                }
                if (user_input2.equalsIgnoreCase("dirigible")) {
                    System.out.println(dirigible1.toString());
                    cont_loop = get_air_info(user_input2, dirigible1);
                }
                if (user_input2.equalsIgnoreCase("hot air balloon")) {
                    System.out.println(hotAirBalloon.toString());
                    cont_loop = get_air_info(user_input2, hotAirBalloon);
                }
            }

            if (user_input.equalsIgnoreCase("water")) {
                print_specific_list(water_list);
                System.out.println();
            }


        }
    }

    public static boolean get_air_info(String user_choice, Air_Transportation user_class) {
        System.out.println("Are you sure you want a " + user_choice + " ticket?");
        Scanner verify_choice = new Scanner(System.in);
        String user_input3 = verify_choice.nextLine();
        if (user_input3.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to rent or purchase a ticket?");
            Scanner rent_purchase = new Scanner(System.in);
            String user_input5 = rent_purchase.nextLine();
            System.out.println("How many tickets would you like to purchase?");
            Scanner num_tickets = new Scanner(System.in);
            int user_input4 = num_tickets.nextInt();
            System.out.println(user_class.get_payment_info(user_input4, user_input5));
            System.out.println(user_class.get_arrival_info());

            return false;

        }
        return (true);
    }

    public static void print_lists(Transportation[] air_list, Transportation[] land_list, Transportation[] water_list) {
        System.out.println("\nHere are the Air transportation methods:");
        for (Transportation air_transportation : air_list) {
            System.out.println(air_transportation.getName());
            System.out.println(air_transportation);
        }
        ;

        System.out.println("\nHere are the Land transportation methods:");
        for (Transportation land_transportation : land_list) {
            System.out.println(land_transportation.getName());
            System.out.println(land_transportation);
        }
        ;

        System.out.println("\nHere are the Water transportation methods:");
        for (Transportation water_transportation : water_list) {
            System.out.println(water_transportation.getName());
            System.out.println(water_transportation);
        }
        ;
    }

    public static void print_specific_list(Transportation[] specific_list) {
        for (Transportation transportation : specific_list) {
            System.out.println(transportation.getName());
            System.out.println(transportation);
        }
    }
}





