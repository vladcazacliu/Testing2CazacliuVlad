package laborator1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CSVWriter {
    private static final String SAMPLE_CSV_FILE = "student.csv";
    public static void main(String[] args) {

        try(
                BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE), StandardOpenOption.CREATE_NEW);
                CSVPrinter csvPrinter = new CSVPrinter(bufferedWriter, CSVFormat.DEFAULT
                        .withHeader("Name", "Email", "Phone", "Country", "Location", "Specialitatea", "Universitatea", "age"))
        ){
            csvPrinter.printRecord("Avram Daniel", "daniel@avram.com", "+373 78 43 23 54", "Moldova", "Chisinau", "IT"
                    , "USM",  "18");


            csvPrinter.flush();


        }catch (Exception e){

        }
    }
}
