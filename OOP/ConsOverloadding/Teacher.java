package ConsOverloadding;

public class Teacher {
    String name ,  gender;
    int phone;


    //Creating a Default contructor
    Teacher(){
        System.out.println("This is default constructor");
    }

    Teacher(String n , String m){
         name = n;
         gender = m;
    }

    Teacher(String n, String m , int ph){
            name = n;
            gender = m;
            phone = ph;
    }

     //Mathods without parameter
    void printInformation(){ //no return or return nothing 
    System.out.println("Name : " +name);
    System.out.println("Gender : " +gender);
    System.out.println("Phone : " +phone);
     System.out.println("\n \n");
 }
}
