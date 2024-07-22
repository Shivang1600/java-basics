public class VariablesAndDataTypes{
    public static void main(String[] args){
        System.out.println("Variables and Data Types:");
        System.out.println("Primitive Data Types");
        System.out.println("Java has eight primitive data types:");
        int num = 5;
        System.out.println("1. int: Used for integers (whole numbers) ex: "+ num +".");
        float f_num = 5.75f;
        System.out.println("2. float: Used for floating-point numbers (single precision) ex: "+ f_num +".");
        double d_num = 19.99;
        System.out.println("3. double: Used for floating-point numbers (double precision) ex: "+ d_num +".");
        char letter = 'A';
        System.out.println("4. char: Used for single characters ex: "+ letter +".");
        boolean isJavaFun = true;
        System.out.println("5. boolean: Used for true/false values. ex: "+ isJavaFun +".");
        byte b_num = 100;
        System.out.println("6. byte: Used for very small integers (8-bit) ex: "+ b_num +".");
        short s_num = 5000;
        System.out.println("7. short: Used for small integers (16-bit) ex: "+ s_num +".");
        long l_num = 15000000000L;
        System.out.println("8. long: Used for large integers (64-bit) ex: "+ l_num +".");
        System.out.println("");
        System.out.println("Reference Types");
        System.out.println("Reference types in Java refer to objects and arrays:");
        System.out.println("1. String: Represents a sequence of characters.");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("2. Arrays: Used to store multiple values in a single variable ex: "+ numbers[0] +".");
        System.out.println("3. Classes: Define the blueprint for objects.");
    }
}