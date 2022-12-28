package emailApp;
import java.util.Scanner;
import java.util.*;
public class EmailApp {

    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        //input first name
        System.out.println("Please enter your first name: ");
        String fname = sc1.next();

        //input last name
        System.out.println("Please enter your last name: ");
        String Lname = sc2.next();
        Mail email = new Mail(fname, Lname);
    }
}
