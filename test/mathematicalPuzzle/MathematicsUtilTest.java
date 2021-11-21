package mathematicalPuzzle;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class MathematicsUtilTest {

	@Test
	public void combinationTest() {
		assertThat(MathematicsUtil.combination(5,2),is(10L));
		assertThat(MathematicsUtil.combination(5,1),is(5L));
		assertThat(MathematicsUtil.combination(15,14),is(15L));

		assertThat(MathematicsUtil.combination(10,0),is(1L));

		assertThat(MathematicsUtil.combination(1,1),is(1L));
		assertThat(MathematicsUtil.combination(6,6),is(1L));

		assertThat(MathematicsUtil.combination(1,6),is(0L));
		assertThat(MathematicsUtil.combination(0,10),is(0L));
		assertThat(MathematicsUtil.combination(0,0),is(1L));

		assertThat(MathematicsUtil.combination(20,19),is(20L));

	}

	@Test
	public void combinationSumTest() {
		assertThat(MathematicsUtil.combinationSum(3, 1),is(7L));
	}

	@Test
	public void methodtest() {

		long k=21L;
		long i=k-1;
		while(i!=0) {
			k=k*i;
			i=i-1;
		}
		System.out.println(k);
	}
	
	@Test
	public void permutation() {
		assertThat(MathematicsUtil.permutation(5,3), is(60L));
		assertThat(MathematicsUtil.permutation(15,8), is(259459200L));
		
		assertThat(MathematicsUtil.permutation(-5,3), is(0L));
		assertThat(MathematicsUtil.permutation(5,-3), is(0L));
		assertThat(MathematicsUtil.permutation(-5,-3), is(0L));
		
		assertThat(MathematicsUtil.permutation(5,7), is(0L));
		
		assertThat(MathematicsUtil.permutation(5,5), is(1L));
		assertThat(MathematicsUtil.permutation(0, 0), is(1L));
		assertThat(MathematicsUtil.permutation(7, 0), is(1L));
		
		assertThat(MathematicsUtil.permutation(2,1), is(2L));
		assertThat(MathematicsUtil.permutation(3,2), is(6l));
		assertThat(MathematicsUtil.permutation(50,10), is(37276043023296000L));
		
	}

}
