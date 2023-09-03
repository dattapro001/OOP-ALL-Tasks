package ConsOverloadding;

public class Test {
  public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.printInformation();


        Teacher teacher2 = new Teacher("Chinmoy" , "Male");
        teacher2.printInformation();


        Teacher teacher3 = new Teacher("Rittika" , "Female" , 474556);
        teacher3.printInformation();
    }
}
