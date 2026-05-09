package INTERVIEW;

public class DuplicateNumber {
public static void main(String[]args) {
	int[] arr= {1,4,4,5};
	
	for(int i = 0;i < arr.length;i++) {
		int index=Math.abs(arr[i]);
		
		if(arr[index] < 0) {
			System.out.println("Duplicate values : "+ index);
			return;
			
		}
		arr[index] = -arr[index];
	}
	
}
}
