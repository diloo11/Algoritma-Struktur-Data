package Jobsheet6;

public class Lecturer {
    String id;
    String name;
    Boolean gender;
    int age;
    
    public Lecturer() {}

    public Lecturer(String id, String name, Boolean gender, int age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print(){
        String lecGender;
        if (gender == true) {
            lecGender = "Male";
        } else {
            lecGender = "Female";
        }
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + lecGender + ", Age: " + age);
    }
}