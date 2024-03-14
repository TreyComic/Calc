import java.util.Scanner;
public class Math {
    public static void main(String[] args){

        //Create a scanner
        Scanner scanner = new Scanner(System.in);

        //What is the item name?
        System.out.println("Enter item name: ");
        String Name = scanner.nextLine();

        //prompt for our Price
        System.out.println("Enter item price: ");
        Float price = scanner.nextFloat();



        //how many items?
        System.out.println("Enter item quantity: ");
        Float qty = scanner.nextFloat();

        //How far
        System.out.println("Enter distance for delivery (Miles): ");
        Float miles = scanner.nextFloat();

        scanner.close();

        //calculate fees
        //float price = 5.25f;
        //float qty = 9.0f;
        //float miles = 10.0f;
        Float fee = 0.0f;
        if(miles <= 4.0f){
            fee += 2.0f;
        }
        if(miles >= 5.0f && miles <= 15.0f){
            fee += 5.0f;
        }
        if(miles >= 16.0f && miles <= 25.0f){
            fee += 10.0f;
        }
        if(miles >= 26.0f && miles <= 50.0f){
            fee += 15.0f;
        }
        if(miles > 50.0f){
            fee += 20.0f;
        }
        float total = (price *  qty) + fee;
        System.out.println("$" + total);
    }
}
