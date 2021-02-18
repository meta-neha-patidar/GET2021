package assignment1feb18;

public class HexCalc {
	//method-1. addition
	String addHex(String variable1, String variable2){
		return Integer.toHexString(Integer.parseInt(variable1,16)+Integer.parseInt(variable2,16));
	}
	//method-2. subtraction
	String subtractHex(String variable1, String variable2){
		return Integer.toHexString(Integer.parseInt(variable1,16)-Integer.parseInt(variable2,16));
	}
	
	//method-3. multiplication
	String multiplyHex(String variable1, String variable2){
		return Integer.toHexString(Integer.parseInt(variable1,16)*Integer.parseInt(variable2,16));
	}
	
	//method-4. division
	String divideHex(String variable1, String variable2){
		return Integer.toHexString(Integer.parseInt(variable1,16)/Integer.parseInt(variable2,16));
	}
	
	//method-5. values are equal or not
	boolean isEqualHex(String variable1, String variable2){
		return false;
	}
	
	// method-6. is first value greater than second or not
	boolean isGreaterHex(String variable1, String variable2){
		
		return false;
	}
	
	//method-7 is first value smaller than second or not
	boolean isSmallerHex(String variable1, String variable2){
		if(variable1.length()<variable2.length()) return true;
		
		return false;
	}
	
	int decimalRepersentaion(String hex_value){
		return Integer.parseInt(hex_value,16);
	}
	
	String hexRepresentation(int dec_value){
		return Integer.toHexString(dec_value);
	}
	
	
	
}
