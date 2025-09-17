package firstProgram;


public class CoreJava {

	public static void main(String[] args) {
		//-------------------------variables------------------------------
	
		int num=5;
		String name="Ishu Pathak";
		char character= 'r';
		double dec = 7.67; 
		boolean tf=true;
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(character);
		System.out.println(dec);
		System.out.println(tf);
		
		System.out.println(tf+" boolean value");
		
		
		//  Arrays in java 
		 // Stores multiples values in a single variable
		
		int[] ARR = new int [5];   //array creation
		ARR[0]=1;                 //array initialization     //1st method
		ARR[1]=23;
		ARR[2]=2;
		ARR[3]=3;
		ARR[4]=4;
		
		
		int[] arr2= {1,2,3,4,5};     //array creation   2nd method
		System.out.println("value of arr2 in second index is "+arr2[2]);
		
		// ------------------For loop-----------------------------
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println("values in each loop is "+arr2[i]);
			
		}
		
		String[] myName= {"Ishu","Kumar","Pathak"};
		
		for(int i=0;i<myName.length;i++) {
			System.out.println("names -> "+myName[i]);
			
		}
		
		//     enhanced for loop
		for(String s:myName) {
			System.out.println("names through enhanced forr loop -> "+s);
		}
		
		
	}

}
