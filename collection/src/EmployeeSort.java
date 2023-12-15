
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        System.out.println("Size of the collection: " + employees.size());
        Collections.sort(employees, Collections.reverseOrder());

        System.out.println("Contents in descending order:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
