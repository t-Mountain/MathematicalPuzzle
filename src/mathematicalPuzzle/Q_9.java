package mathematicalPuzzle;

import exception.UnsupportNumberException;

public class Q_9 {

	public static void main(String[] args) throws UnsupportNumberException {
		int count = 0;
		NarcissistNumber nn = new NarcissistNumber(8);
		int i=10;
		while(count < 8) {
			
			String number = Integer.toOctalString(i);
			
			boolean isNarcisst = nn.isNarcissitNumber(number);
			
			if(isNarcisst) {
				System.out.println(number);
				count++;
			}
			
			i++;
		}
	}
}
