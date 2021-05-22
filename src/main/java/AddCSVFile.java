import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.opencsv.bean.CsvBindByName;
public class AddCSVFile {
    public static void main(String[]args){
        try {
            Reader reader = Files
                    .newBufferedReader(Paths.get("C:\\Users\\tanya\\Downloads\\AddressBook.csv"));

            CSVReader csvReader = new CSVReader(reader);
            String records[];
            while ((records = csvReader.readNext()) != null) {
                for (String record : records) {
                    System.out.println(record);
                }
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
