
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeHashSet {
    public static void main(String[] args) {
        Set<String> employees = new HashSet<>();
        String fileName = "employee_names.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("Size of the collection: " + employees.size());

        System.out.println("\nUsing for-each loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
