package ExerciciosSequencia;
import util.Teclado;
public class Exerc06 {

	public static void main(String[] args) {
		int numero;
		numero = Teclado.lerInt("Digite um valor inteiro: ");
		if (numero <= 1000){
			System.out.println("Seu numero é menor ou igual a 1000");
			
		}else{
			System.out.println("Seu numero é maior que 1000");
		}
	}

}
