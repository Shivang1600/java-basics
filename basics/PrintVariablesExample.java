public class PrintVariablesExample {
    public static void main(String[] args) {
        // Primitive types
        int age = 30;
        double salary = 85000.50;
        char initial = 'J';
        boolean isEmployee = true;

        // Reference types
        String name = "John Doe";
        String[] languages = {"Java", "Python", "C++"};

        // Directly print variables
        System.out.println("Age: " + age); // Prints: Age: 30
        System.out.println("Salary: " + salary); // Prints: Salary: 85000.5
        System.out.println("Initial: " + initial); // Prints: Initial: J
        System.out.println("Is employee: " + isEmployee); // Prints: Is employee: true

        // Print multiple variables
        System.out.println(name + " earns $" + salary + " per year.");
        // Prints: John Doe earns $85000.5 per year.

        // Print array elements
        System.out.print("Languages known: ");
        for (String language : languages) {
            System.out.print(language + " ");
        }
        System.out.println(); // New line

        // Using String formatting
        int numberOfLanguages = languages.length;
        System.out.printf("%s knows %d languages.%n", name, numberOfLanguages);
        // Prints: John Doe knows 3 languages.
    }
}
