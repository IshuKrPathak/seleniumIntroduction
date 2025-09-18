package firstProgram;

public class coreJava4 {
    public static void main(String[] args) {
        //---------------methods in java-----------------
        //method is a block of code which is used to perform a specific task
        //method is also known as function

        //🔴🔴🔴  method is not created inside public sttatic void main block 
            coreJava4 obj= new coreJava4();  //creating object of class to call the method
            obj.getData();   //calling the method using object
            String name=obj.getName();  //calling the method using object
            System.out.println(name);



    }
    //syntax of method
    public void getData(){     // returning void 
        System.out.println("This is getData method returning void");
        
    }

    public String getName(){   //returning string
        String name="Ishu Pathak";
        return name;
    }   

}
