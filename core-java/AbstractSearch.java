package phase;
 

public abstract class AbstractSearch {
    public abstract boolean search(Object[] obj_list, Object obj);
    public static void main(String[] args) {
        Integer[] integer_list = {1, 2, 3, 4, 5};
        String[] string_list = {"apple", "banana", "cherry", "date"};
 
        IntegerSearch integer_search = new IntegerSearch();
        StringSearch string_search = new StringSearch();
 
        System.out.println("Integer search results:");
        System.out.println("Search for 3: " + integer_search.search(integer_list, 3));  // True
        System.out.println("Search for 6: " + integer_search.search(integer_list, 6));  // False
 
        System.out.println("\nString search results:");
        System.out.println("Search for \"banana\": " + string_search.search(string_list, "banana"));  // True
        System.out.println("Search for \"grape\": " + string_search.search(string_list, "grape"));    // False
    }
 
}
