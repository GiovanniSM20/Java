package exerciciosequencia;
import util.Teclado;
public class Exerc03 {
	public static void main(String[] args) {
		
		double valor , acresc , descon , result1 , result2;
		valor = Teclado.lerDouble("Digite um valor: ");
		acresc = 18;
		descon = 65;
		result1 = valor*1.18;
		result2 = valor-(valor*0.65);
		
		System.out.println("Valor com acréscimo: " + result1);
		System.out.println("Valor com desconto: " + result2);
			
	
		
		
	}

}
