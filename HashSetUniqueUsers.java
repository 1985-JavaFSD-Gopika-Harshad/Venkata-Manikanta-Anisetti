package revaturecodingexcercise;


import java.util.HashSet;

public class HashSetUniqueUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> userNames=new HashSet<>();
		
		//adding usernames..
		userNames.add("Manikanta");
		userNames.add("Sai Kiran");
		userNames.add("Pavan Sai");
		userNames.add("Prasad");
		userNames.add("Babulal");
		
		
		System.out.println(userNames);
		
		// .contains() method to check existing user 
		if(userNames.contains("Manikanta")) {
			System.out.println("user Existed");
		}else {
			System.out.println("Not Existed");
		}
		
		// .remove() to remove user
		userNames.remove("Pavan Sai");
		System.out.println("After Removing user :"+userNames);

	}

}