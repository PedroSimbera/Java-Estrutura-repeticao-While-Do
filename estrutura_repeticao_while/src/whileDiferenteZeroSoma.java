import java.util.Scanner;

public class whileDiferenteZeroSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		int soma = 0;

		while (num != 0) {
			soma += num;
			System.out.println("Digite um número: ");
			num = sc.nextInt();
		}

		System.out.println("A soma dos números que digitou é: " + soma);

		sc.close();

	}

}
