import java.util.*;

public class Que2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum1=0,sum2=0,num1;
        while(num>0) {
            num1 = num % 10;
            if (num1 % 2 == 0) {
                sum1 = sum1 + num1;
            }
            else
            {
                sum2 = sum2 + num1;
            }
            num = num / 10;
        }
          if(sum1==sum2)
          {
              System.out.println("Yes Topper number");
          }
          else
          {
              System.out.println("No not a Topper number");
          }
      }
    }

