package revaturecodingexcercise;


import java.util.HashMap;

public class Student {
	public static void main(String[] args) {
		HashMap<String,Integer> grades=new HashMap<>();
		grades.put("Prasad01",99);
		grades.put("Sai02",58);
		grades.put("Mani03",89);
		grades.put("Pavan04", 69);
		grades.put("Saikumar05", 87);
		
		System.out.println("all students with grades :"+ grades);

		
		System.out.println("grade of student  : Mani03 ="+grades.get("Mani03"));
		
		grades.put("Mani03",75);
		
		grades.remove("sai02");
		
		System.out.println("all students with grades :"+ grades);

	}
}
