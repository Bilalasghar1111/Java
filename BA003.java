import java.util.Arrays;
public class BA003 {
    public static void main(String[] args) {
//        Explain the concept of multithreading in Java.
        /*
        Multithreading in Java allows multiple threads to run concurrently within a single program.
        A thread is a lightweight subprocess, and multithreading is beneficial for improving the efficiency
        of programs by executing multiple tasks simultaneously. Threads share the same resources but run independently.
        In Java, multithreading can be achieved by extending the Thread class or implementing the Runnable interface.
         */


//        Write a Java program to find the common elements between two arrays.
/*
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8,2};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        findCommonElements(array1, array2);
    }

    private static void findCommonElements(int[] arr1, int[] arr2) {
        System.out.print("Common Elements: ");
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                    break;
                }
            }
        }
 */

//        Explain the concept of exception handling in Java.
/*
                Exception handling in Java is a mechanism to deal with runtime errors.
            When an exceptional event occurs during the execution of a program, it generates an exception.
            The Java exception handling mechanism involves the use of try, catch, throw, throws, and finally blocks.
            The try block contains the code that might throw an exception, and the catch block handles the exception.
            The finally block, if present, is executed regardless of whether an exception is thrown or not.
 */

//        What is the purpose of the package keyword in Java?
        /*
        The package keyword in Java is used to organize classes into namespaces.
        It helps in avoiding naming conflicts and provides a way to encapsulate related
        classes and interfaces. Packages are used to group related classes and make it easier to
        manage and maintain large codebases. The syntax to declare a package is: package
         */

//        Write a Java program to find the length of a string without using the built-in length() method.
/*
        String str = "Hello, Java!";
        int length = calculateLength(str);
        System.out.println("Length of the string: " + length);
    }

    private static int calculateLength(String s) {
        char[] charArray = s.toCharArray();
        int length = 0;
        for (char c : charArray) {
            length++;
        }
        return length;
 */

//        Explain the concept of method overriding in Java.
    /*
    Method overriding in Java occurs when a subclass provides a specific
    implementation for a method that is already defined in its superclass.
    The method in the subclass has the same signature (name, return type, and parameters)
    as the method in the superclass. Overriding allows a subclass to provide its own
    implementation for a method rather than using the one defined in the superclass.
     */

//        Write a Java program to check if a string is a palindrome.
/*
        String str = "madam"; // replace with your string
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
 */

//        Explain the super() keyword in Java.
        /*
        The super() keyword in Java is used to invoke the constructor of the immediate parent class.
        It is typically used within the constructor of a subclass to call the constructor of its
        superclass. If the super() keyword is not explicitly used, the compiler implicitly inserts a
        call to the no-argument constructor of the superclass.
         */

//        What is the purpose of the break statement in Java?
/*
           The break statement in Java is used to terminate the execution of a loop
           (for, while, or do-while) or a switch statement. When the break statement
           is encountered, the control flow exits the loop or switch, and the program
           continues with the statement following the loop or switch.
 */

//        Write a Java program to find the largest element in an array.
/*
        int[] array = {12, 45, 78, 23, 56, 89,39,99, 34};
        int max = findLargestElement(array);
        System.out.println("Largest element in the array: " + max);
    }

    private static int findLargestElement(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
 */



    }
}
