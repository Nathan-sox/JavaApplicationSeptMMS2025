public class EnhancedForLoop{
	public static void main(String[] args){
		String[] names = {"John", "Jack", "Mary", "James", "Lucy"};
		int[] marks = {69, 80, 100, 70};
		/*
		for(int i = 0; i <= 5; i ++){
			if (marks[i] >= 75){
				System.out.printf("Student name: %s %n", names[i]);
				System.out.printf("Student Mark: %s %n", marks[i]);
				System.out.println("Grade: A");
			}
			else if (marks[i] >= 65){
				System.out.printf("Student name: %s %n", names[i]);
				System.out.printf("Student Mark: %s %n", marks[i]);
				System.out.println("Grade: B");
			}
			else if (marks[i] >= 55{
				System.out.printf("Student name: %s %n", names[i]);
				System.out.printf("Student Mark: %s %n", marks[i]);
				System.out.println("Grade: C");
			}
			else if (marks[i] >= 45){
				System.out.printf("Student name: %s %n", names[i]);
				System.out.printf("Student Mark: %s %n", marks[i]);
				System.out.println("Grade: D");
			}
			else if (marks[i] >= 30){
				System.out.printf("Student name: %s %n", names[i]);
				System.out.printf("Student Mark: %s %n", marks[i]);
				System.out.println("Grade: F");
			}// Traditional For Loop
		} */
		
		System.out.println("The Student names are:");
		for(String name: names){
			System.out.printf("%s%n", name);
		}
		
		for(String name: names)
	}
}