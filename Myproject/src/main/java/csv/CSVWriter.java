package csv;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class CSVWriter {
    private static final String SAMPLE_CSV_FILE = "new_users2.csv";

    public static void main(String[] args) throws IOException {
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE), StandardOpenOption.CREATE_NEW);

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("ID", "Name", "Designation", "Company","Age"))
        ) {
            csvPrinter.printRecord("1", "Sundar Pichai ♥", "CEO", "Google","34");
            csvPrinter.printRecord("2", "Satya Nadella", "CEO", "Microsoft","24");
            csvPrinter.printRecord("3", "Tim cook", "CEO", "Apple","25");
            csvPrinter.printRecord(Arrays.asList("4", "Mark Zuckerberg", "CEO", "Facebook","30"));
            csvPrinter.printRecord(Arrays.asList("5", "Mark j", "CEO", "Facebook","35"));

            csvPrinter.flush();
        }
    }
}
