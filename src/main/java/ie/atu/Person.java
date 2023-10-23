package ie.atu;

import java.util.Scanner;

public class Person {

    String firstName;
    String lastName;
    int age;

    //default constructor
    public Person() {
        this.firstName = " Natty";
        this.lastName = " Noku";
        this.age = 18;
    }

    //constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //new method
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();

    }
    //display method
    public void displayInfo(){
        System.out.println("Name: " + firstName + " " + lastName + ", Age: " + age);
    }

}
