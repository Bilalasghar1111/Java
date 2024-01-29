import java.util.Scanner;
public class BA004 {
    public static void main(String[] args) {
        System.out.println("Java Variables");
//         Write a java program to add two numbers
//        int a = 10;
//        int b = 15;
//        int sum = a+b;
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("your first number is "+ a);
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Your Second Number is "+ b);
        int sum = a+b;
        System.out.println("The Sum of Two Numbers is  "+ sum);
        System.out.println("please Enter your name? ");
        String name = sc.nextLine();
        System.out.println("Good Evening "+ name);

        System.out.println(" * \n ** \n *** \n **** \n ***** ");

        int q = 1;
        while (q <= 10){
            System.out.println(q);
            q += 1;
        }






    }
}
