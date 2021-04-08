import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class AddressBook {

    private static Scanner scanner = new Scanner(System.in);
    List<Person> personList = new ArrayList<>();

    public void createPerson() {

        System.out.println("Welcome to address book");

        boolean isExit = false;

        while (!isExit) {
            System.out.println("PLEASE SELECT\nPRESS 1 ADDING PERSON\nPRESS 2 EXIT");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (!isPersonExist(getName())) {
                        personList.add(addPerson());
                    }
                    System.out.println(personList.toString());
                    break;

                default:
                    isExit = true;

            }
        }

    }

    private boolean isPersonExist(String name) {
        return personList.stream()
                .anyMatch(personElement -> personElement.getFirstName().equals(name) || personElement
                        .getLastName().equals(name));

    }

    private static String getName() {
        return scanner.next();
    }

    private static Person addPerson() {
        Person person = new Person();
        System.out.println("PLEASE ENTER YOUR FIRST NAME: ");
        String firstName = scanner.next();
        person.setFirstName(firstName);
        System.out.println("PLEASE ENTER YOUR LAST NAME: ");
        String lastName = scanner.next();
        person.setLastName(lastName);
        System.out.println("PLEASE ENTER YOUR ADDRESS: ");
        String address = scanner.next();
        person.setAddress(address);
        System.out.println("PLEASE ENTER YOUR CITY: ");
        String city=scanner.next();
        person.setCity(city);
        System.out.println("PLEASE ENTER YOUR STATE: ");
        String state = scanner.next();
        person.setState(state);
        System.out.println("PLEASE ENTER YOUR ZIP CODE: ");
        int zipCode = scanner.nextInt();
        person.setZipCode(zipCode);
        System.out.println("PLEASE ENTER YOUR PHONE NUMBER: ");
        String phoneNumber = scanner.next();
        person.setPhoneNumber(phoneNumber);
        System.out.println("PLEASE ENTER YOUR EMAIL ID: ");
        String emailId = scanner.next();
        person.setEmailId(emailId);
        return person;
    }
}