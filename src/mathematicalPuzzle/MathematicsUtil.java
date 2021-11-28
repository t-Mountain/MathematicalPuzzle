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
	
	/**
	 * パーミュテーションを計算するメソッド</br>
	 * 以下の場合0を返す</br>
	 * ・m、nいずれかが0より小さい場合<br>
	 * ・nがmより大きい場合</br>
	 * どこまで計算可能か調査できていない。long値の最大を超えるケースの調査が必要。
	 * @param m:選ばれる数
	 * @param n:mから選ぶ数
	 * @return 順列の結果
	 */
	public static long permutation(long m, long n) {
		
		if(m <0 || n <0) {
			return 0;
		}
		
		if(n > m) {
			return 0;
		}else if(m == n || n == 0) {
			return 1;
		}
		
		if(n == 1) {
			return m;
		}
		
		long num = m;
		for(int i=0; i<n-1; i++) {
			m = m-1;
			num = num*m;
		}
		
		return num;
	}
	
	public static int exponentiation(int base, int exponent) {
		int result=base;
		
		if(exponent==0) {
			return 1;
		} else if(exponent == 1) {
			return base;
		} else {
			for(int i=0; i<exponent-1; i++) {
				result = result*base;
			}
			return result;
		}
	}
}
