/*
Create an application to order gifts.

step 1
    1.  Create an abstract class of gifts as base class
    2.  Create derived classes of gifts (sweets, bicycle, electronic devices, …)
    3.  All gifts should have name, price and can have some custom behavior

step 2
    1.  Create an order class
    2.  Create a method to add a single gift to the order
    3.  Store the added gifts for an order

step 3
    1.  Create a method to add a gift with quantity (overload the previous add method)
    2.  Create a method to modify the quantity of an ordered gift
    3.  Create a method to delete an ordered gift

step 4
    1.  Create a method to write out the name, quantity and price per each ordered item and the total price of the order to the console
    2.  Test your program from main
        o   Create some gifts with price (use constructor)
        o   Order some gifts
        o   Modify the quantity
        o   Delete some of them
        o   List the ordered items
        Prepare your application with negative scenarios as well and test it from main. E.g.: When you try to delete a not ordered item then do not try to remove it just write out a message to the console.
        List the ordered items in ascending order based on their price.

step 5
    1.  Create an interface with a method to print instructions how to make the payment
    2.  Extend your order class to implement this interface – prints a message with the whole accumulate amount to wire to a particular account number
    3.  Create a new class for hotel booking which should also implement this interface – prints a message that "In order to complete the reservation you need to pay a deposit." It will also display the calculated deposit which will be 10% of the total accommodation fee + $10. The amounts need to be wired to a particular account number
    4.  Create some instances of both order and booking classes and store them in a collection (in main method)
    5.  Iterate through this collection and call the implemented payment instruction method
 */

package homework2.hmwk5;

public abstract class Gifts implements Comparable<Gifts>
{
    String name;
    Double price;
    Integer quantity = 1;
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer q) {
        quantity = q;
    }

    public void printGift(){
        System.out.println(this.getName()+", " +this.getPrice()+" EUR "+"qty "+this.getQuantity());
    }

    public int compareTo(Gifts gift) {
        Double comparePrice = gift.getPrice();
        if (this.price == comparePrice) return 0;
        if (this.price - comparePrice <0 ) return -1;
        else return 1;
    }
}
