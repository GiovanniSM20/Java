package controller;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
public class JanelaHeranca extends JFrame{
	public JanelaHeranca(){
		super("T�tulo: Janela com Heran�a");
		
		setSize(500, 300);//largura e altura da janela
		setResizable(false);//Impede que a janela seja redimeensionada
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fechar a janela
		
		ImageIcon icone = new ImageIcon("img/ic_curtir.gif");
		setIconImage(icone.getImage());
		
		setLocationRelativeTo(null);//Faz a janela aparecer no centro da tela
		
		setVisible(true);
	}
	
public static void main(String[] args) {
	

		JFrame janela = new JFrame();
		
		janela.setTitle("T�tulo da Janela");
		janela.setSize(500,300);
		janela.setResizable(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icone = new ImageIcon("img/ic_curtir.gif");
		janela.setIconImage(icone.getImage());
	
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		
}
}