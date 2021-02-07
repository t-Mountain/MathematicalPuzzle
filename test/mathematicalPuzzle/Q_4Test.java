package mathematicalPuzzle;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import mathematicalPuzzle.Q_4;

public class Q_4Test {


	@Test
	public void parseIntTest() {

		LocalDateTime dateTime = LocalDateTime.of(2020, 1, 30, 0, 0, 5);
		int[] data = Q_4.parseInt(dateTime);

		assertThat(data.length, is(6));
		assertThat(data[0], is(0));
		assertThat(data[1], is(0));
		assertThat(data[2], is(0));
		assertThat(data[3], is(0));
		assertThat(data[4], is(0));
		assertThat(data[5], is(5));

		LocalDateTime dateTime2 = LocalDateTime.of(2020, 1, 30, 23, 24, 12);
		int[] data2 = Q_4.parseInt(dateTime2);

		assertThat(data2.length, is(6));
		assertThat(data2[0], is(2));
		assertThat(data2[1], is(3));
		assertThat(data2[2], is(2));
		assertThat(data2[3], is(4));
		assertThat(data2[4], is(1));
		assertThat(data2[5], is(2));
	}

	@Test
	public void dataSycle() {

		LocalDateTime dateTime = LocalDateTime.of(2020, 1, 30, 0, 0, 59);
		LocalDateTime dateTimeExpect = LocalDateTime.of(2020, 1, 30, 0, 1, 0);
		dateTime = dateTime.plusSeconds(1);

		assertThat(dateTime.equals(dateTimeExpect), is(true));

		LocalDateTime dateTime2 = LocalDateTime.of(2020, 1, 30, 0, 59, 59);
		LocalDateTime dateTime2Expect = LocalDateTime.of(2020, 1, 30, 1, 0, 0);
		dateTime2 = dateTime2.plusSeconds(1);

		assertThat(dateTime2.equals(dateTime2Expect), is(true));

		LocalDateTime dateTime3 = LocalDateTime.of(2020, 1, 30, 23, 59, 59);
		LocalDateTime dateTime3Expect = LocalDateTime.of(2020, 1, 31, 0, 0, 0);
		dateTime3 = dateTime3.plusSeconds(1);

		assertThat(dateTime3.equals(dateTime3Expect), is(true));
	}

}
