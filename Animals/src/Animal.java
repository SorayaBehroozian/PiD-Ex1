import com.opencsv.bean.CsvBindByName;

import com.opencsv.bean.CsvBindByName;
public class Animal{


public String name;
public String type;
public String birthYear;

//setters and getters

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getBirthYear(){
        return birthYear;
    }
    public void setBirthYear(String birthYear){
        this.birthYear = birthYear;
    }
    public String toString(){
        return "name : " + getName() + "type : " + getType() + "year of birth : " + getBirthYear();
    }

    public class CSVUser {
        @CsvBindByName
        private String name;

        @CsvBindByName(column = "email", required = true)
        private String email;

        @CsvBindByName(column = "phone")
        private String phoneNo;

        @CsvBindByName
        private String country;

        // Getters and Setters (Omitted for brevity)
    }













}

