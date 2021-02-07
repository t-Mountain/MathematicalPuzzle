package mathematicalPuzzle;

public class Q_5 {

	public static void main(String[] args) {
		int number = 4;

		long[][] pacalTriangle = getArrayPascalTriangle(number);

//		for(int j=0; j<=number; j++) {
//			System.out.print(pacalTriangle[number][j] +" ");
//		}
//
//		System.out.println("\n");

		long yenCount=0;
		for(int k=0; k<=number; k++) {
			yenCount = yenCount + coinCount(pacalTriangle[number][k]);
		}

		System.out.println(yenCount);
	}


	public static long[][] getArrayPascalTriangle(long number){
		long[][] pascalTriangle = new long[100][100];

		int i=0;
		int j=0;
		for(i=0; i<=number; i++) {

			if(i==0) {
				pascalTriangle[i][j] = 0;
				System.out.println(pascalTriangle[i][j] );
			}

			if(i==1) {
				pascalTriangle[i][0] = 1;
				System.out.print(pascalTriangle[i][0] + " ");
				pascalTriangle[i][1] = 1;
				System.out.println(pascalTriangle[i][1]);
			} else {
				j=0;
				while(j<=i) {
					if(j==0 || j==i) {
						pascalTriangle[i][j] = 1;
						System.out.print(pascalTriangle[i][j] + " ");
					} else {
						pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
						System.out.print(pascalTriangle[i][j] + " ");
					}
					j++;
				}
				System.out.println("");
			}
		}

		return pascalTriangle;
	}

	static long coinCount(long number) {

		long yenCount=0;

		long tenThousandYenBillCount = number/10000;
		if(tenThousandYenBillCount != 0) {
			number = number % 10000;
			yenCount = yenCount + tenThousandYenBillCount;
		}

		long fiveThousandYenCount = number/5000;
		if(fiveThousandYenCount != 0) {
			//数字を5千円札で表せない
			number = number % 5000;
			yenCount = yenCount + fiveThousandYenCount;
		}

		long twoThousandYenCount = number/2000;
		if(twoThousandYenCount != 0) {
			//数字を2千円札で表せない
			number = number % 2000;
			yenCount = yenCount + twoThousandYenCount;
		}

		long oneThousandYenCount = number/1000;
		if(oneThousandYenCount != 0) {
			//数字を千円札で表せない
			number = number % 1000;
			yenCount = yenCount + oneThousandYenCount;
		}

		long fiveHundredYenCount = number/500;
		if(fiveHundredYenCount != 0) {
			//数字を500円で表せない
			number = number % 500;
			yenCount = yenCount + fiveHundredYenCount;
		}

		long oneHundredYenCount = number/100;
		if(oneHundredYenCount != 0) {
			//数字を100円で表せない
			number = number % 100;
			yenCount = yenCount + oneHundredYenCount;
		}

		long fiftyYenCount = number/50;
		if(fiftyYenCount != 0) {
			//数字を50円で表せない
			number = number % 50;
			yenCount = yenCount + fiftyYenCount;
		}

		long tenYenCount = number/10;
		if(tenYenCount != 0) {
			//数字を10円で表せない
			number = number % 10;
			yenCount = yenCount + tenYenCount;
		}

		long fiveYenCount = number/5;
		if(fiveYenCount != 0) {
			//数字を10円で表せない
			number = number % 5;
			yenCount = yenCount + fiveYenCount;
		}

		long oneYenCount = number/1;
		if(oneYenCount != 0) {
			//数字を10円で表せない
			number = number % 1;
			yenCount = yenCount + oneYenCount;
		}


		return yenCount;
	}

}
