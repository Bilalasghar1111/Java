public class BA002 {
    public static void main(String[] args) {
//        What is the purpose of the final keyword in Java?
/*
The final keyword in Java is used to define entities that cannot be changed.
It can be applied to variables, methods, and classes. When applied to a variable,
it makes the variable a constant, and when applied to a method, it prevents method overriding
in subclasses. When applied to a class, it indicates that the class cannot be extended.
 */

//        Write a Java program to find the Fibonacci series up to a given number.
/*


        int limit = 10; // replace with your limit
        System.out.println("Fibonacci series up to " + limit + ":");
        printFibonacciSeries(limit);
    }

    private static void printFibonacciSeries(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

 */

//        Explain the difference between HashMap and Hashtable in Java.

      /*
        HashMap and Hashtable are both implementations of the Map interface in Java,
        but there are some differences. HashMap is not synchronized, which means it is not thread-safe.
        On the other hand, Hashtable is synchronized, making it thread-safe but potentially slower
        in a multithreaded environment. Additionally, HashMap allows null values and one null key,
        while Hashtable does not allow any null values or keys.
    */

//        What is the purpose of the enum keyword in Java?
        /*
        The enum keyword in Java is used to define a special type of class that represents
        a fixed set of constants. Enumerations (enums) are often used to define a collection
        of related named constants. Each constant in the enum type is implicitly public, static,
        and final. Enumerations are more type-safe and provide better code readability compared to
        using integers or strings to represent constants.
         */

//        Write a Java program to sort an array of integers using the bubble sort algorithm.
/*
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(array);

        // Perform bubble sort
        bubbleSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
 */



    }

}


