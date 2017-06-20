package ExerciciosSequencia;
import util.Teclado;
public class exerc15 {
	public static void main(String[] args) {
		String nome , situacao;
		double nota1 , nota2 , media;
		nome = Teclado.lerTexto("Nome do Aluno");
		nota1 = Teclado.lerDouble("Informe a nota 1: ");
		nota2 = Teclado.lerDouble("Informe a nota 2: ");
		media = (nota1 + nota2) / 2;
			if (media < 4){
				situacao = "REPROVADO";
			}else if (media < 7){
				situacao = "PROVA FINAL";
			}else{
				situacao = "APROVADO";
		}
			System.out.println("Aluno: " + nome +
					"\nNota 1:" + nota1 + 
					"\nNota 2:" + nota2 + 
					"\nMedia: " + media + 
					"\nsituacao: " + situacao);
	}
}
