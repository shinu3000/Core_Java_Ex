package coreJavaExample;

public class DataTypes {

	public static void main(String[] args) {
					// Data types specify the different sizes and values that can be stored in the variable.
					// Primitive and non-primitive
					//Primitive-(byte , short, int, long, float, double, char, boolean )-(8 Reserved Key Word) 
		
		byte b= 127;	/* byte: The byte data type is an 8-bit signed two's complement integer.
					         It has a minimum value of -128 and a maximum value of 127 (inclusive).
					         The byte data type can be useful for saving memory in large arrays,
					         where the memory savings actually matters */
		
		short s= 32767;	/*short: The short dtat type is an 16-bit signed two's complement integer
		                     it has a minimum value od -32768 and a maximum value of 32767(inclusiv).
		                     it is used to save memory in larg array */
		
		int i= 222321223;/*integer: The int data type is an 32 bit Signed two's complement integer 
		                     it has minimum value of  -2^32 amd maximun value of 2^32-1 */
		
		long l= 2223232423423423434L;     /*long : The long data type is an 64 bit signed two's compliment integer */
		
		float f= 22.334f; // float is a 32 bit single precition 754 floating point 
		
		double d= 2234.33; // double is a 64bit double pricition 754 floating point 
		
		char c= 'a'; // char: is a single 16 bit unicode
		
		System.out.println("byte : "+b);
		System.out.println("short :"+s);
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double :"+d);
		System.out.println("char :"+c);
	}

}
