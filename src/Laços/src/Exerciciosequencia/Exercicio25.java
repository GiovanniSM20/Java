package Exerciciosequencia;

public class Exercicio25 {

	public static void main(String[] args) {
		
		double juca, chico = 1.50;
		int anos = 0;
		for (juca=1.10; juca<=chico;juca+=0.03){
			chico+= 0.02;
			anos += 1;
		}
		System.out.println("Juca será mais alto que Chico em " + anos + " anos");
	}

}
