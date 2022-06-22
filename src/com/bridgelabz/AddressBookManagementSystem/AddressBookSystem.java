package com.bridgelabz.AddressBookManagementSystem;


import java.util.Scanner;

public class AddressBookSystem
{ //main method
    public static void main(String[] args)
    {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int flag = 1 ;
        while(flag == 1)
        {
            System.out.println(" Welcome to address book program ");
            System.out.println(" Select a choice : 1. Add 2.Edit  3. Delete 4. Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1 : addressBook.addContact();
                    break;
                case 2 : if (addressBook.contactList.isEmpty())
                {
                    System.out.println(" Address book is empty ");
                    break;
                }
                    addressBook.editContact();
                    break;
                case 3:
                    if (addressBook.contactList.isEmpty())
                    {
                        System.out.println(" Address book is empty ");
                        break;
                    }
                    addressBook.deleteContact();
                case 4 : flag = 0 ;
                    break;
                default: System.out.println(" Enter a valid choice");
                    break;
            }
        }
        System.out.println(addressBook.contactList);
    }

}