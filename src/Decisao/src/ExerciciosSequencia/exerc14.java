package ExerciciosSequencia;
import util.Teclado;
public class exerc14 {
	public static void main(String[] args) {
		
		int idade = Teclado.lerInt("Informe sua idade");
		if (idade < 18){
			System.out.println("Voce é menor de idade");
		}else if (idade < 65){
			System.out.println("Voce é maior de idade");
		}else{
			System.out.println("Voce é maior de 65");
		}
	}
}
