import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookService {


    public enum IOService{
        FILE_IO, DB_IO,REST_IO
    }
    public List<AddressBook> addressBooks = new ArrayList<>();
    public AddressBookService() {}

    public AddressBookService(List<AddressBook> addressBooks) {
    }
    public static void main(String args[]){
        ArrayList<AddressBook> addressBooks = new ArrayList<>();
        AddressBookService addressBookService = new AddressBookService(addressBooks);
        Scanner consoleInputReader = new Scanner(System.in);

    }

    public void writeAddressBookData(IOService fileIo) {
        new AddressBookIOService().writeData(addressBooks);
    }
    public long countEntries(IOService fileIO){
        return new AddressBookIOService().countDataEntries();

    }

}
