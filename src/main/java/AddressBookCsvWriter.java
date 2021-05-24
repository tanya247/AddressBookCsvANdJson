
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AddressBookCsvWriter {

    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV file header

    public static void writeCsvFile(String fileName) {

        //Create new students objects
       ArrayList<AddressBook>addressBooks = new ArrayList<>();
        //Create a new list of student objects
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(addressBooks.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file
            for (AddressBook addressBook : addressBooks) {
                fileWriter.append(addressBook.getFirstName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(addressBook.getLastName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(addressBook.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(addressBook.getCity());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(addressBook.getState());
                fileWriter.append(NEW_LINE_SEPARATOR);
                fileWriter.append(addressBook.getEmail());
                fileWriter.append(NEW_LINE_SEPARATOR);
                fileWriter.append(String.valueOf(addressBook.getPhoneNo()));
                fileWriter.append(NEW_LINE_SEPARATOR);
                fileWriter.append(String.valueOf(addressBook.getZip()));
                fileWriter.append(NEW_LINE_SEPARATOR);


            }



            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }
}
