# CampusQuickServe_ICE

## What Does the Code Do?

The project that I have created does this. It takes the users name, student number and what they are ordering and how many items they are ordering. 

It then takes the prices and calculates the subtotal, it then adds a discount of 10% if the user chose more than 3 items, if not then there is no discount. It then calculates the VAT which is 15% and then adds that to the subtotal and then gives a total. 

The project then prints a receipt which includes the students name, student number, what they are ordering, how many they are ordering, the subtotal, the discount, the subtotal with the discount and then the final total amount.

## Classes and Methods Used

### In the QuickServeApp Class

#### In this class I have used the method:
main(String[] args)

### In the Order Class

#### In this class I used these methods:

selectFood - Used to display the food options for user to choose

getPrice - Used to fetch the prices of the specific food that the user selected

calculateSubtotalBD - Calculate the subtotal of items before adding the discount

calculateDiscount - Calculates the discount ammount if the user chose more than 3 items

calculateSubtotalAfterDiscount - Calculates the new subtotal but with the discount applied to the items

calculateVATBT - Calculates the VAT before the total, so it just gives out the amount of VAT there will be 

calculateTotal - Calculates the total with everything included

FinalReceipt - Used to output the final receipt with all the information from the user

## Development Process

My development process put into a simple flow chart:

* First create the input for the user, starting with the easy things like the user entering their name and student number
* Second I then created the food options and then added that which allowed the user to pick what they were going to order and how many. I also made it that the user can not put letters when choosing the quantity because it would then cause problems for the calculations
* Third I then added all the calculations for the subtotal, discount, VAT and then the final total for the order.
* Last I then created the output for the receipt which was quite easy by using a new methos and creating an object to use In the main class

## OOP Concepts Used

### Class vs Objects

In this project, the Order Class is used as the blueprint that contains the food options, the prices and also all the calculations for the project.

In the QuickServeApp class I created an object for the Order Class

### Encapsulation

In this project the Order Class encapsulates all the logic related to the specific order, which includes:

* The food options and prices
* The VAT and the discount as constants
* Methods that are the to do calculations
* The method that creates the final recipt

### Constants Used

public static final double VAT_RATE = 0.15 - This put the VAT rate at 15%

public static final double DISCOUNT = 0.10 - This puts a 10% discount if ordered 3 or more items

### Methods Used

selectFood - Used to display the food options for user to choose

getPrice - Used to fetch the prices of the specific food that the user selected

calculateSubtotalBD - Calculate the subtotal of items before adding the discount

calculateDiscount - Calculates the discount ammount if the user chose more than 3 items

calculateSubtotalAfterDiscount - Calculates the new subtotal but with the discount applied to the items

calculateVATBT - Calculates the VAT before the total, so it just gives out the amount of VAT there will be 

calculateTotal - Calculates the total with everything included

FinalReceipt - Used to output the final receipt with all the information from the user

## Screenshot
<img width="326" height="453" alt="image" src="https://github.com/user-attachments/assets/f7c3826a-9ec6-433e-a331-ebde0775f54f" />
