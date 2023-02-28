import java.util.*;

class Arquivo {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		int numero1, numero2, soma;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = scanner.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.print("Soma: " + soma);
	}
}