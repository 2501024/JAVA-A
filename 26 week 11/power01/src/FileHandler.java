import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler implements Constants{

    protected ArrayList<Customer> readData(File file) {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(file, StandardCharsets.UTF_8);
            String line;
            while (fileScanner.hasNextLine()) {
                line = fileScanner.nextLine();
                line = line.trim().replaceAll(",", "");
                Scanner lineScanner = new Scanner(line);
                String customID = lineScanner.next();
                Customer customer;
                if (customID.charAt(0) == '9')
                    customer = new Special(lineScanner.next(), customID, lineScanner.nextInt());
                else
                    customer = new Normal(lineScanner.next(), customID, lineScanner.nextInt());
                customers.add(customer);
                lineScanner.close();
            }
            fileScanner.close();
            if (customers.isEmpty()) {
                System.out.println("데이터가 없습니다.");
                System.exit(-1);
            } else {
                System.out.printf("%d개의 데이터를 읽었습니다.\n", customers.size());
            }
        }  catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return customers;

    }
}