package pkg;
import java.util.Arrays;
import java.util.Scanner;
public class Stringexercise {
	public static void main(String[] args) {
	String hi = "Hi, ";
	String mom = "mom.";
	String s = hi.concat(mom);
	System.out.println(hi+mom);
	System.out.println(s);
	System.out.println("**************");
	Scanner myObj = new Scanner(System.in);
	System.out.println("enter a string to find initial:");
	String str = myObj.nextLine();
	System.out.println(str.charAt(0));
	System.out.println("**************");
	
	System.out.println("enter string1 for anagram:");
	String str1 = myObj.nextLine();
	System.out.println("enter string2 for anagram:");
	String str2 = myObj.nextLine();
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	str1= str1.replaceAll("[^a-zA-Z0-9]","");
	str2 = str2.replaceAll("[^a-zA-Z0-9]","");
	char[] array1= str1.toCharArray();
	char[] array2 = str2.toCharArray();
	Arrays.sort(array1);
	Arrays.sort(array2);
	if(Arrays.equals(array1,array2)) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("Not a anagram");
	}
	}
}