package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
// *** create a new item and add it to the cart
            item = new Item(itemName , itemPrice , quantity);
            cart.add(item);

            System.out.print ("Continue shopping (y/n)? ");
            scan.nextLine();
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));


        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            item = cart.get(i);
            System.out.println("Item: " + item.getName() + ", price: " + item.getPrice()+ ", quantity: " + item.getQuantity());

            total += item.getPrice() * item.getQuantity();
        }

        System.out.println("Total to pay: " + total + " DH");
        scan.close();
    }



}
