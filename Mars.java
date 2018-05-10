import java.util.Scanner;

public class Mars {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o tamanho do grid (x,y):");
			Grid plateau = new Grid(input.nextInt(), input.nextInt());
			System.out.println(plateau.getX() + "," + plateau.getY());

			System.out.println("Digite a poisição inicial da Mars Rovers (x, y, Direção)");
			Rover carro = new Rover(input.nextInt(), input.nextInt(), input.next().charAt(0));

			System.out.println("Digite os inputs de movimento");
			String entrada = new String();
			entrada = input.next();
			System.out.println(entrada);

			for (int i = 0; i < entrada.length(); i++) {
				System.out.println(entrada.charAt(i));
				switch (entrada.charAt(i)) {
				case 'L':
					carro.turn('L');
					break;
				case 'R':
					carro.turn('R');
					break;
				case 'M':
					if (plateau.validMove(carro.getX(), carro.getY(), carro.getDirection()))
						carro.moveRover();
					break;
				}
				carro.printPosition();

			}
			carro.printPosition();
			

		}
	}

}
