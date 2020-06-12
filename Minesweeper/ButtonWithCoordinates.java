package Minesweeper;



import java.awt.Color;

import javax.swing.JButton;

public class ButtonWithCoordinates extends JButton  {
	private int x;
	private int y;
	private boolean flag;

	public ButtonWithCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getCoordX() {
		return x;
	}

	public int getCoordY() {
		return y;
	}

	public void setFlag(boolean h) {
		this.flag = h;
	}

	public boolean getFlag() {
		return this.flag;
	}

	@Override
	public void setEnabled(boolean b) {
		if (!b && model.isRollover()) {
			model.setRollover(false);
		}
		boolean oldEnabled = isEnabled();
		// super.setEnabled(b);
		this.setBackground(Color.WHITE);
		firePropertyChange("enabled", oldEnabled, b);
		if (b != oldEnabled) {
			repaint();
		}
		model.setEnabled(b);
	}
}
