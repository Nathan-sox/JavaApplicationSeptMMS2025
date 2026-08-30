public class OneDimentionalArray{
	public static void main(String[] args){
		int num = 15;
		int[] numbers = {2,4,5,8,12,15,20,25,26,30};
		
		int index = 5;
		
		System.out.printf("The element at index number %d is %d%n", index, numbers[index]);
		
		
		System.out.println("Transversing through the element of the index");
		System.out.println("=============================================");
		System.out.println();
		
		for(int i  = 0; i <= numbers.length(); i++){
			System.out.printf("%d%n", numbers[i]);
		}
	}
}