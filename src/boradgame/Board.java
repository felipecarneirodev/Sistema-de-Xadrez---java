package boradgame;

public class Board {
	
	private int rows;
	private int colums;
	private Piece[][] pieces;
	public Board(int rows, int columns) {
		this.rows = rows;
		this.colums = colums;
		pieces = new Piece[rows][columns];
	}
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColums() {
		return colums;
	}
	public void setColums(int colums) {
		this.colums = colums;
	}
	
	
}
