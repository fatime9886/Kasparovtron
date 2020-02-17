import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameBoardPanel extends JPanel {

	private final int TILE_SIDE = 50;
	private BufferedImage image;

	public void paint(Graphics g) {

		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				render(g, row, col);
			}

			try {
//				������� ���� �� ��������
				System.out.println(new File("C://Users//vvv//Desktop//ChessMasterGUI//images//queen.png").getPath());
				// ������� �� �������� �� ��������� �������
				image = ImageIO.read(new File("C://Users//vvv//Desktop//ChessMasterGUI//images//queen.png"));
				
			} catch (IOException ex) {
				System.out.println("Error!");
			}
			// �������� �� ��������
			paintComponent(g);
		}

	//	g.setColor(Color.GREEN);
		// g.fillRect(10, 10, 100, 100);
	}

	private void render(Graphics g, int row, int col) {

		boolean isRowEven = (row % 2 == 0);
		boolean isColEvent = (col % 2 == 0);

		boolean isWhite = (isRowEven && isColEvent) || (!isRowEven && !isColEvent);

		Color tileColor = isWhite ? Color.WHITE : Color.BLACK;

		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;

		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}

	void changeColor(Graphics g, int x, int y) {
		int tileX = x;
		int tileY = y;
		Color tileColor = Color.RED;
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// �������� �� �������� ���� ������ �� ������ ������������ -> (0, 0)
		g.drawImage(image, 200, 200, this);
	}
}