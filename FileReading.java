/*
 * File Reading
 * Author: 794748, Raiyan A
 * Class: ICS3U0, Mr. King
 */
package file.reading;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.math.RoundingMode;

public class FileReading {

    private static boolean EOF;
   
    public static void main(String[] args) throws IOException {

        System.out.println("Account     Balance    Update    Paid"
                + "      Interest      Total");
        //prints out header into console
        System.out.println("-----------------------------------------"
                + "-----------------------");
        //dashes to seperate headers from values
        Scanner sc = new Scanner(System.in);//scanner system
        Scanner fh; //declares new scanner called fh
        fh = null; //initiallizes fh 
        
        try { //try and catch blocks to execute file scanning
            File file = new File("G://Documents//NetBeansProjects//File Reading//newbalance.dat");
            //new file is created called newbalace.dat 
            //newbalance.dat is stored in 'file' for later use
            fh = new Scanner(new File("ledger.dat")); 
            //scans the file ledger.dat
            while (fh.hasNextLine()) { 
            //while loop to scan every line in the file
                String line = fh.nextLine();
                //Every line in ledger.dat is stored into string line 
                String Account = line.substring(0, 6);
                //new string called Account is created and stores characters 
                //from 0th to 6th place from string Line
                String Balance = line.substring(12, 18);
                //new string called Balance is created and stores characters 
                //from 12th to 18th place from string Line
                String BalUpdate = line.substring(23, 30);
                //new string called Update is created and stores characters 
                //from 23rd to 30th place from string Line
                String Paid = line.substring(36, 41);
                //new string called Paid is created and stores characters 
                //from 36th to 41st place from string Line
                System.out.printf("%-10.06s  %-10.06s", Account, Balance);
                //formatted print to print it out in organized columns
                System.out.printf("%-9.7s  %-12.10s", BalUpdate, Paid);
                //formatted print to print it out in organized columns 
                double b = Double.valueOf(Balance);
                //changes String Balance into b which is a double variable
                double interest = b * 0.023;
                //interest is calculated with the balance of this month
                //and is stored under a new variable called interest.
                System.out.printf("%-12.10s", String.format("%.2f", interest));
                //formatted print to print out interest into 2 decimal places 
                //also formatted to print out in a column
                double u = Double.valueOf(BalUpdate);
                //changes string Update into u which is a double variable
                double p = Double.valueOf(Paid);
                //changes string Paid into p which is a double variable      
                double total = interest + u - p + b;
                //interest is added to balance update and existing balance and 
                //subtracted from the amount paid
                System.out.printf("%-10.10s%n", String.format("%.2f", total));
                //formatted print prints out the final balance 
                //it is also formatted to be printed out into 2 decimal places
                String[] array = line.split("       ");
                //array that splits main string 'line' every 6 spaces
            } //ends while loop
            if (file.createNewFile()) {
            //if statement to determine whether the file was created
            //if the file was created then it will say file created + name of file
                System.out.println("File created: " + file.getName());
            } else {
            //or else, if the file already exists, the console will say file
            //has already been created or exists
                System.out.println("The File newbalance.dat Already Exists.");
            } //ends if/else statement
        } catch (FileNotFoundException e) {
            //catch statement for when file is not found
            System.out.println("File not found.");
            //if file not found then it will tell the user it was not found
        } //ends catch
        fh.close(); //closes the file 
    } //ends main    
} //ends class