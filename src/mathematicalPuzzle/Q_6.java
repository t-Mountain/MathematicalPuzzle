package mathematicalPuzzle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q_6 {

	public static void main(String[] args) throws IOException {

		int[][] squareCountArray = new int[1001][1001];

		int thirtyCounts=0;
		for(int i=1; i<1001; i++) {
			for(int j=1; j<=i; j++) {

				int longBoundary=i;
				int shortBoundary=j;
				int differenceBoundary=0;
				int squareCount=0;
				squareCountArray[i][j]=0;
				differenceBoundary = longBoundary - shortBoundary;
				squareCount++;

				if(differenceBoundary==0) {
					squareCountArray[i][j]=squareCount;
				} else if(shortBoundary > differenceBoundary){
					longBoundary = shortBoundary;
					shortBoundary = differenceBoundary;
					squareCountArray[i][j] = squareCount + squareCountArray[longBoundary][shortBoundary];
				} else {
					longBoundary = differenceBoundary;
					squareCountArray[i][j] = squareCount + squareCountArray[longBoundary][shortBoundary];
				}

				if(squareCountArray[i][j] == 20) {
					thirtyCounts++;
				}

			}
		}

		File file = new File("./squareCountFile.txt");
		FileWriter fileWriter=null;
		try {
			fileWriter = new FileWriter(file);
			for(int n=1; n<1001; n++) {
				for(int m=1; m<=n; m++) {
					fileWriter.write(squareCountArray[n][m] + " ");
				}
				fileWriter.write("\n");
			}
			fileWriter.write(thirtyCounts);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fileWriter.close();
		}
	}

}
