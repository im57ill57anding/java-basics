import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void greeting() {
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name: ");
        String fullName = scanner.next();
        System.out.print("Nice to meet you " + fullName + ", where are you traveling to? ");
        String city = scanner.next();
        System.out.println("Great! " + city + " sounds like a great trip");
    }

    public static void travelTimeBudget() {
        System.out.print("How many days are you going to spend traveling? ");
        int days = scanner.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip: ");
        int money = scanner.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination? ");
        String currency = scanner.next();
        System.out.println("How many " + currency + "are there in 1 USD? ");
        float ratio = scanner.nextFloat();

        System.out.println(
                "If you are traveling for " +
                        days + " days that is same as " +
                        (days * 24) + " hours or " +
                        (days * 24 * 60) + " minutes or " +
                        (days * 24 * 60 * 60) + " seconds."
        );
        System.out.println(
                "If you are going to spend $" +
                        money + " USD that means per day you can spend up to $" +
                        (float)(money / days)
        );
        System.out.println(
                "Your total budget in " +
                        currency + " is " +
                        (money * ratio) +  " " +
                        currency + ", which per day is 191.93 EUR" +
                        (money * ratio / days) + " " + currency
        );
    }

    public static void timeDifference() {
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int difference = scanner.nextInt();
        System.out.println(
                "That means that when it is midnight at home it will be " +
                        (difference < 10 ? "0" + difference : difference) +
                        ":00 in your travel destination and when it's noon at home it will be " +
                        (difference + 12) + ":00"
        );
    }

    public static void countryArea() {
        System.out.print("What is square area of your destination country in km2? ");
        int km = scanner.nextInt();
        System.out.println("In miles2 that is " + (km * 0.38610215854245f));
    }

    public static void traveledPlaces() {
        System.out.print("How many places you traveled to: ");
        int amount = scanner.nextInt();
        String[] countries = new String[amount];
        for (int i = 0; i < amount; ++i) {
            System.out.print("Enter the name: ");
            String country = scanner.next();
            countries[i] = country;
        }
        System.out.println(
                        """
                        Next place you want to travel to:
                        0: Italy
                        1: England
                        2: Netherlands
                        3: Germany
                        4: France
                        """
        );
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();
        System.out.println("Thank you, your next location is: " + countries[answer]);
    }

    public static void main(String[] args) {
        greeting();
        travelTimeBudget();
        timeDifference();
        countryArea();
        traveledPlaces();
    }
}
