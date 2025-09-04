public class PrimeCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            System.exit(1);
        }
        
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            System.exit(1);
        }

        boolean isPrime = true;

        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
