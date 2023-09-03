package ParaMethods;

public class Teacher{
 String name , gender;
 int phone;

 //Mathods with parameter
 void paraMet(String n, String m, int ph){
        name = n;
        gender = m;
        phone = ph;
 }


 //Mathods without parameter
 void printInformation(){ //no return or return nothing 
   System.out.println("Name : " +name);
   System.out.println("Gender : " +gender);
   System.out.println("Phone : " +phone);
}
}