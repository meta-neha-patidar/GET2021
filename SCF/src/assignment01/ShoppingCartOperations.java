package assignment01;
import java.util.*;
public class ShoppingCartOperations {
static HashMap<String,Integer> cart_item_list=new HashMap<>();
	
	// printCartList() method print all the item present in the cart with quantity
	void printCartList(){
		System.out.println("===================items and quantity in cart======================");
		System.out.println("item name:\t quantity");
		for(Map.Entry<String, Integer> iterator: cart_item_list.entrySet()){
			System.out.println(iterator.getKey()+":\t\t\t"+iterator.getValue());
		}
	}
	
	// addItemToCart() method adds 1 quantity of any item at a time
	void addItemToCart(String item_to_add_in_cart){
		if(ShoppingCart.list_of_items.containsKey(item_to_add_in_cart)==false){	
			System.out.println("Item is not available ");		//if item is not present in shopping item list that customer want
			return;
		}
		if(cart_item_list.containsKey(item_to_add_in_cart)==false){		//if item is not present in cart then add item with 1 quantity
			cart_item_list.put(item_to_add_in_cart, 1);
		}
		else if(ShoppingCart.list_of_items.get(item_to_add_in_cart).item_quantity > cart_item_list.get(item_to_add_in_cart)){
			//if item is present in cart then increment quantity of item by 1
			cart_item_list.replace(item_to_add_in_cart, cart_item_list.get(item_to_add_in_cart)+1);			
		}else
				System.out.println("no more quantity available");		//out of limit
		
			
	}
	
	
	//minimizeItemQuantityFromCart() method reduce one quantity of item from cart
	void minimizeItemQuantityFromCart(String item_to_minimize){
		if(cart_item_list.containsKey(item_to_minimize)==false){	//if item is not present in the cart	
			System.out.println("Item is not in the cart list");
			return ;
		}
		if(cart_item_list.get(item_to_minimize)==1)
			cart_item_list.remove(item_to_minimize);		//remove item from cart if item quantity is 1
		else 
			cart_item_list.replace(item_to_minimize, cart_item_list.get(item_to_minimize)-1);		//decrease the quantity of item from cart when item quantity is more tthan 1
	}
	
	//removeItemFromCart() method remove all quantities of item from cart if it is present
	void removeItemFromCart(String item_to_remove){
		if(cart_item_list.containsKey(item_to_remove)==true){
			cart_item_list.remove(item_to_remove);
		}else{
			System.out.println("Item is not in the cart list");
		}
	}
	
	//billOfCartItemts() method print the total bill of all items present in cart
	void billOfCartItemts(){
		float total_price=0;
		System.out.println("item name\t quantity \t price per quantity \t price of all quantity");
		
		for(Map.Entry<String, Integer> bill_iterator: cart_item_list.entrySet()){
			System.out.println(bill_iterator.getKey()+"\t\t\t"+bill_iterator.getValue()+"\t\t\t"+
					ShoppingCart.list_of_items.get(bill_iterator.getKey()).price_of_item+
					"\t\t\t"+ShoppingCart.list_of_items.get(bill_iterator.getKey()).price_of_item*bill_iterator.getValue());
			total_price+= ShoppingCart.list_of_items.get(bill_iterator.getKey()).price_of_item*bill_iterator.getValue();
		}
		
		System.out.println("\nTotal bill of cart items :\t\t\t\t\t\t"+ total_price);
	}
	void cartPrice(){
		float total_price=0;
		for(Map.Entry<String, Integer> bill_iterator: cart_item_list.entrySet()){
			total_price+= ShoppingCart.list_of_items.get(bill_iterator.getKey()).price_of_item*bill_iterator.getValue();
		}
		
		System.out.println("==================Total price of cart items : "+ total_price+"========================");
	}
}
