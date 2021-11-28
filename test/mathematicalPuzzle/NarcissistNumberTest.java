package mathematicalPuzzle;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.List;

import org.junit.Test;

import exception.UnsupportNumberException;

public class NarcissistNumberTest {
	@Test
	public void narcissistNumberTest() {
		NarcissistNumber nn = new NarcissistNumber(10);
		try {
			
			nn.setDigitNumber("153");
			assertThat(nn.getDigitNumber(), is(3));
			
			boolean bool = nn.isNarcissitNumber("153");
			System.out.println(nn.getResultNumber());
			assertThat(bool, is(true));
		} catch (UnsupportNumberException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	@Test
	public void setTargetNumberTest() {
		
		try {
			NarcissistNumber nn = new NarcissistNumber(10);
			nn.setDigitNumber("153");
			nn.setTargetNumber("153");
			List<String> targetNumber = nn.getTargetNumberList();
			
			assertThat(targetNumber.size(), is(3));
			
			assertThat(targetNumber.get(0), is("1"));
			assertThat(targetNumber.get(1), is("5"));
			assertThat(targetNumber.get(2), is("3"));
		} catch (UnsupportNumberException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void narcissistNumberOctTest() {
		NarcissistNumber nn = new NarcissistNumber(8);
		try {
			
			nn.setDigitNumber("24");
			assertThat(nn.getDigitNumber(), is(2));
			
			boolean bool = nn.isNarcissitNumber("24");
			System.out.println(nn.getResultNumber());
			assertThat(bool, is(true));
		} catch (UnsupportNumberException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	@Test
	public void setTargetNumberOctTest() {
		
		try {
			NarcissistNumber nn = new NarcissistNumber(8);
			nn.setDigitNumber("24");
			nn.setTargetNumber("24");
			List<String> targetNumber = nn.getTargetNumberList();
			
			assertThat(targetNumber.size(), is(2));
			
			assertThat(targetNumber.get(0), is("2"));
			assertThat(targetNumber.get(1), is("4"));
		} catch (UnsupportNumberException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
