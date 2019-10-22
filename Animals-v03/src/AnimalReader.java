//import java.io.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalReader {


    private Animal[] strList;

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
            String name = ani.getName();
            String type = ani.getType();
            String year = ani.getType();
            if (data[0] == "dolphin "){System.out.println(ani.toString());}
            //ArrayList<Animal> animals = new ArrayList<>();
           // Animal animal = new Animal(name,type,year);
          //  animals.add();
           // List<String> golden = strList.stream();
            /*
            for ( ani : data) {
                if (ani.getName().equals("golden")) {
                    System.out.println(ani.getName());

                }
                }*/
            if (data[0] != null && data[0].equals("dolphin")) {

                System.out.println("--------");
                System.out.println(ani.toString());

            }

        }
        csvReader.close();





    
     class GoldenRetriever extends AnimalReader{
        private AnimalReader animals;
         Stream<String> stream = strList.stream();

       /* public void test(){
            AnimalReader animals = new AnimalReader();
            String name= "dolphin";
            //Animal anim = new Animal();
            for (Animal anim : strList) {
                if (data[0] == name) {
                    System.out.println("kdjnckjdn") ;
                }
            }
           // return null;
        }*/
        }

    }
    interface Swimmer { void swim(String a);}
      class Dolphin implements Swimmer {
        @Override
        public void swim(String a) {
        }
    }
     class Duck implements Swimmer {
        @Override
        public void swim(String a) {}
    }
     class BengalCat {}
     class Chicken {}
     class ArabianHorse {}
     class GermanShepherd {}
     class GreatWhiteShark implements Swimmer{
        @Override
        public void swim(String a) {}
    }
     class Parakeet {}


}