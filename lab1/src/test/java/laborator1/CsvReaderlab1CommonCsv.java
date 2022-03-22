package laborator1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CsvReaderlab1CommonCsv {
    private static final String SAMPLE_CSV_FILE = "student.csv";

    public static void main(String[] args) {
        try (
                Reader reader = new BufferedReader(new FileReader(SAMPLE_CSV_FILE));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim())
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String name = csvRecord.get(0);
                String email = csvRecord.get(1);
                String phone = csvRecord.get(2);
                String country = csvRecord.get(3);
                String location = csvRecord.get(4);
                String Specialitatea=csvRecord.get(5);
                String Universitatea=csvRecord.get(6);
                String age = csvRecord.get(7);

                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Name : " + name);
                System.out.println("Email : " + email);
                System.out.println("Phone : " + phone);
                System.out.println("Country : " + country);
                System.out.println("location : " + location);
                System.out.println("Specialitatea : " + Specialitatea);
                System.out.println("Universitatea : " + Universitatea);
                System.out.println("age : " + age);
                System.out.println("---------------\n\n");
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

}

