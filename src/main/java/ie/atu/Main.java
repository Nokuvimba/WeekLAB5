package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person student1 = new Person( "Natalie", "Chiyaka", 21);
        System.out.println( "Details are: " +" " + student1.getFirstName());

        student1.displayInfo();
        }
    }
