//smallest 0f three using ternary operator

import java.util.*;
class Small_element_ternary
{
  public static void main(String[] args)
  {
     int a,b,c,min,temp;
     Scanner in = new Scanner(System.in);
     System.out.print("enter 3 integers:");
     a=in.nextInt();
     b=in.nextInt();
     c=in.nextInt();
     temp=(a<b)?a:b;
     min=(c<temp)?c:temp;
     System.out.print("smallest integer is"+min);
  }
}
