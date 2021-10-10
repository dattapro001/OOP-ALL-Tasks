import java.util.*;
public class Solve5 {

	public static void main(String[] args) {

		 Scanner scan=new Scanner(System.in);

	      int n;   
	      System.out.print("Enter the number of elements:");
	      n=scan.nextInt();     

	      int arr[]=new int[n];   
	      System.out.print("Enter the "+n+" of the array:");
	      for(int i=0; i<n ;i++)     
	      {
	          arr[i]=scan.nextInt();
	      }
	        System.out.print("Enter the Number to Search:");
	        int number=scan.nextInt();
	        int repeat=0;
	        for(int i=0;i<n;i++)
	        {
	            if(number==arr[i])
	            {
	                repeat++; 
	            }
	        }
	        
	        System.out.println(number+" occurred "+repeat+" times in array ");
	}
}
