package pkg;
import java.io.File;
import java.util.*;
 
public class Filesear {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
 
		System.out.println("enter file name: ");
		String fil = scan.next();
		System.out.println("enter directory name: ");
		String dir = scan.next();
		
		File file = new File("D:\\"+dir+"\\"+fil);
 
		File directory = new File("D:\\"+dir);
		
		if(file.isFile()) {
			System.out.println(file.getName());
			
		}
		
		else if(directory.isDirectory()) {
			File[] files = directory.listFiles();
			
			for(File f:files) {
				System.out.println(f);
			}
		}
		
		else {
			System.out.println("file not found");
 
		}
	}
 
}
 