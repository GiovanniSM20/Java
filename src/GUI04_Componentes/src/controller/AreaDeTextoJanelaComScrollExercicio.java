// Giovanni Martins

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTextoJanelaComScrollExercicio extends JFrame{
	JTextArea areaDeTexto = new JTextArea(10,30);

	public static void main(String[] args){
		new AreaDeTextoJanelaComScrollExercicio();
	}
	public AreaDeTextoJanelaComScrollExercicio(){
		super("Área de Texto Janela com Scroll exercício");
		
		JLabel label = new JLabel("Digite uma mensagem:");
		
		JPanel painel1 = new JPanel();
		painel1.add(label);
		painel1.add(areaDeTexto);
		
		JScrollPane sp = new JScrollPane(painel1, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(sp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
		
		JButton botao = new JButton("Botão 1");
		botao.setToolTipText("Clica em mim !!!");
		botao.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0){
				JOptionPane.showMessageDialog(null, areaDeTexto);
			}	
		});
	
		painel1.add(botao);
		
		
	}
		
		
	}


