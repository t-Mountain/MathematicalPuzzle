package mathematicalPuzzle;

import java.util.ArrayList;
import java.util.List;

import exception.UnsupportNumberException;

public class NarcissistNumber {
	
	private final int baseNumber;
	
	private int digitNumber=1;
	
	private List<String> targetNumberList = new ArrayList<String>();
	
	private String resultNumber="0";
	
	NarcissistNumber(int baseNumber){
		this.baseNumber = baseNumber;
	}

	public int getDigitNumber() {
		return digitNumber;
	}

	public void setDigitNumber(String targetNumber) throws UnsupportNumberException {
		this.digitNumber = targetNumber.length();
	}

	void setTargetNumber(String targetNumber) {
		
		for(int i=0; i<targetNumber.length(); i++) {
			targetNumberList.add(targetNumber.substring(i, i+1));
		}
		
	}
	public List<String> getTargetNumberList() {
		return this.targetNumberList;
	}
	
	public String getResultNumber() {
		return resultNumber;
	}
	
	public boolean isNarcissitNumber(String targetNumber) throws UnsupportNumberException{
		
		init();
		
		//桁数ごとに数字を分解する。
		setTargetNumber(targetNumber);
		setDigitNumber(targetNumber);
		
		//各位の数に対してナルシスト数の計算
		int num=0;
		for(String target : targetNumberList) {
			//10進数へ変換する
			int targetNum = Integer.parseInt(target);
			targetNum = MathematicsUtil.exponentiation(targetNum, digitNumber);
			num = num + targetNum;
		}
		
		resultNumber = toStringByBaseNumber(num);
		
		return targetNumber.equals(resultNumber);
	}
	
	private String toStringByBaseNumber(int num) throws UnsupportNumberException {
		String resultString="";
		switch(baseNumber) {
		case 2:
			resultString = Integer.toBinaryString(num);
			break;
		case 8:
			resultString = Integer.toOctalString(num);
			break;
		case 10:
			resultString = Integer.toString(num);
			break;
		case 16:
			resultString = Integer.toHexString(num);
			break;
		default:
			throw new UnsupportNumberException();
		}
		return resultString;
	}
	
	private void init() {
		this.targetNumberList = new ArrayList<String>();
	}

}
