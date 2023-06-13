package view;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Cliente;

public class PainelCadastrar extends JPanel{
	public static ArrayList<Cliente> clientes;
	public PainelCadastrar() {
		clientes=new ArrayList<Cliente>();
		criarFormularioCadastro();
		this.setBackground(Color.LIGHT_GRAY);
	}

	private void criarFormularioCadastro() {
		JLabel label  = new JLabel("Nome");
		JTextField caixaNome= new JTextField(6);
		
		JLabel cpf  = new JLabel("CPF");
		JTextField caixaCPF= new JTextField(6);
		
		JLabel matricula  = new JLabel("Matricula");
		JTextField caixamatricula= new JTextField(6);
		
		JLabel vertente  = new JLabel("Vertente");
		JTextField caixaVertente= new JTextField(6);
		
		Botao b= new Botao("Cadastrar", Color.GREEN) ;
		 ActionListener acaoPersonalizada = new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	              Cliente cliente = new Cliente();
	              cliente.nome=caixaNome.getText();
	              cliente.cpf=caixaCPF.getText();
	              cliente.matricula=caixamatricula.getText();
	              cliente.vertente=caixaVertente.getText();
	              clientes.add(cliente);
	            }
	        };
	        b.addActionListener(acaoPersonalizada);
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(label);
		this.add(caixaNome);
		this.add(cpf);
		this.add(caixaCPF);
		this.add(matricula);
		this.add(caixamatricula);
		this.add(vertente);
		this.add(caixaVertente);
		this.add(b);
		
		
		
		
	}
}
