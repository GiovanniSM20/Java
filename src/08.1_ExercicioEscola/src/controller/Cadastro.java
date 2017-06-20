package controller;
import model.Aluno;
import model.Professor;
public class Cadastro {
		public static void main(String[] args){
			Aluno alu = new Aluno ();
			alu.setNome("Juca Bala");
			alu.setTelefone("993289870");
			alu.setCpf(45684134);
			alu.setDataDeNascimento("09/11/1996");
			alu.setMatricula(544852221);
			alu.mostrar();
			
			Aluno alu2 = new Aluno ();
			alu2.setNome("Xeroque Holmes");
			alu2.setTelefone("993289999");
			alu2.setCpf(45684134);
			alu2.setDataDeNascimento("09/11/1996");
			alu2.setMatricula(589752221);
			alu2.mostrar();
			
			Aluno alu3 = new Aluno ();
			alu3.setNome("Jureg");
			alu3.setTelefone("993288577");
			alu3.setCpf(45684134);
			alu3.setDataDeNascimento("09/11/1996");
			alu3.setMatricula(594752221);
			alu3.mostrar();
			
			Aluno alu4 = new Aluno ();
			alu4.setNome("Birl");
			alu4.setTelefone("993289967");
			alu4.setCpf(45684134);
			alu4.setDataDeNascimento("09/11/1996");
			alu4.setMatricula(523492221);
			alu4.mostrar();
			
			Aluno alu5 = new Aluno ();
			alu5.setNome("Menor Uchiha");
			alu5.setTelefone("993289465");
			alu5.setCpf(45684134);
			alu5.setDataDeNascimento("09/11/1996");
			alu5.setMatricula(542375221);
			alu5.mostrar();
			
			Aluno alu6 = new Aluno ();
			alu6.setNome("Negão do Whatsapp");
			alu6.setTelefone("993289658");
			alu6.setCpf(45684134);
			alu6.setDataDeNascimento("09/11/1996");
			alu6.setMatricula(564895221);
			alu6.mostrar();
			
			Aluno alu7 = new Aluno ();
			alu7.setNome("Bino ");
			alu7.setTelefone("993287432");
			alu7.setCpf(45684134);
			alu7.setDataDeNascimento("09/11/1996");
			alu7.setMatricula(944852221);
			alu7.mostrar();
			
			Aluno alu8 = new Aluno ();
			alu8.setNome("Arex");
			alu8.setTelefone("993286985");
			alu8.setCpf(45684134);
			alu8.setDataDeNascimento("09/11/1996");
			alu8.setMatricula(544854821);
			alu8.mostrar();
			
			Professor prof = new Professor ();
			prof.setNome("Alan");
			prof.setTelefone("465466598");
			prof.setRegistroFuncional(762975);
			prof.setDataDeNascimento("02/08/1972");
			prof.mostrar();
			
			Professor prof2 = new Professor ();
			prof2.setNome("Sergio");
			prof2.setTelefone("566766598");
			prof2.setRegistroFuncional(762975);
			prof2.setDataDeNascimento("12/09/1899");
			prof2.mostrar();
			
			Professor prof3 = new Professor ();
			prof3.setNome("Fabricio");
			prof3.setTelefone("965866598");
			prof3.setRegistroFuncional(762975);
			prof3.setDataDeNascimento("08/02/1955");
			prof3.mostrar();
		}
}
