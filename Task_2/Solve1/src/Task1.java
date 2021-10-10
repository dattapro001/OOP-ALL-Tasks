class Book{
	String title, author, publication,edition;
	int page_num, price;
	
	void showInfo(){
		System.out.println("Book Name->         "+title);
		System.out.println("Writer name->       "+author);
		System.out.println("Edition->           "+edition);
		System.out.println("Number of Pages->   "+page_num);
		System.out.println("Book Price->        "+price);
		System.out.println("Publishers->        "+publication);	
}
}
    public class Task1 {
	public static void main(String[] args) {
		Book Book1= new Book();
		
		Book1.title="Greek Mythology Adi Theke Ontho.";
		Book1.author="S M Niwaj Mowla";
		Book1.edition="4";
		Book1.page_num=2345;
		Book1.price=750;
		Book1.publication="rokomari.com.";
		
		Book1.showInfo();
	}
	}