package ExerciciosSequencia;
import util.Teclado;
public class Exerc09 {
	public static void main(String[] args) {
		int dia;
		dia = Teclado.lerInt("Digite o número de um dia da semana");
		if(dia == 1){
			System.out.println("Domingo");
		}else if (dia == 2){
			System.out.println("Segunda");
		}else if (dia == 3){
			System.out.println("Terca");
		}else if (dia == 4){
			System.out.println("Quarta");
		}else if (dia == 5){
			System.out.println("Quinta");
		}else if (dia == 6){
			System.out.println("Sexta");
		}else if (dia == 7){
			System.out.println("Sabado");
		}
	}

}
