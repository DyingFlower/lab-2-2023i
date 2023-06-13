package view;
import controller.Cliente;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTable;

public class PainelListar extends JPanel{
	 private JTable table;
	 private ArrayList<Cliente> listaclientes;
	 public PainelListar() {
		 criarFormularioListar();
		 listaclientes = PainelCadastrar.clientes;
	 }
	 private void criarFormularioListar(){
		String[][] matriz= new String[4][PainelCadastrar.clientes.size()];
		for(int i = 0;i<PainelCadastrar.clientes.size();i++) {
			 
			 
		}
	}
}
