package exercicio8;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Interface extends JFrame{
	JLabel lblValor = new JLabel("Valor");
	JLabel lblJuros = new JLabel("Juros");
	JLabel lblParcela = new JLabel("Parcela");
	JLabel lblValorT = new JLabel("Valor Total");
	JTextField txtvalor = new JTextField();
	JTextField txtjuros = new JTextField();
	JTextField txtparcela = new JTextField();
	JTextField txtvalort = new JTextField();
	

	JButton btnCalculo = new JButton("Calcular");
	
		double valor, juros, parcela, valor_total;
	public Interface(){
		Calculo calcu = new Calculo();
		
		
		Container paine = this.getContentPane();
		
		paine.add(lblValor); // label
		
		lblValor.setBounds(20,20,245,40);
		
		paine.add(txtvalor);// caixa
		txtvalor.setBounds(120,30,140,20);
		
		paine.add(lblJuros);// label
		lblJuros.setBounds(20,100,245,40);
		
		paine.add(txtjuros);// caixa
		txtjuros.setBounds(120,110,140,20);
		
		paine.add(lblParcela);// label
		lblParcela.setBounds(20,140,245,40);
		
		paine.add(txtparcela);// caixa
		txtparcela.setBounds(120,150,140,20);
		
		paine.add(lblValorT);// label
		lblValorT.setBounds(20,220,245,40);
		
		paine.add(txtvalort);// caixa
		txtvalort.setBounds(120,230,140,20);
		
		

		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 valor = Double.parseDouble(txtvalor.getText());
				 juros = Double.parseDouble(txtjuros.getText());
				 parcela = Double.parseDouble(txtparcela.getText());
				 txtvalort.setText("" + calcu.juros(valor, juros, parcela));
				 
			 }
		 });
		btnCalculo.setBounds(90,400,100,40);
		
		txtvalort.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Interface cad = new Interface();
		
	}
}
