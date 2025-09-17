package firstProgram;


public class CoreJava2 {
	public static void main(String[] args) {
		
		//  -------------------If Else Loop-----------------------------
		int []  arr= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				System.out.println("Multiples of 2 are "+arr[i]);
			}
			else {
				System.out.println("Not Multiples of 2 are "+arr[i]);	
			}
		}
		
	}
}
