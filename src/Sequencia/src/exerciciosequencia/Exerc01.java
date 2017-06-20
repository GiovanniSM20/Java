package exerciciosequencia;
import util.Teclado;
public class Exerc01 {
	public static void main(String[] args) {
		
		double numerador , denominador , resultado;
		numerador = Teclado.lerDouble("Digite o numerador");
		denominador = Teclado.lerDouble ("Digite denominador");
		resultado = numerador/denominador;
				
				System.out.println("Fraçao" + resultado);
		
		
				
	}

}
