package visao;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Alta extends JPanel {
	
	private JTextField fieldAltaCPF;
	private JComboBox<String> boxAltaMotivo;
	private JButton btnAltaSalvar;
	private JButton btnAltaCancelar;
	/**
	 * Create the panel.
	 */
	public Alta() {
		setLayout(new MigLayout("", "[grow][grow 8][grow][grow 150]", "[grow][grow 10][grow 10][grow][grow 6]"));
		setBounds(100, 100, 640, 480);
		
		JLabel lblAltaTitulo = new JLabel("Alta");
		lblAltaTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblAltaTitulo, "cell 0 0,aligny top");
		
		JLabel lblAltaCPF = new JLabel("CPF:");
		lblAltaCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltaCPF.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblAltaCPF, "cell 1 1,alignx left,grow");
		
		fieldAltaCPF = new JTextField();
		fieldAltaCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(fieldAltaCPF, "cell 2 1,grow");
		fieldAltaCPF.setColumns(10);
		
		JLabel lblAltaMotivo = new JLabel("Motivo:");
		add(lblAltaMotivo, "cell 1 2,alignx left");
		
		boxAltaMotivo = new JComboBox<String>();
		boxAltaMotivo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(boxAltaMotivo, "cell 2 2,growx");
		boxAltaMotivo.addItem("");
		boxAltaMotivo.addItem("Cura");
		boxAltaMotivo.addItem("Transferencia");
		boxAltaMotivo.addItem("Obito");
		
		btnAltaSalvar = new JButton("Salvar");
		add(btnAltaSalvar, "flowx,cell 0 4 2 1,grow");
		
		btnAltaCancelar = new JButton("Cancelar");
		add(btnAltaCancelar, "cell 0 4 2 1,grow");
	}
	
	public JTextField getFieldAltaCPF() {
		return fieldAltaCPF;
	}
	public void setFieldAltaCPF(JTextField fieldAltaCPF) {
		this.fieldAltaCPF = fieldAltaCPF;
	}
	public JComboBox<String> getBoxAltaMotivo() {
		return boxAltaMotivo;
	}
	public void setBoxAltaMotivo(JComboBox<String> boxAltaMotivo) {
		this.boxAltaMotivo = boxAltaMotivo;
	}
	public JButton getBtnAltaSalvar() {
		return btnAltaSalvar;
	}
	public void setBtnAltaSalvar(JButton btnAltaSalvar) {
		this.btnAltaSalvar = btnAltaSalvar;
	}
	public JButton getBtnAltaCancelar() {
		return btnAltaCancelar;
	}
	public void setBtnAltaCancelar(JButton btnAltaCancelar) {
		this.btnAltaCancelar = btnAltaCancelar;
	}
	
	public void cancelarAlta() {
		
		fieldAltaCPF.setText("");
		boxAltaMotivo.setSelectedIndex(0);
		
	}
	
	

}
