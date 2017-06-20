package Controller;

import Model.Aluno;
import Model.Professor;

public class Teste {

	public static void main(String[] args) {
		Aluno alu = new Aluno();
		
		alu.setNome("Leandro Ferra");
		alu.setTelefone("2802-5421");
		alu.setCPF("028097167-22");
		alu.setDataDeNascimento("28/05/16");
		alu.setMatricula(46215);
		
		System.out.println("Nome: " + alu.getNome ());
		System.out.println("Telefone: " + alu.getTelefone ());
		System.out.println("CPF: " + alu.getCPF ());
		System.out.println("Data de nascimento: " + alu.getDataDeNascimento ());
		System.out.println("Matricula: " + alu.getMatricula ());
		
		Aluno alu2 = new Aluno();
		
		alu2.setNome("Marcio");
		alu2.setTelefone("2484-4115");
		alu2.setCPF("285421150-65");
		alu2.setDataDeNascimento("21/08/13");
		alu2.setMatricula(45698);
		
		System.out.println("Nome: " + alu2.getNome ());
		System.out.println("Telefone: " + alu2.getTelefone ());
		System.out.println("CPF: " + alu2.getCPF ());
		System.out.println("Data de nascimento: " + alu2.getDataDeNascimento ());
		System.out.println("Matricula: " + alu2.getMatricula ());
		
		Aluno alu3 = new Aluno();
		
		alu3.setNome("Lucas Lucco");
		alu3.setTelefone("1654-6424");
		alu3.setCPF("456859164-54");
		alu3.setDataDeNascimento("12/03/1999");
		alu3.setMatricula(65452);
		
		System.out.println("Nome: " + alu3.getNome ());
		System.out.println("Telefone: " + alu3.getTelefone ());
		System.out.println("CPF: " + alu3.getCPF ());
		System.out.println("Data de nascimento: " + alu3.getDataDeNascimento ());
		System.out.println("Matricula: " + alu3.getMatricula ());
		
		Aluno alu4 = new Aluno();
		
		alu4.setNome("Julianna");
		alu4.setTelefone("9845-5685");
		alu4.setCPF("126587950-55");
		alu4.setDataDeNascimento("05/03/1997");
		alu4.setMatricula(65520);
		
		System.out.println("Nome: " + alu4.getNome ());
		System.out.println("Telefone: " + alu4.getTelefone ());
		System.out.println("CPF: " + alu4.getCPF ());
		System.out.println("Data de nascimento: " + alu4.getDataDeNascimento ());
		System.out.println("Matricula: " + alu4.getMatricula ());
		
		Aluno alu5 = new Aluno();
		
		alu5.setNome("Livia");
		alu5.setTelefone("2854-5620");
		alu5.setCPF("165869542-22");
		alu5.setDataDeNascimento("30/06/1980");
		alu5.setMatricula(65201);
		
		System.out.println("Nome: " + alu5.getNome ());
		System.out.println("Telefone: " + alu5.getTelefone ());
		System.out.println("CPF: " + alu5.getCPF ());
		System.out.println("Data de nascimento: " + alu5.getDataDeNascimento ());
		System.out.println("Matricula: " + alu5.getMatricula ());
		
		Aluno alu6 = new Aluno();
		
		alu6.setNome("Nelson");
		alu6.setTelefone("4895-5225");
		alu6.setCPF("154620345-88");
		alu6.setDataDeNascimento("31/06/1998");
		alu6.setMatricula(65220);
		
		System.out.println("Nome: " + alu6.getNome ());
		System.out.println("Telefone: " + alu6.getTelefone ());
		System.out.println("CPF: " + alu6.getCPF ());
		System.out.println("Data de nascimento: " + alu6.getDataDeNascimento ());
		System.out.println("Matricula: " + alu6.getMatricula ());
		
		
		Aluno alu7 = new Aluno();
		
		alu7.setNome("Matheus");
		alu7.setTelefone("4551-4561");
		alu7.setCPF("457825987-33");
		alu7.setDataDeNascimento("23/07/2000");
		alu7.setMatricula(64520);
		
		System.out.println("Nome: " + alu7.getNome ());
		System.out.println("Telefone: " + alu7.getTelefone ());
		System.out.println("CPF: " + alu7.getCPF ());
		System.out.println("Data de nascimento: " + alu7.getDataDeNascimento ());
		System.out.println("Matricula: " + alu7.getMatricula ());
		
		Aluno alu8 = new Aluno();
		
		alu8.setNome("Maria");
		alu8.setTelefone("4598-8985");
		alu8.setCPF("489997985-66");
		alu8.setDataDeNascimento("22/11/1995");
		alu8.setMatricula(65645);
		
		System.out.println("Nome: " + alu8.getNome ());
		System.out.println("Telefone: " + alu8.getTelefone ());
		System.out.println("CPF: " + alu8.getCPF ());
		System.out.println("Data de nascimento: " + alu8.getDataDeNascimento ());
		System.out.println("Matricula: " + alu8.getMatricula ());
		
		Professor prof = new Professor();
		
		prof.setNome("Marianno");
		prof.setTelefone("4598-8974");
		prof.setRegistroFuncional("489945785-66");
		prof.setDataDeNascimento("05/11/1975");
		
		System.out.println("Nome: " + prof.getNome ());
		System.out.println("Telefone: " + prof.getTelefone ());
		System.out.println("Registro Funcional: " + prof.getRegistroFuncional ());
		System.out.println("Data de nascimento: " + prof.getDataDeNascimento ());
		
		Professor prof2 = new Professor();
		
		prof2.setNome("Marcio");
		prof2.setTelefone("4575-8974");
		prof2.setRegistroFuncional("489785785-66");
		prof2.setDataDeNascimento("05/11/1978");
		
		System.out.println("Nome: " + prof2.getNome ());
		System.out.println("Telefone: " + prof2.getTelefone ());
		System.out.println("Registro Funcional: " + prof2.getRegistroFuncional ());
		System.out.println("Data de nascimento: " + prof2.getDataDeNascimento ());
		
		Professor prof3 = new Professor();
		
		prof3.setNome("Juliane");
		prof3.setTelefone("4598-8784");
		prof3.setRegistroFuncional("489945085-66");
		prof3.setDataDeNascimento("05/11/1980");
		
		System.out.println("Nome: " + prof3.getNome ());
		System.out.println("Telefone: " + prof3.getTelefone ());
		System.out.println("Registro Funcional: " + prof3.getRegistroFuncional ());
		System.out.println("Data de nascimento: " + prof3.getDataDeNascimento ());
		 

	}

}
