class Book{
	String title, author, publication,edition;
	int page_num, price ;
	
	void showInfo(){
		System.out.println("Book Name->         "+title);
		System.out.println("Writer name->       "+author);
		System.out.println("Edition->           "+edition);
		System.out.println("Number of Pages->   "+page_num);
		System.out.println("Book Price->        "+price);
		System.out.println("Publishers->        "+publication);	
}	
}
public class Task2 {

	public static void main(String[] args) {
		
		Book Book1= new Book();
		Book1.title="JAVA for Beginners 3rd edition";
		Book1.author="Prof. David";
		Book1.edition="3";
		Book1.page_num=537;
		Book1.price=299;
		Book1.publication="Easy Coding Publications";
		Book1.showInfo();
		
		System.out.println(" \n ");	
		
		Book Book2= new Book();
		Book2.title="Omega Point 12th edition";
		Book2.author="Humayun Ahmed";
		Book2.edition="12";
		Book2.page_num=122;
		Book2.price=128;
		Book2.publication="Shomoy Prokashoni";
		Book2.showInfo();
		
		System.out.println(" \n ");	
		
		Book Book3= new Book();
		Book3.title="Digital Fortress 5th edition";
		Book3.author="Dan Brown";
		Book3.edition="5th";
		Book3.page_num=356;
		Book3.price=520;
		Book3.publication="St. Martin Press";
		Book3.showInfo();
		
		System.out.println(Book1);	
		System.out.println(Book2);	
		System.out.println(Book3);
		System.out.println(" \n ");
		
		Book1=Book3;
		Book1.edition = "1";
		Book3.showInfo();
		System.out.print("\n");
		
		System.out.println(Book1);	
		System.out.println(Book2);	
		System.out.println(Book3);
}
		
}
