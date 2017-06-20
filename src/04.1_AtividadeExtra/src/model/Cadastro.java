package model;
import model.Curso;
import model.Matricula;
import model.Aluno;
import model.Turma;
public class Cadastro {
	public static void main(String [] args){
		Aluno alu = new Aluno();
		alu.cpf = "123.498.456";
		alu.rg = "213486789";
		alu.nome = "Mateus S. Martins";
		alu.fone = "(21)89424872";
		alu.endereco = "Visconde de Abaeté, 109";
		System.out.println("CPF: " +alu.cpf);
        System.out.println("RG: " +alu.rg);
        System.out.println("Nome: " +alu.nome);
        System.out.println("Telefone: " +alu.fone);
        System.out.println("Endereço: " +alu.endereco);
		
		Matricula mat = new Matricula();
		mat.data = "20/01/2016";
		mat.formaPagto = "Boleto Bancário";
		mat.numMat = 578914;
		System.out.println("Data que foi feita a matricula: " +mat.data);
		System.out.println("Forma de Pagamento: " +mat.formaPagto);
		
	}

}
