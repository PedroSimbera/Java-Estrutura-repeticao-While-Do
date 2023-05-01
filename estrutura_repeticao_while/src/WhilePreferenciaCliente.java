
import java.util.Scanner;

public class WhilePreferenciaCliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual combustível utilizado no abastecimento: ");
		System.out.println("1 - ETANOL");
		System.out.println("2 - DIESEL");
		System.out.println("3 - GASOLINA");
		System.out.println("4 - FIM");
		int choose = sc.nextInt();
		int gasolina = 0; 
		int etanol = 0; 
		int diesel = 0; 
		int conta = 0;
		
		while (choose != 4) {
			if (choose > 4) {
				System.out.println("Valor inválido - valores até 4!");
			} 
			else if (choose == 1) {
				etanol += 1;
				conta += 1;
			}
			else if (choose == 2) {
				diesel += 1;
				conta += 1;
			}
			else if (choose == 3) {
				gasolina += 1;
				conta += 1;
			}
			
			choose = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Etanol: " + etanol);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		System.out.println("Quantidade de indicações de abastecimento válidos: " + conta);
		sc.close();
			}
	}
