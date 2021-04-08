package com.AddressBookPackage;

import java.util.*;

public class AddressBook {

    private static Scanner scanner = new Scanner(System.in);
    List<Person> personList = new ArrayList<>();

    public void createPerson() {

        System.out.println("Welcome to address book");

        boolean isExit = false;

        while (!isExit) {
            System.out.println("PLEASE SELECT\nPRESS 1 ADDING PERSON\nPRESS 2 FOR EDITING PERSON\nPRESS 3 FOR DELETING PERSON\nPRESS 4 FOR EXIT");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (!isPersonExist(getName())) {
                        personList.add(addPerson());
                    }
                    System.out.println(personList.toString());
                    break;
                case 2:
                    System.out.println("Please enter name to update");
                    Person person1 = findPerson(getName());
                    if(person1 != null){
                        editDetails(person1);
                    }
                    System.out.println(personList.toString());
                    break;
                case 4:
                    System.out.println("Please enter name to Delete");
                    Person person = findPerson(getName());
                    if (person != null){
                        personList.remove(person);
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

    private Person findPerson(String name) {
        Person person = personList.stream().filter(
                personElement -> personElement.getFirstName().equals(name) || personElement
                        .getLastName().equals(name)).findFirst().orElse(null);
        if (person == null) {
            System.out.println(" No person present matching with your name ");
            return null;
        } else {
            return person;
        }
    }

        private static Person editDetails(Person person){
            System.out.println("What details you want to edit");
            System.out.println("PRESS 1 FOR FIRST NAME\nPRESS 2 FOR LAST NAME\nPRESS 3 FOR ADDRESS\nPRESS 4 FOR CITY\nPRESS 5 FOR STATE\nPRESS 6 FOR ZIP CODE\nPRESS 7 FOR PHONE NUMBER\nPRESS 8 FOR EMAIL ID\nPRESS 9 FOR EXIT");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the first name");
                    String fName = scanner.next();
                    person.setFirstName(fName);
                    break;
                case 2:
                    System.out.println("Enter the last name");
                    String lName = scanner.next();
                    person.setLastName(lName);
                    break;
                case 3:
                    System.out.println("Enter the address ");
                    String addressUpdate = scanner.next();
                    person.setAddress(addressUpdate);
                    break;
                case 4:
                    System.out.println("Enter the city ");
                    String city = scanner.next();
                    person.setCity(city);
                    break;
                case 5:
                    System.out.println("Enter the state");
                    String state = scanner.next();
                    person.setState(state);
                    break;
                case 6:
                    System.out.println("Enter the zip code");
                    int zipCode = scanner.nextInt();
                    person.setZipCode(zipCode);
                    break;
                case 7:
                    System.out.println("Enter the phone number");
                    String phoneNumber = scanner.next();
                    person.setPhoneNumber(phoneNumber);
                    break;
                case 8:
                    System.out.println("Enter the Email Id ");
                    String emailId = scanner.next();
                    person.setEmailId(emailId);
                    break;
                default:
                    break;
            }
            return person;
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