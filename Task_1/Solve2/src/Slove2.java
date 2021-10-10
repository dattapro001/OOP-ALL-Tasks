import java.util.Scanner;
public class Slove2 {

	public static void main(String[] args) {
		 int positive=0, nagetive=0, zero=0, i;
	        int arr[] = new int[10];
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter 10 Numbers : ");
	        for(i=0; i<10; i++)
	        {
	            arr[i] = scan.nextInt();
	        }
	        for(i=0; i<10; i++)
	        {
	            if(arr[i] < 0)
	            {
	                nagetive++;
	            }
	            else if(arr[i] >= 0)
	            {
	                positive++;
	            }
	          
	        }
			
	        System.out.print(positive + " Positive Numbers");
	        System.out.print("\n" + nagetive + " Negative Numbers");

	}

}
