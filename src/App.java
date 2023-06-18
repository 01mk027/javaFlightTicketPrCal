import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Defining variables and create instance of Scanner class
        int distance, age;
        int flightType;
        double pricePerKm = 0.1, totalPrice;
        Scanner input = new Scanner(System.in);
        
        //Getting values of variables from user by keyboard
        System.out.println("Enter amount of the distance you want travel (in km's):");
        distance = input.nextInt();

        System.out.println("Enter your age: ");
        age = input.nextInt();


        System.out.println("Enter the type of flight: ");
        System.out.println("Type 1 for one-side flight");
        System.out.println("Type 2 for two-side flight");
        flightType = input.nextInt();
        totalPrice = distance * pricePerKm;
        if((distance > 0) && (age >= 0) && (flightType == 1 || flightType == 2))
        {
            //Apply age discounts
            if(age < 12)
            {
                totalPrice = totalPrice / 2;
                System.out.println("Age discount: ");
            }
            else if(age>=12 && age<=24)
            {
                totalPrice = totalPrice - (totalPrice * 0.1);
            }
            else if(age > 65)
            {
                totalPrice = totalPrice - (totalPrice * 0.3);
            }

            //Apply two-side ticket discount
            if(flightType == 2)
            {
                totalPrice = (totalPrice - (totalPrice * 0.2)) * 2;
            }

            System.out.println("Total price = " + totalPrice);

        }
        else{
            System.out.println("Please enter valid entries...");
        }

        
    
    }
}
