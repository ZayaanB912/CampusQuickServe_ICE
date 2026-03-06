
package quickserveapp;

import javax.swing.JOptionPane;


public class Order {
    
    
    //Creating the constant VAT Rate for the government
    public static final double VAT_RATE = 0.15;
    
    //Creating the constant for the discount if 3 or more items
    public static final double DISCOUNT = 0.10;
    
    String[] foodItems = {"R55 - Bruh Burger", "R50 - Chicken Wrap", "R37 - Cheesy Jalapeno Fries"};
    int[] prices = {55, 50, 37};

    int selectedIndex;

    // Method to display food options
    public String selectFood() {

        selectedIndex = JOptionPane.showOptionDialog(null,
                "Please select your food:",
                "Quick Serve Order",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                foodItems,
                null);
        
        return foodItems[selectedIndex]; 
    }
    
    // Method to get the price of the selected food
    public int getPrice() {
        return prices[selectedIndex];
    }
    
    //Method to get SubTotal before discount(if there is) for everything
    public double calculateSubtotal(int quantity) {
        return prices[selectedIndex] * quantity;
    }
    
    //Method to add discount if 3 or more itms
    public double calculateDiscount(double subtotal, int quantity) {
        if(quantity >= 3) {
            return subtotal * DISCOUNT;
        }
        
        return 0;
    }
    
    //Method to calculate the final subtotal before VAT
    public double calculateSubtotalAfterDiscount(double discount, double subtotal) {
        return subtotal - discount;
    }

    //Method to add the VAT(15%)
    public double calculateVAT(double amount) {
        return amount * VAT_RATE;
    }
    
    // Method to calculate total including the VAT
    public double calculateTotal(double SubtotalAfterDiscount, double VAT) {
        return SubtotalAfterDiscount + VAT;
    }
    
    // Method to generate receipt
    public String generateReceipt(String name, String studentNumber, String food, int quantity) {

        int price = getPrice();
        double subtotal = calculateSubtotal(quantity);
        double discount = calculateDiscount(subtotal, quantity);
        double subtotalafterdiscount = calculateSubtotalAfterDiscount(discount, subtotal);
        double vat = calculateVAT(subtotalafterdiscount);
        double total = calculateTotal(subtotalafterdiscount, vat);

        //Outputting the receipt
        String receipt =
                "-----CAMPUS QUICKSERVE-----"
                + "\nCustomer: " + name
                + "\nStudent Number: " + studentNumber
                + "\n\nItems Ordered: " + food
                + "\nQuantity: " + quantity
                + "\nPrice per item: R" + price 
                + "\nSubtotal: R" + subtotal 
                + "\nDiscount: R" + discount 
                + "\nSubtotal after discount: R" + subtotalafterdiscount
                + "\nVAT (15%): R" + vat
                + "\nTotal: R" + total 
                + "\n\nThank you for your order!" 
                + "\n------------------------------------------------";

        return receipt;
        
    }
    
}
