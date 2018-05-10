
public class Rover {
	
	private int x,y;
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public char getDirection() {
		return direction;
	}

	private char direction;
	
	public Rover(int x, int y, char p) {
		this.x = x;
		this.y = y;
		this.direction = p;
	}
	
	public void printPosition() {
		System.out.println(x + "," + y +" Direção: " + direction);
	}
	
	public void moveRover() {
		switch(this.direction) {
		case 'N':
			this.y++;
			break;
		case 'E':
			this.x++;
			break;
		case 'S':
			this.y--;
			break;
		case 'W':
			this.x--;
			break;
		}
	}
	
	public void turn(char p) {
		switch(p) {
		case 'L':
			switch(this.direction) {
			case 'N':
				this.direction = 'W';
				break;
			case 'E':
				this.direction = 'N';
				break;
			case 'S':
				this.direction = 'E';
				break;
			case 'W':
				this.direction = 'S';
				break;
			}
			break;
		case 'R':
			switch(this.direction) {
			case 'N':
				this.direction = 'E';
				break;
			case 'E':
				this.direction = 'S';
				break;
			case 'S':
				this.direction = 'W';
				break;
			case 'W':
				this.direction = 'N';
				break;
			}
		}
	}
	

}
