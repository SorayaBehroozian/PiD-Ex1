import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Start {

   private static final String SAMPLE_CSV_FILE_PATH = "animals.csv";

    public static void main(String[] args) throws IOException {

        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        ) {
            CsvToBean<Animal> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Animal.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<Animal> csvUserIterator = csvToBean.iterator();

            while (csvUserIterator.hasNext()) {
                Animal csvUser = csvUserIterator.next();
                System.out.println("Name : " + csvUser.getName());
                System.out.println("Email : " + csvUser.getType());
                System.out.println("PhoneNo : " + csvUser.getBirthYear());
               // System.out.println("Country : " + csvUser.getCountry());
                System.out.println("==========================");
            }
        }
    }



}