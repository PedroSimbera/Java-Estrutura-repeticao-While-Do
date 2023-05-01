import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String senha = sc.nextLine();
		String senha_bd = "2002";
		while (senha!=senha_bd) {
			System.out.println("Senha inválida");
		}
		
		sc.close();
	}
		
	}


