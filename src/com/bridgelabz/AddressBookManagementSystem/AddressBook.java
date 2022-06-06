package com.bridgelabz.AddressBookManagementSystem;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
    static List<ContactPerson> contactList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    // method for adding contacts 
    public static void addContact() {
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
    // main Method
    public static void main(String[] args)
    {
        System.out.println("****** Welcome To The Address Book Program ******");
        addContact();
        System.out.println(contactList);
    }
}