package BowlingKata.BowlingKata;

import org.junit.Test;

public class BowlingGameTest{
	
	@Test
 	public void gameWithoutPoints() {
		Game g = new Game();
		for(int i =0; i<20; i++){
			g.roll(0);
			assertThat( g.score , 0 );
		}
	
	}
} 