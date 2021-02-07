package mathematicalPuzzle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Q_4 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2020, 1, 30, 0, 0, 0);
		LocalDateTime dateTimefinal = LocalDateTime.of(2020, 1, 31, 0, 0, 0);

		int total=0;
		while(dateTime.isBefore(dateTimefinal)) {

			int[] segmentDisplay = parseInt(dateTime);

			List<Integer> segmentCounts = new ArrayList<>();
			for(int displayNumber : segmentDisplay) {
				segmentCounts.add(SegmentDisplay.getSegmentCount(displayNumber));
			}


			if(segmentCounts.stream().reduce((a, b) -> a+b).get() == 30) {
				total = total+1;
			}

			dateTime = dateTime.plusSeconds(1);
		}
		System.out.println("合計" + total);
	}

	public static int[] parseInt(LocalDateTime dateTime){
		int hour = dateTime.getHour();
		int minite = dateTime.getMinute();
		int secound = dateTime.getSecond();

		int[] degitDisplay= new int[6];

		if(isTwoDigits(hour)) {
			String hourStr = String.valueOf(hour);
			char[] hourArray = hourStr.toCharArray();
			degitDisplay[0] = Character.getNumericValue(hourArray[0]);
			degitDisplay[1] = Character.getNumericValue(hourArray[1]);
		} else {
			degitDisplay[0] = 0;
			degitDisplay[1] = hour;
		}

		if(isTwoDigits(minite)) {
			String miniteStr =String.valueOf(minite);
			char[] miniteArray = miniteStr.toCharArray();
			degitDisplay[2] = Character.getNumericValue(miniteArray[0]);
			degitDisplay[3] = Character.getNumericValue(miniteArray[1]);
		} else {
			degitDisplay[2] = 0;
			degitDisplay[3] = minite;
		}

		if(isTwoDigits(secound)) {
			String secoundStr =String.valueOf(secound);
			char[] secoundArray = secoundStr.toCharArray();
			degitDisplay[4] = Character.getNumericValue(secoundArray[0]);
			degitDisplay[5] = Character.getNumericValue(secoundArray[1]);
		}else {
			degitDisplay[4] = 0;
			degitDisplay[5] = secound;
		}

		return degitDisplay;

	}

	public static boolean isTwoDigits(int number) {
		return number > 9;
	}

	private enum SegmentDisplay {

		ZERO(0, 6),
		ONE(1, 2),
		TWO(2, 5),
		THREE(3, 5),
		FOUR(4, 4),
		FIVE(5, 5),
		SIX(6, 6),
		SEVEN(7, 3),
		EIGHT(8, 7),
		NINE(9, 6);

		int displayNumber;
		int segmentCount;

		SegmentDisplay(int displayNumber, int segmentCount){
			this.displayNumber = displayNumber;
			this.segmentCount = segmentCount;
		}

		public static int getSegmentCount(int displayNumber) {
			for(SegmentDisplay sd : SegmentDisplay.values()) {
				if(sd.displayNumber == displayNumber) {
					return sd.segmentCount;
				}
			}

			return 0;
		}
	}

}
