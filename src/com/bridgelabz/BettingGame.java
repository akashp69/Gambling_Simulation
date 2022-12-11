package com.bridgelabz;

public class BettingGame {
    static int TOTAL_MONEY = 100;
    static int totalMoney = 0;
    static int noOfPlays = 1;
    static int count = 0;
    static int WINNING_AMOUNT = 0;
    static int LOSING_AMOUNT = 0;

    /**
     * This method is used for gambler stake $100 everyday and $1 on every game
     */
    public void startStake() {
        TOTAL_MONEY = 100;
        int startGame = TOTAL_MONEY - 1;
        System.out.println("After first Stake Remaining Money = " + startGame + "$");
    }

    /**
     *This is main method is used for calling methods
     */
    public static void main(String[] args) {
        System.out.println("Gambler have 100$ to Bet");
        System.out.println("Gambler's total Money = " + TOTAL_MONEY + "$");
        BettingGame firstStake = new BettingGame();
        firstStake.startStake();

    }
}
