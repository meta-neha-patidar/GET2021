package assignment01;
import java.util.*;

public class ShoppingCart {
	static HashMap<String,ItemDetails>list_of_items=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		//for adding items in item list 
		System.out.println("Enter the no. of items : ");
		int items_in_list=scanner.nextInt();
		while(items_in_list-- >0){
			System.out.println("Enter the item name, quantity and price: ");
			String item_name=scanner.next();		//name of the item adding in the item list
			int quantity_of_item=scanner.nextInt();		
			float price_of_item=scanner.nextFloat();
			ItemDetails item_details=new ItemDetails(quantity_of_item,price_of_item);
			list_of_items.put(item_name,item_details);
			
		}
		System.out.println("List of items present for shopping");
		for(Map.Entry<String, ItemDetails> list:list_of_items.entrySet()){
			System.out.print(list.getKey()+"\t");
		}
		System.out.println();
		
		//for customer end operations while shopping
		System.out.println("=================================operations on cart for customer ======================");
		
		System.out.println("Enter 0 to stop operations on cart :");
		System.out.println("Enter 1 to add item in cart :");
		System.out.println("Enter 2 to remove one quantity of item from cart :");
		System.out.println("Enter 3 to remove all quantities of item in cart :");
		System.out.println("Enter 4 to display item in cart :");
		System.out.println("Enter 5 to display bill of cart :");
		
		ShoppingCartOperations shopping_cart_operations=new ShoppingCartOperations();				//object of ShoppingCartOperations class
		
		int operation_value=scanner.nextInt();
		while(operation_value != 0){
			
			if(operation_value==1){
				System.out.println("Enter item name : ");
				String item_name_add=scanner.next();
				shopping_cart_operations.addItemToCart(item_name_add);
			}
			else if(operation_value==2){
				System.out.println("Enter item name : ");
				String item_name_to_quantity_reduce=scanner.next();
				shopping_cart_operations.minimizeItemQuantityFromCart(item_name_to_quantity_reduce);
			}
			else if(operation_value==3){
				System.out.println("Enter item name : ");
				String item_to_remove=scanner.next();
				shopping_cart_operations.removeItemFromCart(item_to_remove);
			}
			else if(operation_value==4){
				shopping_cart_operations.printCartList();
			}else if(operation_value==5){
				shopping_cart_operations.billOfCartItemts();
			}else{
				System.out.println("Enter a valid input from 0-5");
			}
			shopping_cart_operations.cartPrice();
			System.out.println("Enter a input from 0-5 to perform any task : ");
			operation_value=scanner.nextInt();
		}
		System.out.println("operations done");
	}

}
