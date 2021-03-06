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
	
	@Test
	public void gameWithOneSpare() {
		Game g = new Game();
		g.roll(5);
		g.roll(5); 
		g.roll(3);
		rollAFewTimes(g,0,17);
		assertThat(g.score(), is(16));
	}
	
	@Test
	public void gameWithOneStrike() {
		Game g = new Game();
		g.roll(10); //strike
		g.roll(3); 
		g.roll(4);
		rollAFewTimes(g,0,16);
		assertThat(g.score(), is(24));
	}
	

	@Test
	public void PerfectGame(){
		Game g = new Game();
		rollAFewTimes(g,10,12);
		assertThat(g.score(), is(300));
	}
	
	public void rollAFewTimes(Game game, int points,int ilosc){
		for(int i =0; i<ilosc; i++){
			game.roll(points);
		}
	}
} 