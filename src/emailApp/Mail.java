package emailApp;

import java.util.Scanner;

public class Mail {
    private String firstName;
    private String lastName;
    private String password;
    private String dept;
    private String altEmail;
    private int inboxCapacity;


    //constructor for the first & lastname
    public Mail(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created for -> " + this.firstName + " "+ this.lastName);

        this.dept = setDept();
        System.out.println("Department is " + this.dept);

    }



    //ask for the password
    private String setDept()
    {
        System.out.println("Please enter your dept:\n1, for sales\n2, for Accounting\n3, for Development\n4, for HR\n");
        Scanner scIn = new Scanner(System.in);
        int choice = scIn.nextInt();
        switch (choice) {
            case 1:
                return "Sales";
            case 2:
                return "Accounting";
            case 3:
                return "Devlopment";
            case 4:
                return "Human resources";
            default:
                return "No department.";

        }

    }

    //generate random password

    //set the inbox capacity

    //set and set al email


    //Change the password
}
