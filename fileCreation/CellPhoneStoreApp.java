
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
//import javax.xml.bind.JAXB;

public class CellPhoneStoreApp {

    public  static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        while (true){
            Menu();
            System.out.println("? ");
            int response = input.nextInt();
            if (response == 1)
                {
                System.out.println("Creating objects and storing data in txt file.");
                createData();
                }
            else if (response == 2) {
                System.out.println("Reading data from text file...");
                readData();
            }
            else if (response == 3) {
                System.out.println("creating objects and store in XML file...");
               // createXMLFIle();
            }
            else if (response == 4) {
                System.out.println("Reading date from XML file...");
               // readXMLFile();
            }
            else if (response == 5){
                System.out.println("Good Bye!");
                break;}
        }
    }

    private static void Menu()
    {
               // display request options

        System.out.println(" \n Options:  ");
        System.out.println(" 1 - Create cell phones and write in text file  ");
        System.out.println(" 2 - Display cell phones from text file  ");
        System.out.println(" 3 - Create cell phones and write in xml file  ");
        System.out.println(" 4 - Display cell phones from xml file  ");
        System.out.println(" 5 - Exit");
    }
private static void createData()
{
    Formatter cellPhonelist = null;

    Cellphone[]  cellphones= new Cellphone[5];

    // create cellphone records
    cellphones[0] = new Cellphone("Pixel1", "Google", 899.99);
    cellphones[1] = new Cellphone( "11", "Apple", 499.99);
    cellphones[2] = new Cellphone("13", "Apple", 1009.99);
    cellphones[3] = new Cellphone( "S21", "Samsung", 600.00);
    cellphones[4] = new Cellphone( "Xperia", "Sony", 614.22);

    try {
        // file stream for output file
        cellPhonelist = new Formatter("cellphonelist.txt");

        for (int i = 0; i <cellphones.length; i++) {
            cellPhonelist.format("%s %s %.2f\n",
                    cellphones[i].getModel(), cellphones[i].getManufacturer(),
                    cellphones[i].getRetailprice());
        }
        System.out.println("Data is written into a txt file.");
    }
    catch (SecurityException securityException) {
        System.err.println(
                "You do not have write access to this file.");
        System.exit(1);
    }
    catch (FileNotFoundException fileNotFoundException) {
        System.err.println(
                "Error creating file.");
        System.exit(1);
    }
    catch (FormatterClosedException closedException) {
        System.err.println(
                "Error writing to file - file has been closed.");
        System.exit(1);
    }
    catch (IllegalFormatException formatException) {
        System.err.println("Error with output.");
        System.exit(1);
    }
    finally {
        if (cellPhonelist != null) {
            cellPhonelist.close();
        }
    }
}
/*
private static void createXMLFIle(){

     // create AccountRecords (Array List) object
    AccountRecords accounts = new AccountRecords();
    // adding AccountRecord object into accounts

    accounts.getAccounts().add(new AccountRecord(100, "Alan", "Jones", 348.17));
    accounts.getAccounts().add(new AccountRecord(300, "Mary", "Smith", 27.19));
    accounts.getAccounts().add(new AccountRecord(500, "Sam", "Sharp", 0.00));
    accounts.getAccounts().add(new AccountRecord(700, "Suzy", "Green", -14.22));

    // try to open file for serialization into XML file
    try(BufferedWriter output =
                Files.newBufferedWriter(Paths.get("accountsInfo.xml"))) {
        // write AccountList's XML to output
        JAXB.marshal(accounts, output);
        System.out.println("Data is written in XML file.");
    }
    catch (IOException ioException) {
        System.err.println("Error opening file. Terminating.");
    }
}

 */
private static void readData()
{
    // open accountMaster.txt, read its contents and close the file
    try(Scanner input = new Scanner(Paths.get("cellphonelist.txt"))) {
        System.out.printf("%-12s%-12s     %-12s     %n", "Model", "Manufacturer", "RetailPrice");


        // read record from file
        while (input.hasNext()) { // while there is more to read
            // display record contents
            System.out.printf("%-12s%-12s  %12.2f%n",
                    input.next(), input.next(), input.nextDouble());
        }
    }
    catch ( NoSuchElementException | IllegalStateException | IOException e) {
        //e.printStackTrace();
        System.out.println("Error: " + e.getMessage());
    }
}
/*
private static void readXMLFile()
{
    // try to open file for deserialization
    try(BufferedReader input =
                Files.newBufferedReader(Paths.get("accountsInfo.xml"))) {
        // unmarshal the file's contents
        AccountRecords accounts = JAXB.unmarshal(input, AccountRecords.class);

        // display contents
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");

        for (AccountRecord account : accounts.getAccounts()) {
            System.out.printf("%-10d%-12s%-12s%10.2f%n",
                    account.getAccount(), account.getFirstName(),
                    account.getLastName(), account.getBalance());
        }
    }
    catch (IOException ioException) {
        System.err.println("Error opening file.");
    }
}*/
}

