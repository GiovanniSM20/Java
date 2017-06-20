package controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class Menu extends JFrame {

	JLabel output = new JLabel();

	public Menu (){
		super ("Exemplo Menu");
		
	JMenuBar menuBar = new JMenuBar();
	
	JMenu menu = new JMenu("Um Menu");
	menu.setMnemonic(KeyEvent.VK_A);
	menuBar.add(menu);
	
	class Acao implements ActionListener {
		public void actionPerformed(ActionEvent e){
			output.setText(e.getActionCommand());
			
		}
	}

	Acao acao = new Acao();
	JMenuItem menuItem1 = new JMenuItem("Item de menu somente com texto");
	menuItem1.setMnemonic(KeyEvent.VK_T);
	menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,
			ActionEvent.ALT_MASK));
	menuItem1.addActionListener(acao);
	menu.add(menuItem1);
	
	ImageIcon icon = new ImageIcon("img/abrir.png");
	JMenuItem menuItem2 = new JMenuItem("Texto e icone junto",
			icon);
	menuItem2.setMnemonic(KeyEvent.VK_1);
	menuItem2.setActionCommand
		("Clicou em item de menu com texto e icone");
	menuItem2.addActionListener(acao);
	menu.add(menuItem2);
	
	icon = new ImageIcon("img/salvar.png");
	JMenuItem menuItem3 = new JMenuItem(icon); //Somente com icone
	menuItem3.setMnemonic(KeyEvent.VK_I);
	menuItem3.addActionListener(acao);
	menu.add(menuItem3);
	
	menu.addSeparator();
	
	JRadioButtonMenuItem rbMenuItem1 = new JRadioButtonMenuItem(
			"Um item de menu radio button");
	rbMenuItem1.setSelected(true);
	rbMenuItem1.setMnemonic(KeyEvent.VK_R);
	rbMenuItem1.setActionCommand(
			"CLicou em um item de menu radio button");
	rbMenuItem1.addActionListener(acao);
	menu.add(rbMenuItem1);
	
	JRadioButtonMenuItem rbMenuItem2 = new JRadioButtonMenuItem(
			"Outro item de menu radio button");
	rbMenuItem2.setMnemonic(KeyEvent.VK_O);
	rbMenuItem2.setActionCommand(
			"Clicou em outro item de menu radio button");
	rbMenuItem2.addActionListener(acao);
	menu.add(rbMenuItem2);
	
	ButtonGroup group = new ButtonGroup();
	group.add(rbMenuItem1);
	group.add(rbMenuItem2);
	
	menu.addSeparator();
	
	JMenu submenu = new JMenu("Submenu");
	submenu.setMnemonic(KeyEvent.VK_S);
	
	JMenuItem subMenuItem1 = new JMenuItem("Um item no submenu");
	subMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,
			ActionEvent.ALT_MASK));
	subMenuItem1.setActionCommand("Clicou em um item no submenu");
	submenu.add(rbMenuItem1);
	
	
		JMenuItem subMenuItem2 = new JMenuItem("Outro item no submenu");
		subMenuItem2.setActionCommand("Clicou em outro item no submenu");
		subMenuItem2.addActionListener(acao);
		submenu.add(subMenuItem2);
		menu.add(submenu);
		
	JMenu menuVazio = new JMenu("Outro Menu");
	menuVazio.setMnemonic(KeyEvent.VK_N);
	menuBar.add(menuVazio);
	
	setJMenuBar(menuBar);
	
	Container container = getContentPane();
	container.add(output, BorderLayout.CENTER);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 200);
	setVisible(true);
	}
	public static void main(String[] args) {
		new Menu();
			
	}
}
