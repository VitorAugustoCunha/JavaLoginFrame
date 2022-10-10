package Telas;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;


public class FPrincipal {

	public static void main(String[] args) {
		
		JFrame tela = new JFrame();
		JButton b1 = new JButton("Login");
		JPanel cont = new JPanel();
		JLabel label1 = new JLabel("Digite Seu e-mail");
		
		
		cont.add(b1);
		
		tela.setVisible(true);
		tela.setBounds(300, 300, 300, 300);
		tela.setLayout(new FlowLayout());
		tela.add(label1);
		tela.add(cont);
		
		
	}

}
