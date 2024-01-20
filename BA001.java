public class BA001 {
    public static void main(String[] args) {
//        Write a Java program to print "Hello, World!" to the console.
//        System.out.println("Hello World");

//        Write a Java program to find the sum of all even numbers from 1 to 100.
//        int sum = 0;
//        for (int i = 2; i <= 100; i += 2) {
//            sum += i;
//        }
//        System.out.println("Sum of even numbers from 1 to 100: " + sum);

//        Write a Java program to check if a number is prime.
//        int num = 17; // replace with your number to check
//        boolean isPrime = true;
//
//        if (num <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(num + " is a prime number.");
//        } else {
//            System.out.println(num + " is not a prime number.");
//        }

//        Write a Java program to reverse a string.
//        String original = "Hello, World!";
//        String reversed = new StringBuilder(original).reverse().toString();
//        System.out.println("Original: " + original);
//        System.out.println("Reversed: " + reversed);

//        Write a Java program to find the factorial of a number using recursion.
//        int num2 = 5; // replace with your number
//        long factorial = calculateFactorial(num2);
//        System.out.println("Factorial of " + num2 + " is: " + factorial);
//    }

//    private static long calculateFactorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * calculateFactorial(n - 1);
//        }

//        Write a Java program to implement a simple calculator using methods.
        double num1 = 10.5;
        double num2 = 5.2;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Not a Number
        }

    }
}
