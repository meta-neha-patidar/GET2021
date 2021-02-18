package assignment1feb18;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 0 to stop performing any operation : ");
		System.out.println("Enter 1 to perform addition of two hex values: ");
		System.out.println("Enter 2 to perform subtraction of one hex value by other hex value ");
		System.out.println("Enter 3 to perform multiplication of two hex values: ");
		System.out.println("Enter 4 to perform division of one hex value by other hex value: ");
		System.out.println("Enter 5 to check weather two hex strings are equal or not : ");
		System.out.println("Enter 6 to check if first hex value is greater than second hex value or not : ");
		System.out.println("Enter 7 to check if first hex value is smaller than second hex value or not : ");
		System.out.println("Enter 8 to convert hex value into integer : ");
		System.out.println("Enter 9 to convert integer value into hex value : ");
		
		HexCalc object=new HexCalc();
		
		int var_to_operation=scanner.nextInt();
		while(var_to_operation !=0){
			if(var_to_operation>=1 && var_to_operation<=7){
				String var1=scanner.next();
				String var2=scanner.next();
				if(var_to_operation==1){
					System.out.println(object.addHex(var1,var2));
				}
				else if(var_to_operation==2){
					System.out.println(object.subtractHex(var1,var2));
				}
				else if(var_to_operation==3){
					System.out.println(object.multiplyHex(var1,var2));
				}
				else if(var_to_operation==4){
					System.out.println(object.divideHex(var1,var2));
				}
				else if(var_to_operation==5){
					System.out.println(object.isEqualHex(var1,var2));
				}
				else if(var_to_operation==6){
					System.out.println(object.isGreaterHex(var1,var2));
				}
				else if(var_to_operation==7){
					System.out.println(object.isSmallerHex(var1,var2));
				}
			}else if(var_to_operation==8){
				
			}
			else if(var_to_operation==9){
				
			}else System.out.println("Enter a valid input from 0 to 9 ");
			var_to_operation=scanner.nextInt();
		}
		System.out.println("you are exit from operations performing");
	}

}
