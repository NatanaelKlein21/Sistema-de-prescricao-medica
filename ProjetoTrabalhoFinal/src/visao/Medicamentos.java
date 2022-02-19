package visao;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Medicamentos extends JPanel {
	
	private JTextField fieldMedCod;
	private JTextField fieldMedNome;
	private JButton btnMedSalvar;
	private JButton btnMedCancelar;
	private JCheckBox chckbxMedDipirona; 
	private JCheckBox chckbxMedPenicilina;
	private JCheckBox chckbxMedFrutosdoMar;
	private JCheckBox chckbxMedGluten;
	/**
	 * Create the panel.
	 */
	public Medicamentos() {
		setLayout(new MigLayout("", "[grow 15][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow][grow 220][grow]"));
		setBounds(100, 100, 640, 480);
		
		JLabel lblMedTitulo = new JLabel("Medicamentos");
		lblMedTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblMedTitulo, "cell 0 0 2 1");
		
		JLabel lblMedDados = new JLabel("Dados do Medicamento:");
		lblMedDados.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblMedDados, "cell 0 1 2 1,aligny bottom");
		
		JLabel lblCodBarras = new JLabel("Cod. Barras:");
		lblCodBarras.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCodBarras, "cell 0 2,alignx left");
		
		fieldMedCod = new JTextField();
		fieldMedCod.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldMedCod, "cell 1 2,growx");
		fieldMedCod.setColumns(10);
		
		JLabel lblMedNome = new JLabel("Nome:");
		lblMedNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblMedNome, "cell 0 3,alignx left");
		
		fieldMedNome = new JTextField();
		fieldMedNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(fieldMedNome, "cell 1 3 3 1,growx");
		fieldMedNome.setColumns(10);
		
		JLabel lblMedContraIndicado = new JLabel("Contraindicado para as alergias:");
		lblMedContraIndicado.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(lblMedContraIndicado, "cell 0 4 3 1,aligny bottom");
		
		chckbxMedGluten = new JCheckBox("Gluten");
		chckbxMedGluten.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(chckbxMedGluten, "cell 0 5");
		
		chckbxMedFrutosdoMar = new JCheckBox("Frutos do mar");
		chckbxMedFrutosdoMar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(chckbxMedFrutosdoMar, "cell 1 5,alignx center");
		
		chckbxMedPenicilina = new JCheckBox("Penicilina");
		chckbxMedPenicilina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(chckbxMedPenicilina, "cell 2 5");
		
		chckbxMedDipirona = new JCheckBox("Dipirona");
		chckbxMedDipirona.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(chckbxMedDipirona, "cell 3 5");
		
		btnMedSalvar = new JButton("Salvar");
		add(btnMedSalvar, "flowx,cell 0 7 2 1,growx");
		
		btnMedCancelar = new JButton("Cancelar");
		add(btnMedCancelar, "cell 0 7,growx");		
	}
	public JTextField getFieldMedCod() {
		return fieldMedCod;
	}
	public void setFieldMedCod(JTextField fieldMedCod) {
		this.fieldMedCod = fieldMedCod;
	}
	public JTextField getFieldMedNome() {
		return fieldMedNome;
	}
	public void setFieldMedNome(JTextField fieldMedNome) {
		this.fieldMedNome = fieldMedNome;
	}
	public JButton getBtnMedSalvar() {
		return btnMedSalvar;
	}
	public void setBtnMedSalvar(JButton btnMedSalvar) {
		this.btnMedSalvar = btnMedSalvar;
	}
	public JButton getBtnMedCancelar() {
		return btnMedCancelar;
	}
	public void setBtnMedCancelar(JButton btnMedCancelar) {
		this.btnMedCancelar = btnMedCancelar;
	}
	public JCheckBox getChckbxMedDipirona() {
		return chckbxMedDipirona;
	}
	public void setChckbxMedDipirona(JCheckBox chckbxMedDipirona) {
		this.chckbxMedDipirona = chckbxMedDipirona;
	}
	public JCheckBox getChckbxMedPenicilina() {
		return chckbxMedPenicilina;
	}
	public void setChckbxMedPenicilina(JCheckBox chckbxMedPenicilina) {
		this.chckbxMedPenicilina = chckbxMedPenicilina;
	}
	public JCheckBox getChckbxMedFrutosdoMar() {
		return chckbxMedFrutosdoMar;
	}
	public void setChckbxMedFrutosdoMar(JCheckBox chckbxMedFrutosdoMar) {
		this.chckbxMedFrutosdoMar = chckbxMedFrutosdoMar;
	}
	public JCheckBox getChckbxMedGluten() {
		return chckbxMedGluten;
	}
	public void setChckbxMedGluten(JCheckBox chckbxMedGluten) {
		this.chckbxMedGluten = chckbxMedGluten;
	}
	
	public void cancelarMed() {
		
		chckbxMedGluten.setSelected(false);
		chckbxMedFrutosdoMar.setSelected(false);
		chckbxMedDipirona.setSelected(false);
		chckbxMedPenicilina.setSelected(false);
		fieldMedNome.setText("");
		fieldMedCod.setText("");
	}

}
