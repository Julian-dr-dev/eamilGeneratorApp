package emailApp;

import java.util.Locale;
import java.util.Scanner;

public class Mail {
    private String compnayDomain = "company.com";
    private String firstName;
    private String lastName;
    private String password;
    private String dept;
    private String altEmail;
    private int inboxCapacity;
    private int defaultPwLen = 10;


    //constructor for the first & lastname
    public Mail(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created for -> " + this.firstName + " "+ this.lastName);

        this.dept = setDept();
        System.out.println("Department is " + this.dept);

        this.password = randoPassword(12);
        System.out.println("Your password is: " + this.password);

        //generate a user email
        String userEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dept + "." + compnayDomain;

        System.out.println("Your email is " + userEmail);

    }



    //ask for the password
    private String setDept()
    {
        System.out.println("Please enter your dept:\n1, for sales\n2, for Accounting\n3, for Development\n4, for HR\n");
        Scanner scIn = new Scanner(System.in);
        int choice = scIn.nextInt();
        switch (choice) {
            case 1:
                return "sales";
            case 2:
                return "accounting";
            case 3:
                return "development";
            case 4:
                return "HR";
            default:
                return "No department.";
        }
    }

    //generate random password
    private String randoPassword(int length)
    {
        String pwSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] pw = new char[length];

        for (int i = 0; i < length; i++)
        {
            int rand = (int) (Math.random() * pwSet.length());
            pw[i] = pwSet.charAt(rand);
        }
        return new String(pw);
    }


    //set inbox capacity
    public void setInboxCapacity(int capacity) {
        this.inboxCapacity = inboxCapacity;
    }

    //set and set al email
    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getInboxCapacity() {
        return inboxCapacity;
    }

    public String getaltEmail() {
        return altEmail;
    }
    public String getPassword() {
        return password;
    }


}