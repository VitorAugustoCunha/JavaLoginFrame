package Interfaces;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import Interfaces.cadastro;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfaces{
	
	JFrame logPrincipal;
	JButton logButton;
	JLabel nome, senha;
	JTextField nomeTF, senhaTF;
	Container cont;
	String nomeConfirm, senhaConfirm;
	Font tituloFonte = new Font("Times New Roman", Font.PLAIN, 15);
	
	public login() {
		
		JFrame logPrincipal = new JFrame();
		logPrincipal.setVisible(true);
		logPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton logButton = new JButton("Login");
		logButton.setFont(tituloFonte);
		
		
		JLabel nome = new JLabel("Nome: ");
		nome.setFont(tituloFonte);
		
		JLabel senha = new JLabel("Senha: ");
		senha.setFont(tituloFonte);
		
 		JTextField senhaTF = new JTextField("           ");
 		senhaTF.setFont(tituloFonte);
 		
 		JTextField nomeTF = new JTextField("           ");
 		nomeTF.setFont(tituloFonte);
 		
 		cont = logPrincipal.getContentPane();
 		cont.setLayout(new FlowLayout());
		
		logPrincipal.setBounds(400,400,400,400);
		cont.add(nome);
		cont.add(nomeTF);
		cont.add(senha);
		cont.add(senhaTF);	
		cont.add(logButton);
		logPrincipal.add(cont);
		
		nomeConfirm = nomeTF.getText();
		
		senhaConfirm = senhaTF.getText();
	}
	
	public void loginTeste() {
		String n1,n2;
		
		n1 = this.senhaConfirm;
		n2 = this.nomeConfirm;
		
		if (n1 == cadastro.nomeTF){
			if (n2 == cadastro.senhaTF) {
				System.out.println("Cadastro efetuado");
			}
		else {
			System.out.println("Algo errado");
		}
			
		}
		
		
		
	}
}


