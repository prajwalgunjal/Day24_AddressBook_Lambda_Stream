package com.bridgelabz.Lambda;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to AddressBook program");
            System.out.println("1) Press 1 to add new contact");
            System.out.println("2) press 2 to display contact");
            int input = sc.nextInt();
            switch (input){
                case 1 -> {
                    addressBook.AddContact();
                }
                case 2 -> {
                    addressBook.display();
                }

            }
        }
    }
}