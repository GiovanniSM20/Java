package ExerciciosSequencia;
import util.Teclado;
public class Exerc12 {
	public static void main(String[] args) {
		int n1 , n2;
		n1 = Teclado.lerInt("Informe o primeiro numero");
		n2 = Teclado.lerInt("Informe o segundo numero");
			if(n1 > n2){
				System.out.println("O primero valor inserido é o maior");		
		}else{
			if (n1 < n2){
				System.out.println("O segundo valor inserido é o maior");
			}else{
				System.out.println("Os dois valores imseridos são identicos");
			}
		}
	}
}
