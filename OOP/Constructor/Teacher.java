package Constructor;

public class Teacher{
 String name , gender;
 int phone;

 //Constructor with parameter
 Teacher(String n , String m , int ph){
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