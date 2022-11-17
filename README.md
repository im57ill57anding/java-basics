# Project : Part 1 – Greeting

Instructions

First, you’ll want to greet your user and ask them their name. As you can see above the user types their response ON THE SAME LINE as the question. To do this you’ll want to use a System.out.print() statement. Once you have their name use it to greet your user, and then ask them where they would like to go. Finally, tell your user, their destination sounds like a great trip! All the code to accomplish Part 1 should be in its own method.

HINT: Some names and destinations are more than 1 word! Plan accordingly.

public static void greeting(): None -> None

First you’ll want to greet your user and ask them their name.

Once you have their name use it to greet your user, and then ask them where they would like to go. Finally tell you user their destination sounds like a great trip! All the code to accomplish Part 1 should be in its own method.

write your code here

Sample output:

Welcome to Vacation Planner!

What is your name: Ernest Hemingway

Nice to meet you Ernest Hemingway, where are you traveling to? Rome Great! Rome sounds like a great trip



# Project : Part 2 - Travel Time and Budget

Instructions

For this part, you’ll want to ask the user about how much time and money they are budgeting for their trip. Ask the user: How many days are they going to spend in their destination? What is their total budget for the trip in USD? What is the currency symbol for their destination? For example, the us dollar’s is USD, the euro’s is EUR etc... The conversion rate between 1 USD to however many of that destinations currency. For example, there are 0.85 euro to 1 usd, so the user would type in 0.9 Once you have all this info (stored in the correct variables), use it to tell the user the following information: How much time the user will spend in their destination in days, hours, minutes and seconds Show the user their budget in USD for the whole trip and how much they can spend in USD per day Show the user their budget in the travel destination’s currency for the total trip and per day All the code to accomplish Part 2 should be in its own method. Pay attention to fact that all your results must be rounded to the two decimal places. HINT: keep in mind that if you divide integers you might lose some information when it rounds down!

public static void travelTimeBudget(): None -> None

You’ll want to ask the user about how much time and money they are budgeting for their trip. Once you have all this info (stored in the correct variables), use it to tell the user the information given in sample output.

How many days are you going to spend traveling? 31

How much money, in USD, are you planning to spend on your trip: 7000

What is the three letter currency symbol for your travel destination? EUR How many EUR are there in 1 USD? 0.85

If you are traveling for 31 days that is same as 744 hours or 44640 minus or 2678400 seconds.

If you are going to spend $7000 USD that means per day you can spend up to $225.8 USD

Your total budget in EUR is 5950.0 EUR, which per day is 191.93 EUR

# Project : Part 3 – Time Difference

Instructions

For this part, you’ll need to ask the user about the time difference between their home and where they are going. If the destination time zone is “behind” the user’s home timezone the user should enter a negative number. For example, the time difference between Seattle and Nairobi is 9 hours, and the time difference between New York and Mexico City is -1 hours. Show the time it will be in the travel destination when it is midnight at home and when it is noon at home. You can report these in 24 format, where midnight is 0:00 and noon is 12:00. HINT: If your answers are greater than 24 try using the % or mod operator to “wrap around” to 24 hour time format. All the code to accomplish Part 3 should be in its own method. You can use the code template provided below.

public static void timeDifference(): None -> None

you’ll need to ask the user about the time difference between their home and where they are going.

What is the time difference, in hours, between your home and your destination? 4 That means that when it is midnight at home it will be 4:00 in your travel destination and when it's noon at home it will be 16:00

# Project : Part 4 – Country Area

Instructions

Only three countries in the world use the “imperial system”, so most countries report their distances in kilometers. For this part, ask the user the area of their travel destination country in km2. Then you’ll want to convert that to miles2 and report those results back to the user. Pay attention to the fact that all your results must be truncated to the two decimal places. The online converter of length units.

Conversion base : 1 km2 = 0.38610215854245 sq mi

public static void countryArea(): /** None -> None

Ask the user the area of their travel destination country in km2.

Then you’ll want to convert that to miles2 and report those results back to the user.

What is square area of your destination country in km2? 480 In miles2 that is 185.32

# Project : Part 5 – Next Destination

Instructions

At the end of the project, enter the list of countries you visited using a loop. Then include the 5 countries you want to visit in the future to the array, respectively, and print out the 1 country you chose from among them.

How many places you traveled to : 5

Enter the name: America Enter the name: Canada Enter the name: China Enter the name: Belgium Enter the name: Australia

Next place you want to travel to :

0: Italy

1: England

2: Netherlands

3: Germany

4: France

Your input should be -> 4
Thank you, Your next location is : Germany