public class Math {
    public static void main(String[] args){

        //calculate fees
        float price = 5.0f;
        float qty = 20.0f;
        float miles = 10.0f;
        float fee = 0.0f;
        float total = price + qty + miles + fee;
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
        System.out.println("$" + total);
    }
}
