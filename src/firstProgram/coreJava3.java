package firstProgram;

public class coreJava3 {
    public static void main(String[] args) {
        
    //  -----------------string is an object of class---------
    //string literal  
    String name1="Ishu Pathak";       //creates a single instance of string object if its value is same
    String name2="Ishu Pathak";   

     //string with new operator
    String name3=new String("Ishu Pathak");   //creates a new instance of string object if its value is same 
    String name4= new String("Ishu Pathak");

    String s= new String("Ishu Kumar Pathak");
    String[] splitstring=  s.split("Kumar ");  //split the string into array
    System.out.println(splitstring[0]);
    System.out.println(splitstring[1]);
   
    for(int i=0;i<s.length();i++) {
        System.out.println("character at "+s.charAt(i));   //print char by char
    }

    //print the strign in reverse order
    for(int i=s.length()-1;i>=0;i--) {
        System.out.println("character at reverse order "+s.charAt(i));   //print char by char
    }



    System.out.println(s);
    }

}
