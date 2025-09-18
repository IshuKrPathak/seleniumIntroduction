package firstProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

		//-----------------ArrayList -----------------------------
		// Array list is a object of class.````````
		ArrayList<String> A = new ArrayList();
		A.add("Pishu");
		A.add("Soni");
		A.add("Ankit");
		A.add("Rohan");
		A.add("manish");
		A.remove(1);
		System.out.println(A);
		System.out.println(A.get(1)); //get element from arraylist
		System.out.println(A.size());  //size of arraylist
		System.out.println(A.contains("Pishu"));   //checking the presence of element in arraylist
		System.out.println(A.isEmpty()); //checking the arraylist is empty or not
		System.out.println(A.indexOf("Ankit")); //index of element in arraylist
		A.clear();  //clear the arraylist
		System.out.println(A);

		for(int i=0;i<A.size();i++) {
			System.out.println("Simple For Loop ->"+A.get(i));
		}

		for(String s:A) {
			System.out.println("Enhanced For loop -> "+s);
		}

		//item is present on aerraylist or not	
		String[] nameStrings= {"Pishu","Soni","Ankit","Rohan","manish"};
		List<String> namelist= Arrays.asList(nameStrings);  //convert normal array into arraylist
		System.out.println(namelist);
		System.out.println(namelist.contains("Pishu"));


		
	}
}

	