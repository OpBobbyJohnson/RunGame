package Logic;
import Assets.Runner;
public class appCalc {
public boolean Running;

	public double Gameover(){
		Runner currRunner = new Runner();
		if(currRunner.isDead() == true){
			//stop game
			return currRunner.getScore();
		}
		else{
			return (Double) null;
		}
	
	}
}
