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

public class AreaDeTextoComScrollExercicio extends JFrame {
	
		public static void main(String[] args) {
				new AreaDeTextoComScrollExercicio();
		}
public AreaDeTextoComScrollExercicio(){
	super ("�rea de Texto Janela com Scroll");
JLabel label = new JLabel("Digite uma mensagem");
JTextArea areaDeTexto = new JTextArea(10, 30);

JPanel painel = new JPanel();
painel.add(label);
painel.add(areaDeTexto);

JScrollPane sp = new JScrollPane(painel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

add(sp);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(300, 200);
setVisible(true);

}
}


