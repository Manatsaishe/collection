
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class EmployeeListSorted {
    public static void main(String[] args) {
        TreeSet<String> employees = new TreeSet<>();

        // Reading the file and storing employees in the TreeSet
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line); // Assuming each line contains an employee name
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Printing the size of the collection
        System.out.println("Size of the collection: " + employees.size());

        // Printing the contents of the TreeSet (automatically sorted)
        System.out.println("Contents in alphabetical order:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}