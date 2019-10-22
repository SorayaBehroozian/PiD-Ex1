import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;

public class WriteCSV {

    public static void writeDataLineByLine(String CSV) {
        // first create file object for file placed at location
        // specified by filepath(CSV)
        File file = new File(CSV);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);


            // adding header to csv
            String[] header = {"Type", "Name", "Birth Year"};
            writer.writeNext(header);

            // add data to csv
            String[] data1 = {"golden retriever", "lucy", "2011"};
            writer.writeNext(data1);
            String[] data2 = {"dolphin", "winter", "2003"};
            writer.writeNext(data2);
            String[] data3 = {"duck", "donald", "2010"};
            writer.writeNext(data2);
            String[] data4 = {" bengal cat", "billy", "20I1"};
            writer.writeNext(data2);
            String[] data5 = {"chicken", "johnny", "2015"};
            writer.writeNext(data2);
            String[] data6 = {"arabian horse", "blueskin", "2009"};
            writer.writeNext(data2);
            String[] data7 = {"german shepherd", "apollo", "2O13"};
            writer.writeNext(data2);
            String[] data8 = {"great white shark", "jaws", "2005"};
            writer.writeNext(data2);
            String[] data9 = {"parakeet", "cleo", "2010"};
            writer.writeNext(data2);

            // closing writer connection
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
