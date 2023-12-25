package project1;
public class TypeCasting{
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int intValue = 9;
        long longValue = intValue; 
        float floatValue = longValue; 
        double doubleValue = floatValue; 

        System.out.println("Implicit Type Casting:");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double bigDouble = 26.12;
        float smallFloat = (float) bigDouble; 
        long bigLong = (long) smallFloat; 
        int smallInt = (int) bigLong; 

        System.out.println("\nExplicit Type Casting:");
        System.out.println("double to float: " + smallFloat);
        System.out.println("float to long: " + bigLong);
        System.out.println("long to int: " + smallInt);
    }
}

