package mathematicalPuzzle;

public class MathematicsUtil {

	/**
	 * コンビネーションを計算するメソッド
	 * @param m
	 * @param n
	 * @return
	 */
	public static long combination(long m, long n) {

		if(m<n) {
			return 0;
		} else {
			if(n==0) {
				return 1;
			}

			long fraction = m;
			long denominator = n;
			m=m-1;
			n=n-1;

			//longのデータ範囲を超えてしまうため
			//21!までの計算までのみ保証
			//効率のよい計算方法を考える
			while(n!=0) {
				fraction = fraction*m;
				denominator = denominator*n;
				m=m-1;
				n=n-1;
			};
			return fraction/denominator;

		}
	}

	public static long combinationSum(long k, long l) {
		if(k<l) {
			return 0;
		} else {
			long sum=0;
			while(k>l || k==l) {
				sum = sum + combination(k,l);
				l=l+1;
			}
			return sum;
		}
	}

}
