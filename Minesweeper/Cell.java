package Minesweeper;

import java.awt.Color;

public class Cell {
	private static int openedNum;
	private int mineNum;
	private boolean hidden ;
	private boolean mine;
	
	public Cell(){
		this.hidden = true;
		
	}
	
	public static int getOpenedNum() {
		return openedNum;
	}

	public static void addOpenedNum() {
		openedNum++;
	}
	public static void zeroOpenedNum() {
		openedNum = 0;
	}
	public int getMineNum() {
		return this.mineNum;
	}
	
	public void addMineNum() {
		this.mineNum ++;
	}
	
	public void setMine() {
		this.mine = true;
	}
	
	public boolean hasMine() {
		return this.mine;
	}
	
	public void open() {
		addOpenedNum();
		this.hidden = false;
	}
	public boolean isHidden() {
		return this.hidden;
	}
	public String getColor() {
		String ret = "<html><font color=";
		switch(mineNum){
			case 1:
				return ret + "\"blue\">";
			case 2:
				return ret + "\"green\">";
			case 3:
				return ret + "\"red\">";
			default:
				return ret + "\"black\">";
		}
		
	}
	
}
