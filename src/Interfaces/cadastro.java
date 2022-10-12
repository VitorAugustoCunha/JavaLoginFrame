package Interfaces;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class cadastro {

    String nomeTF;
    String senhaTF;


    public cadastro() {

        JFrame cadastro = new JFrame();
        cadastro.setSize(500, 500);
        cadastro.getContentPane().setLayout(new FlowLayout());

        JTextArea login = new JTextArea("Login: ");
        login.setEditable(false);
        JTextField loginArea = new JTextField(15);

        JTextArea senha = new JTextArea("Senha: ");
        senha.setEditable(false);
        JTextField senhaArea = new JTextField(15);

        JButton cadastrar = new JButton("Cadastrar");

        cadastro.add(login);
        cadastro.add(loginArea);
        cadastro.add(senha);
        cadastro.add(senhaArea);
        cadastro.add(cadastrar);
        cadastro.setVisible(true);

        cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (!loginArea.getText().equals("") & !senhaArea.getText().equals("")){

                    nomeTF = loginArea.getText();
                    senhaTF = senhaArea.getText();

                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                    cadastro.setVisible(false);

                    System.out.println("Login: " + loginArea.getText() + "\nSenha: " + senhaArea.getText());

                } else { JOptionPane.showMessageDialog(null, "Verifique se não está faltando algo em algum dos campos!!");}
            }
        });


    }
}
