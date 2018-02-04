

import java.lang.*;

public class SystemDemo {

   public static void main(String[] args) {
	   
	   String[] found = {"one", "two", "three", "four", "five"};
	   String[] y = new String[10];
    
      // copies an array from the specified source array
      System.arraycopy(found, 3, found, found.length - 3 - 1);
     
      

   }
}