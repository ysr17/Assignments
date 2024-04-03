package javaproj;
import java.util.List;
import java.util.Scanner;
public class GenericSwapp {
    public static <T> int[] swap(int[] a, int firstPos, int secondPos) {
        if (firstPos < 0 || firstPos >= a.length || secondPos < 0 || secondPos >= a.length) {
            throw new IndexOutOfBoundsException("Invalid index. Ensure both positions are within bounds.");
        }
 
        int temp = a[firstPos];
        a[firstPos] = a[secondPos];
        a[secondPos] = temp;
 
        return a;
    }
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] a = new int[5];
    	for(int i=0; i<a.length; i++) {
    		a[i]=sc.nextInt();
    	}
        swap(a, 1, 2);
        for (Integer n : a) {
            System.out.print(n + " ");
        }
        
    }
}