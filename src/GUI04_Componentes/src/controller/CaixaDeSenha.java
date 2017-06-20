package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class CaixaDeSenha extends JFrame {
	public static void main(String[] args) {
		new CaixaDeSenha();
	}
	public CaixaDeSenha(){
		super ("Caixa de Senha");
		final JPasswordField caixaDeSenha = new JPasswordField(20);
		JLabel label = new JLabel("Digite sua senha aqui:");
		caixaDeSenha.setToolTipText("Digite nimim");
			
			
		JButton botao1 = new JButton("Botão 1");
	botao1.addActionListener(new ActionListener(){	
			
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, new String(caixaDeSenha.getPassword()));
				
			}
		});
		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(caixaDeSenha);
		painel.add(botao1);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}

}
