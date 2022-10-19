package td1;
import java.util.Scanner;

 public class testtd1main {

	public static void main(String[] args) {
		Livre l1 = new Livre("Victor Hugo", "Notre Dame de Paris");
		       l1.setNbPages(40);
	    Livre l2 = new Livre("Emile Zola", "La bête humaine");
	           
	    
	    System.out.println(l1.getNbPages());
	    
	       if (l1.getAuteur()==l2.getAuteur()) {
	    	   System.out.println(l2.getAuteur());	    	  
          } 
	       else 
	    	   System.out.println("l'auteur n'est pas le meme");
       }
	     
	  
	 
	}
