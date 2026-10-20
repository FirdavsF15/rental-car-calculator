package com.pluralsight;
import java.util.*;

public class RentalCalculator {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String date = getDate();
        int rentDays = getDays();
        boolean hasTag = checkTag();
        boolean hasGPS = checkGPS();
        boolean hasAssistance = checkAssistance();
        int age = getAge();

        float extraCosts = calcExtraCosts(hasTag, hasGPS, hasAssistance);

        float totalCost = 29.99f;
        if(age<25){
            totalCost+= (29.99 * .3);
        }

        totalCost += extraCosts;

        System.out.printf("Your car is ready to pickup on %s for %d days. Your total cost is $%.2f/day. All taxes have already been incorporated into the total.", date, rentDays, totalCost);



    }

    public static String getDate(){
        System.out.println("Enter your pickup date: ");
        return (scanner.nextLine());
    }

    public static int getDays(){
        System.out.println("How many days do you want to rent a car:");
        return Integer.parseInt(scanner.nextLine());
    }

    public static boolean checkTag(){
        System.out.println("Do you want an electronic toll tag at $3.95/day. (yes/no)");
        String userInput = scanner.nextLine();

        if(userInput.equals("yes")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkGPS(){
        System.out.println("Do you want a GPS at $2.95/day. (yes/no)");
        String userInput = scanner.nextLine();

        if(userInput.equals("yes")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkAssistance(){
        System.out.println("Do you want roadside asssitance at $3.95/day. (yes/no) ");
        String userInput = scanner.nextLine();

        if(userInput.equals("yes")){
            return true;
        }else{
            return false;
        }
    }

    public static int getAge(){
        System.out.println("How old are you? ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static float calcExtraCosts(boolean tag, boolean GPS, boolean assist){
        float total = 0;

        if(tag){
            total +=3.95;
        }
        if(GPS){
            total+=2.95;
        }
        if(assist){
            total+=3.95;
        }

        return total;
    }




}
