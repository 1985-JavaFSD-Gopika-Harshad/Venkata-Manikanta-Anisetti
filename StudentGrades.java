package revaturecodingexcercise;


import java.util.LinkedHashMap;

public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> grades=new LinkedHashMap<>();
		//adding details..
		
		grades.put("student01", 99);
		grades.put("student02", 52);
		grades.put("student03", 70);
		grades.put("student04",39);
		grades.put("student05", 56);
		grades.put("student06", 93);
		
		System.out.println(grades);
		
		for(String id:grades.keySet()) {
			System.out.println("Grade for "+id+" is : "+grades.get(id));
		}
		
		
	}

}
