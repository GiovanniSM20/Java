package exerciciosequencia;
import util.Teclado;
public class Exerc02 {
	public static void main(String[] args) {
		
		double salmin , salmeu , result;
		salmeu = Teclado.lerDouble("Qaul o valor do meu salario?");
		salmin = Teclado.lerDouble("Qual o valor do sal minimo?");
			result = salmeu/salmin;
				
				System.out.println("Resultado: " + result);
		
		
		
	}
}
