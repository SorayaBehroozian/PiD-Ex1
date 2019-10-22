import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


    import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


    public class WriteCSV {
        public static void main(String[] args) {

        }
        //Considering all different types data separation
        public String escapeSpecialCharacters(String data) {
            String escapedData = data.replaceAll("\\R", " ");
            if (data.contains(",") || data.contains("\"") || data.contains("'")) {
                data = data.replace("\"", "\"\"");
                escapedData = "\"" + data + "\"";
            }
            return escapedData;

        }
        public String convertToCSV(String[] data) {
            return Stream.of(data)
                    .map(this::escapeSpecialCharacters)
                    .collect(Collectors.joining(","));     }
        //Adding data to the ArrayList
        public void arrayToCSV () throws IOException {
            List<String[]> data = new ArrayList<>();
            data.add(new String[]{"dolphin", "winter", "2003"});
            data.add(new String[]{"duck", "donald", "2010"});
            data.add(new String[]{" bengal cat", " billy", "20I1"});
            data.add(new String[]{"chicken", " johnny", " 2015"});
            data.add(new String[]{"arabian horse", "blueskin", "2009"});
            data.add(new String[]{"german shepherd", "apollo", "2O13"});
            data.add(new String[]{"dolphin", "winter", "2003"});
            data.add(new String[]{"great white shark", "jaws", "2005"});
            data.add(new String[]{"parakeet", "cleo", "2010"});


            //Create the file
            File csvOutputFile = new File("animals");
            try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
                data.stream()
                        .map(this::convertToCSV)
                        .forEach(pw::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


































