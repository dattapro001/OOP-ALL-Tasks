import java.util.Scanner ;
class SeriesPrinter {
	private static Scanner sc;
	
	void printSeries  (int n) {
		int natural, i;
		
		sc = new Scanner(System.in);
		
	System.out.print("Enter any Number : ");
	natural = sc.nextInt();	
		
		for(i = 0; i <= 5; i++)
		{
			System.out.print(i +" ");
			
		}
	}
	
	void printSeries(int startIndex, int endIndex) {
		
           int  i;
		
		for(i = startIndex; i <= endIndex; i++)
		{
			System.out.print(i +" ");
			
		}
		}	
	void printSeries(int startIndex, int endIndex, int interval) {
		
		 int  i;
		 for(i = startIndex; i <= endIndex ; interval++) {
			System.out.print(i +" ");
		}
	}
	
	 }
public class Task_2 {

	public static void main(String[] args) {
		
		SeriesPrinter one=new SeriesPrinter ();
		one.printSeries(0);
		
		System.out.print("\n");
		SeriesPrinter two=new SeriesPrinter ();
		two.printSeries(5,10);
		
		System.out.print("\n");
		SeriesPrinter three=new SeriesPrinter ();
		three.printSeries(5,15,3);
	
		
	}

}
