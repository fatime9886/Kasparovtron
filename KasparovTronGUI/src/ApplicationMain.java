import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class ApplicationMain {

	public static void main(String[] args) {
		
		JFrame windowFrame = new JFrame();
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(500, 500);
		GameBoardPanel game = new GameBoardPanel();
		windowFrame.add(game);
		windowFrame.addMouseListener(new MouseAdapter() {
			@Override //I override only one method for presentation
		    public void mousePressed(MouseEvent e) {
				// ������� �� ����� �� ��������
				game.changeColor(game.getGraphics(), e.getX(), e.getY());
		    }
		});
//		windowFrame.add(new JPanel() {
//			
//			public void paint(Graphics g) {
//				
//				g.setColor(Color.GREEN);
//				g.fillRect(10, 10, 100, 100);
//			}
//		});
		
		
		new AbstractTest() {
			
			@Override
			public void initClassMethod() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		windowFrame.setVisible(true);
		
		
		String[] collection = new String[] {
			"H", "B", "C"	
		};
		
	}
}
