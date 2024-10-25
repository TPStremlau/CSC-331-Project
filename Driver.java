import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        // initialize air instances
        Bottom_Classes.Plane plane1 = new Bottom_Classes.Plane("Terminal 1", 25, 30.00,
                400, 200_000, 300.00, 300,
                "Delta", "RDU", "6:00AM", "10:00AM");
        Bottom_Classes.Heli helicopter1 = new Bottom_Classes.Heli(300,
                60, 5000, 80, 6, "United", "JFK"
                , "6:00AM", "10:00AM");
        Bottom_Classes.Dirigible dirigible1 = new Bottom_Classes.Dirigible(500,
                30.00, 6000, 50, 15,
                "Delta", "RDU", "6:00AM", "10:00AM");
        Bottom_Classes.Hot_Air_Balloon hotAirBalloon = new Bottom_Classes.Hot_Air_Balloon(2000, 30.00,
                2000, 15, 8, "Delta", "RDU",
                "6:00AM", "10:00AM");


        // initialize land instances
        Bottom_Classes.Car car = new Bottom_Classes.Car(20, 200,
                120, 6, "Diesel", 4, "Hertz",
                "8:00AM");

        Bottom_Classes.Train train = new Bottom_Classes.Train(30, 20_000,
                180, 120, "Electric", "Hamburg Station",
                "10:00AM");

        Bottom_Classes.Bus bus = new Bottom_Classes.Bus(20, 2000, 60,
                40, "Biodiesel", "Rigel Road Stop", "12:00PM");

        Bottom_Classes.Bike bike = new Bottom_Classes.Bike(50, 10,
                20, 1, "None", "UNCW Bike Store", "2:00PM");


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
        print_lists(air_list, land_list, water_list);

        Scanner user_transportation = new Scanner(System.in);

        String user_vehicle = null;

        boolean cont_loop = true;

        while (cont_loop) {
            System.out.println("What type of transportation do you want to use: land, air, or water?");
            Scanner trans_type = new Scanner(System.in);
            String trans_type_choice = trans_type.nextLine();

            switch (trans_type_choice.toLowerCase()) {
                case "land":
                    print_specific_list(land_list);
                    System.out.println("Which transportation would you like to purchase?(Car/Bus/Train/Bike)");
                    user_vehicle = user_transportation.nextLine();

                    switch (user_vehicle.toLowerCase()) {
                        case "car":
                            System.out.println(car);
                            cont_loop = get_info(user_vehicle, car);
                            break;

                        case "bus":
                            System.out.println(bus.toString());
                            cont_loop = get_info(user_vehicle, bus);
                            break;

                        case "train":
                            System.out.println(train.toString());
                            cont_loop = get_info(user_vehicle, train);
                            break;

                        case "bike":
                            System.out.println(bike.toString());
                            cont_loop = get_info(user_vehicle, bike);
                            break;

                        default:
                            System.out.println("Invalid input: Try Again!");
                    }
                    break;

                case "air":
                    print_specific_list(air_list);
                    System.out.println("Which transportation would you like to purchase?" +
                            "(Plane/Helicopter/Dirigible/Hot Air Balloon");
                    user_vehicle = user_transportation.nextLine();

                    switch (user_vehicle.toLowerCase()) {
                        case "plane":
                            System.out.println(plane1.toString());
                            cont_loop = get_info(user_vehicle, plane1);
                            break;

                        case "helicopter":
                            System.out.println(helicopter1.toString());
                            cont_loop = get_info(user_vehicle, helicopter1);
                            break;

                        case "dirigible":
                            System.out.println(dirigible1.toString());
                            cont_loop = get_info(user_vehicle, dirigible1);
                            break;

                        case "hot air balloon":
                            System.out.println(hotAirBalloon.toString());
                            cont_loop = get_info(user_vehicle, hotAirBalloon);
                            break;

                        default:
                            System.out.println("Invalid input: Try Again!");
                    }
                    break;

                case "water":
                    print_specific_list(water_list);
                    System.out.println("Which transportation would you like to purchase?(Boat/Submarine/Ship)");
                    user_vehicle = user_transportation.nextLine();

                    switch (user_vehicle.toLowerCase()) {
                        case "boat":
                            System.out.println(boat.toString());
                            cont_loop = get_info(user_vehicle, plane1);
                            break;

                        case "submarine":
                            System.out.println(sub.toString());
                            cont_loop = get_info(user_vehicle, helicopter1);
                            break;

                        case "ship":
                            System.out.println(ship.toString());
                            cont_loop = get_info(user_vehicle, dirigible1);
                            break;

                        default:
                            System.out.println("Invalid input: Try Again!");

                    }
                    break;

                default:
                    System.out.println("Invalid input: Try Again!");
            }
        }

        System.out.println("Thank you for using the Wilmington Travel Center!");
    }
    public static boolean get_info(String user_choice, Transportation user_class){
        System.out.println("Are you sure you want a " + user_choice + " ticket?");
        Scanner verify_choice = new Scanner(System.in);
        String affirm_ticket = verify_choice.nextLine();

        if (affirm_ticket.equalsIgnoreCase("yes")) {

            System.out.println("Do you want to rent the vehicle or purchase a ticket for a seat?\n(Rent/Purchase)");
            Scanner rent_purchase = new Scanner(System.in);
            String rent_or_purchase = rent_purchase.nextLine();
            int ticket_amount = 1; // set ticket amount default to 1 in case user is renting

            if (rent_or_purchase.equalsIgnoreCase("purchase")) {
                System.out.println("How many tickets would you like to purchase?");
                Scanner num_tickets = new Scanner(System.in);
                ticket_amount = num_tickets.nextInt();

                while (ticket_amount > user_class.getNumPassengers() || ticket_amount < 1) {
                    if (ticket_amount < 1) {
                        System.out.print("Enter a value greater than or equal to 1!");

                    } else {
                        System.out.print("You are requesting more tickets then there are seats.");
                    }

                    num_tickets = new Scanner(System.in);
                    ticket_amount = num_tickets.nextInt();
                }
            }

            System.out.println(user_class.get_payment_info(ticket_amount, rent_or_purchase));
            System.out.println(user_class.get_arrival_info());

            return false;

        }
        return (true);
    }


    public static void print_lists(Transportation[] air_list, Transportation[] land_list, Transportation[] water_list) {
        System.out.println("\nHere are the Air transportation methods:\n");
        for (Transportation air_transportation : air_list) {
            System.out.println("|" + air_transportation.getName() + " Info|");
            System.out.println(air_transportation);
        }
        ;

        System.out.println("\nHere are the Land transportation methods:\n");
        for (Transportation land_transportation : land_list) {
            System.out.println("|" + land_transportation.getName() + " Info|");
            System.out.println(land_transportation);
        }
        ;

        System.out.println("\nHere are the Water transportation methods:\n");
        for (Transportation water_transportation : water_list) {
            System.out.println("|" + water_transportation.getName() + " Info|");
            System.out.println(water_transportation);
        }
        ;
    }

    public static void print_specific_list(Transportation[] specific_list) {
        for (Transportation transportation : specific_list) {
            System.out.println("Here is the information for: " + transportation.getName());
            System.out.println("|" + transportation.getName() + " Info|");
            System.out.println(transportation);
        }
    }
}




