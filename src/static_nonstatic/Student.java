package static_nonstatic;

public class Student {
	public String firstName;
	public String lastName;
	 static String collegeName;
	public static int age;
	
	 public String getFirstName() {
		 System.out.println(collegeName);
		 return firstName;
	 }
	 public String getLastName() {
		 System.out.println(firstName);
		 System.out.println(lastName);
		 
		 return lastName;
		 
	 }
	 public static String getCollegeName() {
		 return collegeName;
		 
	 }

}
