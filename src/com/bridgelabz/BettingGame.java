package com.bridgelabz;


import java.util.Random;

public class BettingGame {
    /**
     * starting with a stake of $100 every day and bet $1 every game.
     * Genrate a random in static
     * As a Calculative Gambler if won or lost 50% of the stake, would resign for the day
     */
    public static final  int initialStake = 100;
    public static final int stakeBet = 1;
    public static final float percentage50 = (initialStake / 100) * 50;
    public static final float highestStake = percentage50 + initialStake;
    public static final float lowestStake = percentage50 - initialStake;
    static Random random = new Random();

    /**
     *This is Main Method is used for the calling the static and instance variables
     */

    public static void main(String[] args)
    {
        int totalStake = initialStake;

        System.out.println("Welcome to Gambling Game Simulator program");
        while(totalStake < highestStake && totalStake > lowestStake) {
            /**
            *Genrate random Numbers in range 0,1
             */
            int play = random.nextInt(2);

            switch(play)
            {
                case 0:
                    totalStake = totalStake - stakeBet;
                    System.out.println("Stake after loosing: "+totalStake);
                    break;
                case 1:
                    totalStake = totalStake + stakeBet;
                    System.out.println("Stake after winning: "+totalStake);
                    break;
            }

        }
        if(totalStake == highestStake)
            System.out.println("Gambler won by: " +totalStake);
        else
            System.out.println("Gambler lost by: " +totalStake);
    }

}
