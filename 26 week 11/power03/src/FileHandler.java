import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileHandler implements Constants {

    protected ArrayList<Customer> readData(File file) {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i).trim().replaceAll(",", "");
                System.out.println(line);
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                System.out.printf("%s %s %s", tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());

                String customID = tokenizer.nextToken();
                Customer customer;
                if (customID.charAt(0) == '9') {
                    customer = new Special();
                    customer.setName(tokenizer.nextToken());
                    customer.setCustomID(customID);

                    customer.setPowerUsage(Integer.parseInt(tokenizer.nextToken()));
                } else {
                    customer = new Normal(tokenizer.nextToken(), customID, Integer.parseInt(tokenizer.nextToken()));
                    customer.setName(tokenizer.nextToken());
                    customer.setCustomID(customID);
                    customer.setPowerUsage(Integer.parseInt(tokenizer.nextToken()));
                }
                customers.add(customer);
            }
            if (customers.isEmpty()) {
                System.out.println("데이터가 없습니다.");
                System.exit(-1);
            } else {
                System.out.printf("%d개의 데이터를 읽었습니다.\n", customers.size());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return customers;

    }
}