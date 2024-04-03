package javaproj;


import java.util.ArrayList;
import java.util.List;
 
public class FriendFinder {
    public static void main(String[] args) {
        List<FriendshipCriteria<String, String>> friends = new ArrayList<>();
        friends.add(new FriendshipCriteria<>("Alice", "New York"));
        friends.add(new FriendshipCriteria<>("Bob", "Los Angeles"));
        friends.add(new FriendshipCriteria<>("Charlie", "Chicago"));
 
        String targetLocation = "Chicago"; // Example: Find friends in this location
 
        for (FriendshipCriteria<String, String> friend : friends) {
            if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
                System.out.println(friend.getName() + " is a friend.");
            }
        }
    }
}