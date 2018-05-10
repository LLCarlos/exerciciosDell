
public class Grid {

	private int x, y;

	public Grid(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public boolean validMove(int x, int y, char p) {
		switch (p) {
		case 'N':
			if ((y + 1) > this.y || y + 1 < 0) {
				return false;
			}
			break;
		case 'E':
			if ((x + 1) > this.x || x + 1 < 0) {
				return false;
			}
			break;
		case 'S':
			if ((y - 1) > this.y || y - 1 < 0) {
				return false;
			}
			break;
		case 'W':
			if ((x - 1) > this.x || y - 1 < 0) {
				return false;
			}
			break;
		}
		return true;
	}

}
