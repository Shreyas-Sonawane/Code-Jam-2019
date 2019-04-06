
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc =new Scanner(System.in);
		    int t =sc.nextInt();
		    int r=t;
		    while(t-->0){
		        long N=sc.nextLong();
		        
		        int cno=r-t;
		        if(checkFour(N)){
		        long randomNum ;
		         int flag=1;
		         while(flag==1){
		             randomNum = ThreadLocalRandom.current().nextLong(1, N+1);
		             if(checkFour(randomNum)==false){
		                 flag=0;
		             }
		                if(flag==0){
		            long B=N-randomNum;
		        if(!checkFour(B)){
		             
		         System.out.println("Case #" +cno+ ":"+" "+randomNum+" "+B);
		        }
		        else{
		          flag=1;  
		        } 
		        }
		         }
		     
		  }
	}
		        
		    }
		 catch(Exception e) {
		    return;
		}
	}
	public static boolean checkFour(Long Num){
	    while(Num!=0){
	        long dig=Num%10;
	        if(dig==4){
	            return true;
	        }
	        Num=Num/10;
	    }
	    return false;
	}
}