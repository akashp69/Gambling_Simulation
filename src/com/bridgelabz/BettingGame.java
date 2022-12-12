package com.bridgelabz;


import java.util.Random;

public class BettingGame {
    /**
     * starting with a stake of $100 every day and bet $1 every game.
     * Genrate a random in static
     * make $1 bet so either win or loose $1
     */
    public static final  int initialStake = 100;
    public static final int stakeBet = 1;
    static Random random = new Random();

    /**
     * This is Main Method is used for calling  static and instance variables
     */
    public static void main(String[] args)
    {
        int totalStake = initialStake;

        System.out.println("Welcome to Gambling Game Simulator program");
        /**
        *Genrate random Numbers in range 0,1
         */
        int play = random.nextInt(2);

        switch(play)
        {
            case 0:
                totalStake = totalStake - stakeBet;
                System.out.println("Loose the Bet");
                System.out.println("Stake after loosing: "+totalStake);
                break;
            case 1:
                totalStake = totalStake + stakeBet;
                System.out.println("Won the Bet");
                System.out.println("Stake after winning: "+totalStake);
                break;
        }

    }

}
