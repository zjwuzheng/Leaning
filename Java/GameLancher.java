class GuessGame{
Player p1;

public void startGame(){
	p1 = new Player();
	
	int guessp1 = 0;
	
	boolean p1isRight = false;
	
	int num = (int) (Math.random()*100);
	System.out.println("num in 0-9");
	
	while(true){
		System.out.println("num is" + num);
		
		p1.guess();
		guessp1 = p1.number;
		System.out.println("p1 guess" + guessp1);
		
		if(guessp1 == num){
			p1isRight = true;
		}
		if(p1isRight){
			System.out.println("p1 is rignt?" + p1isRight);
			System.out.println("Game is over");
			break;
		}else{
			System.out.println("onemore");
		}
	}
}

}

class Player{
	int number = 0;
	public void guess(){
		number = (int) (Math.random()*100);
		System.out.println("I'm guessing" + number);
	}
}

public class GameLancher{
	public static void main (String[] args){
		GuessGame game = new GuessGame();
		game.startGame();
	}
	
}