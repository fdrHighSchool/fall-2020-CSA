import java.util.*;
import java.io.*;

public class AOC2{
  public static void main(String[] args) {
    
    try{
      Scanner s = new Scanner(new File("data.txt"));

      while(s.hasNext()){
        System.out.println(s.next());
      }//end while loop

      s.close();
    }//end try

    catch(Exception e){
      System.out.println("file not found");
    }//end catch
  }//end main method


}//end class
