/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class HeartRatesApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

   String firstName;
   String lastName;
   int day;
   int month;
   int year;
   int age;
   double maxRate;
   double targetLower;
   double targetHigher;


	Scanner input=new Scanner(System.in);
    HeartRates myHeartRates=new HeartRates();

        //accepting user input

        System.out.println("Please enter your first name");
        firstName=input.nextLine();
        System.out.println("Please enter your last name");
        lastName=input.nextLine();
        System.out.println("Please enter your year of birth");
        year=input.nextInt();

        myHeartRates.setYear(year);


        age=myHeartRates.calcAge();
        maxRate=myHeartRates.calcMax();
        targetLower=myHeartRates.calcLower();
        targetHigher=myHeartRates.calcHigher();

        System.out.println("Dear "+firstName+" "+lastName+ " as your age is "+age+" your maximum heart rate should be "+maxRate+". Please note the normal range is between "+targetLower+ " and "+targetHigher+". Thank you for using our application.");

    }
        }




