package mathematicalPuzzle;

public class Q_7 {

	public static void main(String[] args) {
		int n = 15;
		long num = 0;
		for(int k=n-1; k>0; k--) {
			long p = MathematicsUtil.permutation(n, k-1);
			long result = (n-k)*p*k;
			num = num + result;
			
		}
		
		System.out.println(num);

	}

}
