package ChinmoyDatta;

/*
 Chinmoy Datta Priom
 2012020311
 G
 cse_2012020311@lus.ac.bd
 15/09/2021
 */

public class Cricket extends Sports {
	
    public String matchType;
   public int over;
   Player any;
   Cricket(String matchTyp,int overNum,String playerName,int jerNum)
   {
       matchType=matchTyp;
       over=overNum;
       any=new Player(playerName,jerNum);
   }
   public void display()
   {
       System.out.println(matchType+" "+over+" "+any.playerName+" "+any.jerseyNumber);
   }
   
}