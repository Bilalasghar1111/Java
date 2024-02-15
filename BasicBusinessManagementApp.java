import java.util.Scanner;

public class BusinessManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Business Management System");

        try {
            // Simulating a business process
            System.out.print("Enter the total sales for the month: ");
            double totalSales = scanner.nextDouble();

            // Simulating a business logic where division by zero could occur
            System.out.print("Enter the total number of products sold: ");
            int totalProductsSold = scanner.nextInt();

            double averageSalesPerProduct = totalSales / totalProductsSold;
            System.out.println("Average sales per product: " + averageSalesPerProduct);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Thank you for using Business Management System");
        }
    }
}
