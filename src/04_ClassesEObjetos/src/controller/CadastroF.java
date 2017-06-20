package controller;
import model.Funcionario;
public class CadastroF {
	public static void main(String[] args){
		Funcionario user = new Funcionario();
		user.matricula=517;
		user.nome="Mateus";
		user.cpf="251948945";
		System.out.println("Matricula: " + user.matricula );
		System.out.println("Nome: " + user.nome);
		System.out.println("CPF: " + user.cpf);
		Funcionario user2 = new Funcionario();
		user2.matricula=846;
		user2.nome="Leon";
		user2.cpf="789654221";
		System.out.println("Matricula: "+ user2.matricula);
		System.out.println("Nome: "+ user2.nome);
		System.out.println("CPF: " + user2.cpf);
		Funcionario user3 = new Funcionario();
		user3.matricula=621;
		user3.nome="Gabriel";
		user3.cpf="123354854";
		System.out.println("Matricula: "+ user3.matricula);
		System.out.println("Nome: "+ user3.nome);
		System.out.println("CPF: "+ user3.cpf);
				
	}

}
