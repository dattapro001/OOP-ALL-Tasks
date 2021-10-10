class BillCalculator{
	
	double Bill= 0;
     double  calculateBasicBill (double unit) {
			if(unit<=199);
			{
				Bill=1.20*unit;
	        }
		if(unit>=200 && unit<400);
		  {
			  Bill=1.50*unit;
		  }
		  if (unit>=200 && unit<400);
		  {
			  Bill=1.80*unit;
		  }
		  if(unit>=600);
		 {
			 Bill=2.00*unit;
		 }
		 if(unit==0||Bill<100);
		   {
		   Bill=100*unit;
	     	}
		 return Bill;
	}
      double calculateSurcharge(double BasicBill){
    	 return Bill * 0.15;	   	  
      }
      double getTotalBill(double unit) {
    	  double Basic,charge=0;
    	  Basic=calculateBasicBill (unit);
    	  if(Basic>400)
    	  {
    		  charge=calculateSurcharge(Basic);
    	  }
    	  return Basic+charge;
      }  
}
public class Task3 {

	public static void main(String[] args) {
		
   double total;
   BillCalculator bill;
    bill=new BillCalculator();
    
   total=bill.getTotalBill(25);
   System.out.println(total);
   
   total=bill.getTotalBill(250);
   System.out.println(total);
   
   total=bill.getTotalBill(812);
   System.out.println(total);
	}
}
