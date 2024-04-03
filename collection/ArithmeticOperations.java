package javaproj;


 
import java.util.List;
import java.util.Vector;
 

public class ArithmeticOperations {
	
	public static <T extends Number> Number add(T t1, T t2) {
		return (t1.doubleValue() + t2.doubleValue());
	}
 
	
	public static <T extends Number> Number sub(T t1, T t2) {
		return (t1.doubleValue() - t2.doubleValue());
	}
 
	public static <T extends Number> Number div(T t1, T t2) {
		return (t1.doubleValue() / t2.doubleValue());
	}
 
	public static <T extends Number> Number add(List<? extends Number> list) {
		double d = 0;
		;
		for (int i = 0; i < list.size(); i++)
			d += list.get(i).doubleValue();
 
		return new Double(d);
	}
 
	
	
 
	public static void main(String[] args) {
		
		Integer i1 = new Integer(34), i2 = new Integer(34);
		System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));
		Float f1 = new Float(12.56), f2 = new Float(3.6778);
		System.out.println("Add with generic method: " + ArithmeticOperations.add(f1, f2));
 
		System.out.println("Subtraction with generic method: " + ArithmeticOperations.sub(f1, f2));
		System.out.println("Division with generic method: " + ArithmeticOperations.div(f1, f2));
		
	}
}