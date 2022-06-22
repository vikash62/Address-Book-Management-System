package com.bridgelabz.AddressBookManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
    static List<ContactPerson> contactList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    // method for adding contacts in list.
    public static void addContact()
    {
        System.out.println(" Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.println(" Enter your last name : ");
        String lastName = sc.nextLine();
        System.out.println(" Enter your city name : ");
        String city = sc.nextLine();
        System.out.println("Enter your state  : ");
        String state = sc.nextLine();
        System.out.println(" Enter your zip code : ");
        long zip = sc.nextLong();
        System.out.println(" Enter your phone number : ");
        long phoneNumber = sc.nextLong();
        System.out.println(" Enter your email : ");
        String email = sc.nextLine();

        ContactPerson addressBook = new ContactPerson(firstName, lastName, email, city, state, phoneNumber, zip);
        contactList.add(addressBook);
    }
    // method for editing existing contact
    public void editContact()
    {
        Scanner nameInput = new Scanner(System.in);
        System.out.println(" Enter the first name ");
        String fName = nameInput.nextLine();
        for (int index = 0; index < contactList.size(); index++)
        {
            if (contactList.get(index).getFirstName().equals(fName))
            {
                contactList.remove(index);
                AddressBook addressBook = new AddressBook();
                addressBook.addContact();
            } else
            {
                System.out.println(" There is no contact ");
            }
        }
    }
}