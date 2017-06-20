package ExerciciosSequencia;
import util.Teclado;
public class exerc08 {
	public static void main(String[] args) {
		 int num;
		 num = Teclado.lerInt("Digite um numero");
		 if (num < 1000){
			 System.out.println("Seu numero é menor que 1000");
			 
		 }else{
			 if ((num >= 1000) && (num <= 5000)) {
				 System.out.println("Seu numero esta entre 1000 e 5000");
			 }else{
				 if((num > 5000) && (num <= 8000)) {
					 System.out.println("Seu numero esta entre 5000 e 8000");
				 }else{
					 System.out.println("Seu numero é maior que 8000");
				 }
			 }
		 }
		
	}

}
