package ru.job4j.tracker;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.function.Consumer;

import static org.junit.Assert.assertThat;

public class OutputInformationTest {

    private final Tracker tracker = new Tracker();
    private final Item item1 = tracker.add(new Item("test name1", "decs1", System.currentTimeMillis()));
    private final Item item2 = tracker.add(new Item("test name2", "decs2", System.currentTimeMillis()));
    private final StringBuilder menu = new StringBuilder()
                                                    .append("Меню.")
                                                    //.append(System.lineSeparator())
                                                    .append("1. Добавить новую заявку")
                                                    //.append(System.lineSeparator())
                                                    .append("2. Показать все заявки")
                                                    //.append(System.lineSeparator())
                                                    .append("3. Исправить заявку")
                                                    //.append(System.lineSeparator())
                                                    .append("4. Удалить заявку")
                                                    //.append(System.lineSeparator())
                                                    .append("5. Найти заявку по id")
                                                    //.append(System.lineSeparator())
                                                    .append("6. Найти заявки по имени");
                                                    //.append(System.lineSeparator());

    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final Consumer<String> consumer = new Consumer<String>() {
        // поле содержит дефолтный вывод в консоль.
        PrintWriter writer = new PrintWriter(out);
        @Override
        public void accept(String s) {
           writer.write(s);
           writer.flush();
        }
    };


//    @Before
//    public void loadOutput() {
//        System.out.println("execute before method");
//        System.setOut(new PrintStream(this.out));
//    }
//
//    @After
//    public void backOutput() {
//        System.setOut(this.stdout);
//        System.out.println("execute after method");
//    }


    @Test
    public void showAllRequest() {
        Input input = new StubInput(new String[] {"2", "y"});
        new StartUI(tracker, input, consumer).init();
        assertThat(
               this.out.toString(),
                Is.is(
                        new StringBuilder()
                                .append(menu)
                                .append("------------ Вывод всех заявок --------------")
                                //.append(System.lineSeparator())
                                .append("id: " + item1.getId() + ", name: test name1, description: decs1, time: " + item1.getTime())
                                //.append(System.lineSeparator())
                                .append("id: " + item2.getId() + ", name: test name2, description: decs2, time: " + item2.getTime())
                                //.append(System.lineSeparator())
                                .toString()
                )
        );
    }

    @Test
    public void showById() {
        Input input = new StubInput(new String[] {"5", item1.getId(), "y"});
        new StartUI(tracker, input, consumer).init();
        assertThat(
                this.out.toString(),
                Is.is(
                        new StringBuilder()
                                .append(menu)
                                .append("------------ Поиск заявки по ID --------------")
                                //.append(System.lineSeparator())
                                .append("id: " + item1.getId() + ", name: test name1, description: decs1, time: " + item1.getTime())
                                //.append(System.lineSeparator())
                                .toString()
                )
        );
    }

    @Test
    public void showByName() {
        Input input = new StubInput(new String[] {"6", item1.getName(), "y"});
        new StartUI(tracker, input, consumer).init();
        assertThat(
                this.out.toString(),
                Is.is(
                        new StringBuilder()
                                .append(menu)
                                .append("------------ Поиск заявок по имени--------------")
                                //.append(System.lineSeparator())
                                .append("id: " + item1.getId() + ", name: test name1, description: decs1, time: " + item1.getTime())
                                //.append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
