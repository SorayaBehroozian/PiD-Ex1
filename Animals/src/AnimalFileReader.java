import com.opencsv.ICSVParser;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.opencsv.CSVReader;



public class AnimalFileReader {




  public static void main(String[] args) throws IOException {
        ArrayList<String> strList = new ArrayList<>();
          BufferedReader br;
          String path = "animals.csv";
          String line;
          try {
              br = new BufferedReader(new FileReader(new File(path)));

              while ((line = br.readLine()) != null) {
                System.out.println(line);
                strList.add(line);
              }
          } catch (IOException e) {
              e.printStackTrace();
          }
      System.out.print("/////////");
        /*  Iterator itr = strList.iterator();
          while(itr.hasNext()) {
              Object element = itr.next();
              Animal animal = new Animal();
             //String str = (String)element;
              System.out.println(animal.setName());

*/
      BufferedReader csvReader = null;
      try {
          csvReader = new BufferedReader(new FileReader("animals.csv"));
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      }
      String row = null;
      Animal ani = new Animal();
      while (true) {
          try {
              if (!((row = csvReader.readLine()) != null)) break;
          } catch (IOException e) {
              e.printStackTrace();
          }
          String[] data = row.split(",");
          ani.setName(data[0]);
          ani.setType(data[1]);
          ani.setBirthYear(data[2]);
          System.out.println(data[0]);
          System.out.println(ani.getName());
          System.out.println(ani.getType());
          System.out.println(ani.getBirthYear());

      }
      csvReader.close();
          }

      }



