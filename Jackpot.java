import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Jackpot extends JFrame{
	
	public static void main(String[] args) {
		// Maak een frame
		JFrame frame = new Jackpot();
		frame.setSize(350, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new Panel();
		frame.setContentPane(panel);
		frame.setTitle("Jackpot");
		frame.setVisible(true);
	}
}

class Panel extends JPanel {
	
	JPanel pane = new JPanel(new GridLayout(1, 5));
	
	Lotto lotto;
	
	JTextArea lottoField, extraField, jackpotColorField;
	JButton rollLottoBall, rollExtraField, rollJackpotColor, emptyLotto;
	
	public Panel() {
		
		setLayout(null);
        lotto = new Lotto();
        
        
		
		lottoField = new JTextArea();
		lottoField.setBounds(50, 20, 80, 100);
		// lottoField.setBounds(x , y, width, height);
		// x = horizontal
		// y = vertical 
		add(lottoField);
		
		extraField = new JTextArea();
		extraField.setBounds(50, 130, 80, 20);
		add(extraField);
		
		jackpotColorField = new JTextArea();
		jackpotColorField.setBounds(50, 160, 80, 20);
		add(jackpotColorField);
		
		// BUTTONS
		
		rollLottoBall = new JButton("Roll Lotto balls");
		KnoprollLottoBall aButton = new KnoprollLottoBall();
		rollLottoBall.addActionListener(aButton);
		add(rollLottoBall);
		rollLottoBall.setBounds(140, 100, 130, 20);
		
		rollExtraField = new JButton("Roll Extra ball");
		KnoprollExtraBall bButton = new KnoprollExtraBall();
		rollExtraField.addActionListener(bButton);
		add(rollExtraField);
		rollExtraField.setBounds(140, 130, 130, 20);
		
		rollJackpotColor = new JButton("Roll Jackpot color");
		KnoprollJackpotColor cButton = new KnoprollJackpotColor();
		rollJackpotColor.addActionListener(cButton);
		add(rollJackpotColor);
		rollJackpotColor.setBounds(140, 160, 130, 20);
		
		emptyLotto = new JButton("Empty Lotto");
		KnopEmptyLotto dButton = new KnopEmptyLotto();
		emptyLotto.addActionListener(dButton);
		add(emptyLotto);
		emptyLotto.setBounds(140, 185, 130, 20);
	        
	}
	
	class KnoprollLottoBall implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lotto.rollLottoBall();
			lottoField.setText(lotto.getLottoBalls());
		}
	}
	
	class KnoprollExtraBall implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lotto.rollExtraBall();
			extraField.setText(lotto.getExtraBall());
		}
	}
	
	class KnoprollJackpotColor implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			int color = lotto.rollJackpotColor();
			jackpotColorField.setText(lotto.getLottoColor());
			
			switch (color) {
			
			case 0:
				jackpotColorField.setBackground(Color.red);
				break;
			
			case 1:
				jackpotColorField.setBackground(Color.blue);
				break;
			
			case 2:
				jackpotColorField.setBackground(Color.yellow);
				break;
			
			case 3:
				jackpotColorField.setBackground(Color.green);
				break;
				
			case 4:
				jackpotColorField.setBackground(Color.cyan);
				break;	
				
			case 5:
				jackpotColorField.setBackground(Color.orange);
				break;
			}
		}
	}
	
	class KnopEmptyLotto implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lottoField.setText("");
			extraField.setText("");
			jackpotColorField.setText("");
			jackpotColorField.setBackground(Color.white);
		}
	}
	
}