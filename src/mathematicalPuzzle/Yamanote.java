package mathematicalPuzzle;

public class Yamanote {

	public static void main(String[] args) {
		long sum =
				MathematicsUtil.combinationSum(15, 1) +
				MathematicsUtil.combinationSum(12, 1) +
				1;

		System.out.println(sum);
	}

}
