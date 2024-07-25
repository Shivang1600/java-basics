public class StaticVsInstanceMethods {
    public static void main(String[] args) {
        // Call static method
        printStaticMessage();

        // Create an instance of the class
        StaticVsInstanceMethods obj = new StaticVsInstanceMethods();

        // Call instance method
        obj.printInstanceMessage();
    }


    // Static method
    public static void printStaticMessage() {
        System.out.println("This is a static method.");
    }

    // Instance method
    public void printInstanceMessage() {
        System.out.println("This is an instance method.");
    }

}
