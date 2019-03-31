package ru.job4j.geometria;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class PaintTest {
	@Test
 	public void whenDrawSquare() {
		 PrintStream stdout = System.out;
		 ByteArrayOutputStream out = new ByteArrayOutputStream();
		 System.setOut(new PrintStream(out));
		 new Paint().draw(new Square());
		 assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append("+     +")
                                .append("+     +")
                                .append("++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
		PrintStream stdout = System.out;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		new Paint().draw(new Triangle());
		assertThat(
				new String(out.toByteArray()),
				is(
						new StringBuilder()
								.append(" + ")
								.append("+ +")
								.append("+++")
								.append(System.lineSeparator())
								.toString()
				)
		);
	}
}