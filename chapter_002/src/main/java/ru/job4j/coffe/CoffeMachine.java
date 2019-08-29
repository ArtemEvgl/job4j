package ru.job4j.coffe;

public class CoffeMachine {

    private final int[] coins = {10, 5, 2, 1};

    public int[] changes(int value, int price) {
        int change = value - price;
        int[] result = new int[quntityCoins(change)];
        int n = 0;
        for (int coin : coins) {
            if (change / coin != 0) {
                int p = 0;
                for (int j = 0; j < change / coin; j++) {
                    result[n] = coin;
                    n++;
                    p++;
                }
                change = change - p * coin;
            }
        }
        return result;
    }

    int quntityCoins(int change) {
        int number = 0;
        for (int coin : coins) {
            if (change / coin != 0) {
                number += change / coin;
                change = change - coin * (change / coin);
            }
        }
        return number;
    }
}
