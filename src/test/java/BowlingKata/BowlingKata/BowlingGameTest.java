package BowlingKata.BowlingKata;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class BowlingGameTest{
	
	@Test
 	public void gameWithoutPoints() {
		Game g = new Game();
		rollAFewTimes(g,0,20);
		assertThat( g.score() , is(0) );
	}
	
	@Test
 	public void gameWithout20Points() {
		Game g = new Game();
		rollAFewTimes(g,1,20);
		assertThat( g.score() , is(20) );
	}
	
	
	
	public void rollAFewTimes(Game game, int points,int ilosc){
		for(int i =0; i<ilosc; i++){
			game.roll(points);
		}
	}
} 