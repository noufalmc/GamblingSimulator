/*
Author:Noufal MC
Date:29/12/2021
* */
import java.util.Random;
public class GamblingSimulator {
    //Initialize the value
    static  int START=100;
    static final int BET=1;
    public static void WinorLoss()
    {
      Random ra=new Random();
      int VALUE=ra.nextInt(2    );
      if(VALUE==1)
      {
          System.out.println("Won the Game");
      }
      else
      {
          System.out.println("Loss the Game");
      }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcom Gambling Simulator");
        WinorLoss();
    }
}
