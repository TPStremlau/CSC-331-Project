import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        // initialize air instances
        Bottom_Classes.Plane plane1 = new Bottom_Classes.Plane("Terminal 1", 25,
                30.00, 400, 200_000, 300.00, 300,
                "Delta", "RDU", "6:00AM", "8:00AM");

        Bottom_Classes.Heli helicopter1 = new Bottom_Classes.Heli(300,
                60, 5000, 80, 6, "United", "JFK"
                , "10:00AM", "3:00PM");

        Bottom_Classes.Dirigible dirigible1 = new Bottom_Classes.Dirigible(500,
                30.00, 6000, 50, 15,
                "Lufthansa", "ILM", "6:00AM", "4:00PM");

        Bottom_Classes.Hot_Air_Balloon hotAirBalloon = new Bottom_Classes.Hot_Air_Balloon(2000,
                30.00, 2000, 15, 8, "Air_Adventures",
                "HAM", "8:00AM", "9:00PM");


        // initialize land instances
        Bottom_Classes.Car car = new Bottom_Classes.Car(20, 200,
                120, 6, "Diesel", 4, "Hertz",
                "8:00AM");

        Bottom_Classes.Train train = new Bottom_Classes.Train(30, 20_000,
                180, 120, "Electric", "Hamburg Station",
                "10:00AM");

        Bottom_Classes.Bus bus = new Bottom_Classes.Bus(20, 2000, 60,
                40, "Biodiesel", "Rigel Road Stop", "12:00PM");

        Bottom_Classes.Bike bike = new Bottom_Classes.Bike(0, 10,
                20, 1, "None", "UNCW Bike Store", "2:00PM");


        // initialize water instances
        Bottom_Classes.Boat boat = new Bottom_Classes.Boat(200, "Dock C", "5 min",
                "West View Marina", "6:00AM", 20, 500, 40,
                12);

        Bottom_Classes.Submarine sub = new Bottom_Classes.Submarine(200, "Dock A", "50min",
                "Carolina Yacht Club",  "8:00AM", 4000, 1_200_000,
                35, 40);

        Bottom_Classes.Ship ship = new Bottom_Classes.Ship("Large", "Dock G", "2 Days",
                "Hamburg Port", "12:00PM", 500, 2_000_000,
                50, 5000);

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

        print_lists(air_list, land_list, water_list);

        Scanner user_transportation = new Scanner(System.in);

        String user_vehicle = null;

        boolean cont_loop = true;

        while (cont_loop) {
            System.out.println("\nWhat type of transportation do you want to use? (Air,Land,Water)");
            Scanner trans_type = new Scanner(System.in);
            String trans_type_choice = trans_type.nextLine();

            switch (trans_type_choice.toLowerCase()) {
                case "land":
                    print_specific_list(land_list);
                    System.out.println("Which transportation would you like to purchase? (Car/Bus/Train/Bike)");
                    user_vehicle = user_transportation.nextLine();

                    switch (user_vehicle.toLowerCase()) {
                        case "car":
                            System.out.println("Here is information about the Car:");
                            System.out.println(car);
                            cont_loop = get_info(user_vehicle, car);
                            break;

                        case "bus":
                            System.out.println("Here is information about the Bus:");
                            System.out.println(bus);
                            cont_loop = get_info(user_vehicle, bus);
                            break;

                        case "train":
                            System.out.println("Here is information about the Train:");
                            System.out.println(train);
                            cont_loop = get_info(user_vehicle, train);
                            break;

                        case "bike":
                            System.out.println("Here is information about the Bike:");
                            System.out.println(bike);
                            cont_loop = get_info(user_vehicle, bike);
                            break;

                        default:
                            System.out.println("Invalid input: Try Again!");
                    }
                    break;

                case "air":
                    print_specific_list(air_list);
                    System.out.println("Which transportation would you like to purchase? " +
                            "(Plane/Helicopter/Dirigible/Hot Air Balloon)");
                    user_vehicle = user_transportation.nextLine();

                    switch (user_vehicle.toLowerCase()) {
                        case "plane":
                            System.out.println("Here is information about the Plane:");
                            System.out.println(plane1);
                            cont_loop = get_info(user_vehicle, plane1);
                            break;

                        case "helicopter":
                            System.out.println("Here is information about the Helicopter:");
                            System.out.println(helicopter1);
                            cont_loop = get_info(user_vehicle, helicopter1);
                            break;

                        case "dirigible":
                            System.out.println("Here is information about the Dirigible:");
                            System.out.println(dirigible1);
                            cont_loop = get_info(user_vehicle, dirigible1);
                            break;

                        case "hot air balloon":
                            System.out.println("Here is information about the Hot Air Balloon:");
                            System.out.println(hotAirBalloon);
                            cont_loop = get_info(user_vehicle, hotAirBalloon);
                            break;

                        default:
                            System.out.println("Invalid input: Try Again!");
                    }
                    break;

                case "water":
                    print_specific_list(water_list);
                    System.out.println("Which transportation would you like to purchase? (Boat/Submarine/Ship)");
                    user_vehicle = user_transportation.nextLine();

                    switch (user_vehicle.toLowerCase()) {
                        case "boat":
                            System.out.println("Here is information about the Boat:");
                            System.out.println(boat);
                            cont_loop = get_info(user_vehicle, boat);
                            break;

                        case "submarine":
                            System.out.println("Here is information about the Submarine:");
                            System.out.println(sub);
                            cont_loop = get_info(user_vehicle, sub);
                            break;

                        case "ship":
                            System.out.println("Here is information about the Ship:");
                            System.out.println(ship);
                            cont_loop = get_info(user_vehicle, ship);
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
        System.out.println("Are you sure you want to use a " + user_choice + " for your travels?(Yes/No)");
        Scanner verify_choice = new Scanner(System.in);
        String affirm_ticket = verify_choice.nextLine();

        if (affirm_ticket.equalsIgnoreCase("yes")) {

            int ticket_amount = 1; // set ticket amount default to 1 in case user is renting

            String rent_or_purchase = null;

            System.out.println("How many people are you travelling with?");
            Scanner num_tickets = new Scanner(System.in);
            ticket_amount = num_tickets.nextInt();

            while (ticket_amount > user_class.getNumPassengers() || ticket_amount < 1) {
                if (ticket_amount < 1) {
                    System.out.print("\nEnter a value greater than or equal to 1: ");

                } else {
                    System.out.print("\nThis vehicle can only hold: " + user_class.getNumPassengers() +
                            "\nEnter a different number: ");
                }

                num_tickets = new Scanner(System.in);
                ticket_amount = num_tickets.nextInt();
            }

            System.out.println("Do you want to rent the whole vehicle or " +
                    "purchase a ticket for a seat?\n(Rent/Purchase)");
            Scanner rent_purchase = new Scanner(System.in);
            rent_or_purchase = rent_purchase.nextLine();

            System.out.println(user_class.get_payment_info(ticket_amount, rent_or_purchase));
            System.out.println("\n"+user_class.get_arrival_info());

            return false;
        }
        return (true);
    }


    public static void print_lists(Transportation[] air_list, Transportation[] land_list, Transportation[] water_list) {
        System.out.println("\nHere are all Transportation options:");

        System.out.printf("\n|%-20s|", "Air Transportation");
        print_specific_list(air_list);

        System.out.printf("\n|%-20s|", "Land Transportation");
        print_specific_list(land_list);

        System.out.printf("\n|%-20s|", "Water Transportation");
        print_specific_list(water_list);

    }

    public static void print_specific_list(Transportation[] specific_list) {
        System.out.printf("\n|%-20s|%-20s|%-20s|%-20s|%-20s|\n",
                "Transportation:", "Ticket Price:", "Rental Price:", "Average Speed(mph):", "Passenger Amount:");
        for (Transportation transportation : specific_list) {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%n", transportation.getName(),
                    transportation.getPurchasePrice(), transportation.getRentalPrice(),
                    transportation.getAverageSpeed(), transportation.getNumPassengers()
            );
        }
        }
    }





