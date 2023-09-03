package ParaMethods;

public class Test{
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        //Calling the parameter Mathods with information
        teacher1.paraMet("Chinmoy", "Male", 98654);

        //Calling the Mathods
        teacher1.printInformation();
    }
    
}