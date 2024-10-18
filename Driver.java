import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Plane plane1 = new Plane("plane","purchase",1000.99,0.00,
                575.00,700, "AirlineName","AirportName",12);

        Transportation[] air_list = new Transportation[4];
        air_list[0] = plane1;
        air_list[1] = helicopter1;
        air_list[2] = dirigible1;
        air_list[3] = hot_air_balloon;

        System.out.println("What type of transportation do you want to use: land, air, or water?");
        Scanner trans_type = new Scanner(System.in);
        String user_input = trans_type.nextLine();

        if (user_input.equalsIgnoreCase("land")){
            System.out.println();
        }
        if (user_input.equalsIgnoreCase("air")){
            for (int i =0; i<4; i++){
                System.out.println(air_list[i].toString());
            }
        }
        if (user_input.equalsIgnoreCase("water")){
            System.out.println();
        }



    }
}
