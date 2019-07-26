package ru.job4j.coffe_machine;

public class CoffeMachine {

    private final int[] coins = {10, 5, 2, 1};

    public int[] changes(int value, int price) {
        int change = value - price;
        int[] result = new int[quntityCoins(change)];
        int n = 0;
        for(int i = 0; i < coins.length; i++) {
            if(change / coins[i] != 0) {
                int p = 0;
                for(int j = 0; j < change / coins[i]; j++) {
                    result[n] = coins[i];
                    n++;
                    p++;
                }
                change = change - p * coins[i];
            }
        }
        return result;
    }

    int quntityCoins (int change) {
        int number = 0;
        for(int i = 0; i < coins.length; i++) {
            if (change / coins[i] != 0) {
                 number += change / coins[i];
                 change = change - coins[i]*(change / coins[i]);
            }
        }
        return number;
    }
}
