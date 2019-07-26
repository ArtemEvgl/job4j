package ru.job4j.geometria;

import org.junit.Test;
import ru.job4j.coffe_machine.CoffeMachine;

import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoffeMachineTest {
    @Test
    public void changeHunred() {
        CoffeMachine coffeMachine = new CoffeMachine();
        int[] result = {10,10,10,10,10};
        assertThat(coffeMachine.changes(100,50), is(result));
    }

    @Test
    public void changeFifty() {
        CoffeMachine coffeMachine = new CoffeMachine();
        int[] result = {10,5};
        assertThat(coffeMachine.changes(50,35), is(result));
    }
}
