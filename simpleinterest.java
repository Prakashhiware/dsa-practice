public class simpleinterest {

    public static void main(String args[]){
        double principal = 2000; // Principal amount
        double rate = 10; // Rate of interest
        double time = 3; // Time in years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("Simple Interest: " + simpleInterest);
    }
}