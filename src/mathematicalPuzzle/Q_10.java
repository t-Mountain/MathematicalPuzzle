package mathematicalPuzzle;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Q_10 {
	
	static class Prefecture{
		
		Prefecture(
				int identificationNumber,
				int population,
				String name,
				int seatsNumber) {
			this.identificationNumber = identificationNumber;
			this.population = population;
			this.name = name;
			this.seatsNumber = seatsNumber;
		}
		
		private final int identificationNumber;
		
		private final int population;
		
		private final String name;
		
		private int seatsNumber;
		
		private void setSeatsNumber(int seatsNumber) {
			this.seatsNumber = seatsNumber;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		FileReader fileReader = null;
		
		CSVReader csvReader = null;
		
		Prefecture[] prefectures = new Prefecture[47];
		
		try {
			fileReader = new FileReader("001_00_.csv");
			csvReader = new CSVReader(fileReader);
			
			String[] record = null;
			int i = 0;
			while((record = csvReader.readNext())!=null) {
				
				String localcode = record[3];
				String prefectureCode = record[2];
				if(localcode.equals("a") && !prefectureCode.equals("00000")) {
					
					prefectures[i] = new Prefecture(i, Integer.parseInt(record[7]), record[6], 0);
					
					System.out.println(record[6] +","+ record[7]);
					i++;
				}
				
			}
			int firstNum = 0;
			int lastNum = MathematicsUtil.exponentiation(2, 23);
			
			while(true) {
				int quotient = (lastNum+ firstNum)/2;
				int resultNum = 0;
				for(int j=0; j<prefectures.length; j++) {
					int populationNumber = prefectures[j].population;
					prefectures[j].setSeatsNumber((int)Math.ceil((double)populationNumber / quotient));
					resultNum = resultNum + prefectures[j].seatsNumber;
				}
				
				if(resultNum == 289) {
					System.out.println("探索成功:"+ quotient);
					for(Prefecture prefecture : prefectures) {
						System.out.println(prefecture.name + ",議員数：" + prefecture.seatsNumber);
					}
					break;					
				} else if(resultNum < 289){
					lastNum = quotient;
				} else {
					firstNum = quotient;
				}
				
			}
			
			
		} catch (IOException | CsvValidationException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			
			if(fileReader != null) {
				fileReader.close();
			}
			
			if(csvReader != null) {
				csvReader.close();
			}
		}

	}

}
