package exerciciosequencia;
import util.Teclado;
public class Exerc05 {

	public static void main(String[] args) {
		int num , a , b , c;
		num = Teclado.lerInt("Insira um numero");
		a = num / 100;
		b = (num % 100) / 10;
		c = (num % 100) % 10;
			System.out.println("O seu numero invertido é: " + c + b + a);

	}

}
