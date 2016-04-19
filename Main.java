//TODO: Bradley/Thor
//TODO: 
//Practice 2013 - 01: Gradabase
import java.util.Scanner;

public class Main{
   public static void main(String[] args)throws Exception {
      Scanner scan = new Scanner(new java.io.File("in-out\\sample.in"));
      //Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      for(int i = 0; i < n; i++)
      {
         System.out.println("Case "+ (i+1) +":");
         int m = scan.nextInt();
         for(int j = 0; j < m; j++)
         {
            int num = scan.nextInt();
            if(num<6)
               System.out.println(num+1);
         }
      }
      System.exit(0);
   }
}
