package com.addressbook;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

static HashMap<Integer,String> personDetails = new HashMap<>();

public class AddressBookRunner {
    static HashSet<AddressBookSource> personDetails = new HashSet<>();

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE ADDRESS BOOK PROGRAM");
        System.out.println("ENTER THE NUMBER OF CONTACTS TO ADD");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        for(int i=0; i<choice;i++)
            personDetails.put(i, new AddressBookSource().enterDetails());
        System.out.println(personDetails);
    }
}

