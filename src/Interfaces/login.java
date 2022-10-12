package Telas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Telas.cadastro;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class login {
	
	JFrame logPrincipal;
	JButton logButton;
	JLabel nome, senha;
	JTextField nomeTF, senhaTF;
	Container cont;
	String nomeConfirm, senhaConfirm;
	Font tituloFonte = new Font("Times New Roman", Font.PLAIN, 15);
	
	public login() {
		cadastro cad = new cadastro();
		cad.cadastro.setVisible(true);
		JFrame logPrincipal = new JFrame();
		logPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton cadButton = new JButton("Cadastro");
		cadButton.setFont(tituloFonte);
		
		JButton logButton = new JButton("Login");
		logButton.setFont(tituloFonte);
		
		
		JTextArea nome = new JTextArea("Nome: ");
		nome.setFont(tituloFonte);
		nome.setEditable(false);
		
		JTextArea senha = new JTextArea("Senha: ");
		senha.setFont(tituloFonte);
		senha.setEditable(false);
		
 		JTextField senhaTF = new JTextField(15);
 		
 		senhaTF.setFont(tituloFonte);
 		
 		JTextField nomeTF = new JTextField(15);
 		nomeTF.setFont(tituloFonte);
 		
 		cont = logPrincipal.getContentPane();
 		cont.setLayout(new FlowLayout());
		
		logPrincipal.setSize(500,500);
		logPrincipal.add(nome);
		logPrincipal.add(nomeTF);
		logPrincipal.add(senha);
		logPrincipal.add(senhaTF);	
		logPrincipal.add(logButton);
		//cont.add(cadButton);


		nomeConfirm = nomeTF.getText();
		
		senhaConfirm = senhaTF.getText();
		
		
		
		logButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nomeTF.getText().equals(cad.nomeTF) && senhaTF.getText().equals(cad.senhaTF)){
					JOptionPane.showMessageDialog(null, "Loagado com sucesso");
				} 
				else {
						JOptionPane.showMessageDialog(null, "Algo de errado");
				}

				}
				
			});
		/* cadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logPrincipal.setVisible(false);
				fodase.cadastro.setVisible(true);
				
			}
		});
		*/
		
		
	}
	
		

}


