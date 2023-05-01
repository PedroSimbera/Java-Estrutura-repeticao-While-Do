import java.util.Scanner;

public class whileSenha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String senha = sc.nextLine();
		String senha_bd = "2002";

		while (senha != senha_bd) {
			System.out.println("Senha inválida");
			System.out.println("Digite novamente: ");
			senha = sc.nextLine();
		}

		sc.close();
	}

}
