import java.util.ArrayList;
import java.util.Random;

public class Lotto {
	
	private String lottoBall, extraBallSet, jackpotColor, rolledBalls = "", rolledExtraBall;
	private String trekLottoBalls, trekExtraBall;
	
	private ArrayList<Integer> lottoBalls = new ArrayList<Integer>();
	private ArrayList<Integer> extraBall = new ArrayList<Integer>();
	private int[] getallen = new int[6];
	
	private Random random = new Random();
	
	public void rollLottoBall() {
		
			trekLottoBalls = "";
			rolledBalls = "";
			
	       for (int i = 0; i < 100; i++){
	       lottoBalls.add(i);
	       }
	       
	       for (int j = 0; j < 6; j++) {
	       getallen[j] = lottoBalls.remove((int) (Math.random() * lottoBalls.size()));
	       rolledBalls += getallen[j] + "\n";
	       trekLottoBalls = String.valueOf(rolledBalls);
	       }
	}
	
	
	
	public void rollExtraBall() {
		
		int bonusBall;

		bonusBall = lottoBalls.remove((int) (Math.random() * lottoBalls.size()));
	    trekExtraBall = String.valueOf(bonusBall);
		
	}
	
	public int rollJackpotColor() {
		
		String[] jackpotColor = {"Red", "Blue", "Yellow", "Green", "Cyan", "Orange"};

        // randomly selects an index from the jackpotColor
        int select = random.nextInt(jackpotColor.length);
        
        this.jackpotColor = jackpotColor[select];
        return select;
		
	}
	
	public void setLottoBalls(ArrayList<Integer> lottoBalls) {
		this.trekLottoBalls = trekLottoBalls;
	}
	
	
	public String getLottoBalls() {
		return trekLottoBalls;
	}
	
	public String getExtraBall() {
		return trekExtraBall;
	}
	
	public String getLottoColor() {
		return jackpotColor;
		
	}
}

/* String getrokkenLottoballen = "";

for (int i = 1; i <= 100; i++) 
{
LottoLijst.add(i);
}
for (int j = 0; j < 6; j++) {
getallen[j] = LottoLijst.remove((int) (Math.random() * LottoLijst.size()));
getrokkenLottoballen += getallen[j] + "\n";
trekLottoBallen.setText(getrokkenLottoballen);
} */	