package mathematicalPuzzle;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import mathematicalPuzzle.Q_5;

public class Q_5Test {
	@Test
	public void test() {
		assertThat(Q_5.coinCount(100), is(0));

	}

	@Test
	public void coinCountTest() {
		assertThat(Q_5.coinCount(14), is(5));
		assertThat(Q_5.coinCount(56), is(3));
		//一般的なテスト
		assertThat(Q_5.coinCount(15000), is(2));
		assertThat(Q_5.coinCount(17000), is(3));
		assertThat(Q_5.coinCount(18000), is(4));
		assertThat(Q_5.coinCount(18500), is(5));
		assertThat(Q_5.coinCount(18550), is(6));
		assertThat(Q_5.coinCount(18560), is(7));
		assertThat(Q_5.coinCount(18565), is(8));
		assertThat(Q_5.coinCount(18566), is(9));

		assertThat(Q_5.coinCount(5000), is(1));

		assertThat(Q_5.coinCount(2000), is(1));

		assertThat(Q_5.coinCount(1000), is(1));

		assertThat(Q_5.coinCount(500), is(1));

		assertThat(Q_5.coinCount(100), is(1));

		assertThat(Q_5.coinCount(50), is(1));

		assertThat(Q_5.coinCount(10), is(1));

		assertThat(Q_5.coinCount(5), is(1));

		assertThat(Q_5.coinCount(1), is(1));

	}


}
