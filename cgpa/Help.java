package cgpa;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help {
	public void helpView() {
		Commons commons = new Commons();
		JFrame frame= commons.frames();
		Font txt = new Font("", Font.BOLD, 18);
		//back
		JLabel prev = commons.back(frame);
		frame.add(prev);
//		INSTRUCTIONS
		JLabel i1 = new JLabel("-> Select the grading scale.");
		i1.setBounds(50, 230, 650, 20);
		i1.setFont(txt);
		frame.add(i1);
		JLabel i2 = new JLabel("-> Enter the number you want to convert");
		i2.setBounds(50, 280, 650, 20);
		i2.setFont(txt);
		frame.add(i2);
		JLabel i3 = new JLabel("-> Press Calculate.");
		i3.setBounds(50, 330, 650, 20);
		i3.setFont(txt);
		frame.add(i3);
		JLabel i4 = new JLabel("-> Result will be obtained.");
		i4.setBounds(50, 380, 650, 20);
		i4.setFont(txt);
		frame.add(i4);
		frame.setVisible(true);
	}
}