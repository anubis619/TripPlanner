import java.util.Scanner;
public class LearnScanner {
    public static void main(String [] args) {

        destination();
        duration();
        timeDifference();


    }


    public static void destination() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("what is your name?");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?");
        String zone = input.nextLine();
        System.out.println("Great! " + zone + " sounds like a great trip you have planned there!");
        System.out.println("************************");
        System.out.println("                        ");
    }

    public static void duration() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling?");
        int daysSpent = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        double currencyUSD = input.nextDouble();
        System.out.print("What is the currency symbol for their destination?");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in 1 USD?");
        double currencyDifference = input.nextDouble();
        double convertedcurrency = currencyUSD * currencyDifference;
        int convertedRound = (int) convertedcurrency;
        double currencyDaily = (currencyUSD/daysSpent)*100;
        int currencyRound = (int) currencyDaily;
        double roundC = currencyRound/100.00;
        System.out.println("                        ");



        System.out.println("If you are traveling for " + daysSpent + " days that is the same as "
                + daysSpent * 24 + " hours or " + daysSpent * 24 * 60 + " minutes.");
        System.out.println("If you are going to spend $" + currencyUSD + " USD that means per day you can spend up to $" + roundC + " USD");
        System.out.println("Your total budget in " + currency + " is " + convertedRound + " " + currency + ", which per day is "
                + roundC * currencyDifference + " " + currency);
        System.out.println("************************");
        System.out.println("                        ");
    }

    public static void timeDifference(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the times difference, in hours, between your home and your destination? (please input + sign or - accordingly.");
        int t = input.nextInt();
        int localTimeMidnight = (24 + t) % 24;
        int localTimeNoon = (36 + t) % 24;
        System.out.println("That means that when it is midnight at home it will be " + localTimeMidnight
                + ":00 in your travel destination and when it is noon at home ir will be "
                + localTimeNoon + ":00.");
    }
}
