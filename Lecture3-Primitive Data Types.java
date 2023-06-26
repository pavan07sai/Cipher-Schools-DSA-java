import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		System.out.println("X is "+ x);
		System.out.println("Y is "+ y);
		
		byte a = 10;
		System.out.println("Byte A is: "+ a);
		
		byte b = (byte)500;     // range between -128 to 127
		System.out.println("Byte B is: "+ b);
		
		short c = 500;
		System.out.println("Short C is: "+ c);
		
		short d = (short)50000;   // range between -32,768 to 32,767
		System.out.println("Short D is: "+ d);
	}
}
