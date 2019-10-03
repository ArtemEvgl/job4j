package task;

import java.util.Arrays;

public class Task {

    public static int work(int[] numbers) {
        return Arrays.stream(numbers).filter(number -> number % 2 == 0).map(number -> number * number).
                reduce((number1, number2) -> number1 + number2).getAsInt();
    }
}
