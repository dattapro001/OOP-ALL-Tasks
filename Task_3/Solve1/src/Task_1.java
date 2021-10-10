class Samsung {
	int camera,call_feature,internet;
	
		Samsung(){
			
			camera=8;
		 	call_feature=34;         
			internet=4;   
			
		System.out.println( "Camera Pixel->" + camera);
		System.out.println( "Contact Number->" + call_feature);
		System.out.println( "internet speed Suppurted->" + internet);
				}

         Samsung(int camera,int call_feature,int internet ){
	
        	this.camera= camera;   
        	System.out.println( "Camera Pixel->" + camera);
     		this.call_feature=call_feature; 
     		System.out.println( "Contact Number->" + call_feature);
     		this.internet=internet; 
     		System.out.println( "internet speed Suppurted->" + internet);           
}
       
}
public class Task_1 {

	public static void main(String[] args) {
		Samsung mobile1;
		 mobile1=new Samsung();
		
		System.out.println( "\n");
		 
		Samsung mobile2;
		mobile2=new Samsung(12,013,3);
		
		System.out.println( "\n");
		
		Samsung mobile3;
		 mobile3=new Samsung(5,015,2);
	
	}
	}

	
		
		
		
	
	
	
	
	
	

		

	



