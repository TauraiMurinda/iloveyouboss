package iloveyouboss;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScoreCollectionTest {

	@Test
	public void answersArithmeticMeanOfTwoNumbers() {
		ScoreCollection scorecolllection = new ScoreCollection();
		scorecolllection.add(()->7);
		scorecolllection.add(()->7);
		int actualAnswer = scorecolllection.arithmeticMean();
		int expectedAnswer=9;
		
		assertThat(actualAnswer, equalTo(expectedAnswer));
      
		
	}

}
