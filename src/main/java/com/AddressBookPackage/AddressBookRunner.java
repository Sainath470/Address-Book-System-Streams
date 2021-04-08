package com.AddressBookPackage;
import java.util.*;

public class AddressBookRunner {
    private static Scanner scannerRunner = new Scanner(System.in);
    private static Map<String, AddressBook> addressBookMap = new HashMap<>();


    public static void main(String[] args) {

        System.out.println("WELCOME");
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Press 1 ADD ADDRESS BOOK\nPRESS 2 FOR ADDING PERSON\nPRESS 3 FOR EXIT");
            int choice = scannerRunner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Address Book Name");
                    addressBookMap.put(scannerRunner.next(), new AddressBook());
                    System.out.println(addressBookMap.toString());
                    break;
                case 2:
                    System.out.println("Enter address book name to add person");
                    String addressBookName = scannerRunner.next();
                    if (addressBookMap.containsKey(addressBookName)) {
                        AddressBook bookSystem = addressBookMap.get(addressBookName);
                        bookSystem.createPerson();
                    } else {
                        System.out.println("Address Book is not present");
                    }
                    System.out.println(addressBookMap.toString());
                    break;
                default:
                    isExit = true;
                    break;
                }
         }
    }
}



