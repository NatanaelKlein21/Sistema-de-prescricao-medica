package visao;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class Admissao extends JPanel {
	private JTextField fieldAdmiNome;
	private JTextField fieldAdmiCPF;
	private JTextField fieldAdmiDataNasc;
	private JButton btnAdmiSalvar;
	private JButton btnAdmiCancelar;
	private JComboBox<String> boxAdmiUnidade;
	private JCheckBox chckbxAdmiPenicilina;
	private JCheckBox chckbxAdmiFrutosdoMar;
	private JCheckBox chckbxAdmiDipirona;
	private JCheckBox chckbxAdmiGluten;
	private JLabel lblAdmiTitulo;

	/**
	 * Create the panel.
	 */
	public Admissao() {
		setBounds(100, 100, 640, 480);
		setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[][grow][grow][grow][grow][grow][grow][grow][grow][grow]"));
		
		lblAdmiTitulo = new JLabel("Admiss\u00E3o");
		lblAdmiTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblAdmiTitulo, "cell 0 0");
		
		
		JLabel lblDadosdoPaciente = new JLabel("DadosdoPasciente:");
		lblDadosdoPaciente.setVerticalAlignment(SwingConstants.TOP);
		add(lblDadosdoPaciente, "cell 0 1,aligny bottom");
		
		JLabel lblNewLabel = new JLabel("Alergias:");
		add(lblNewLabel, "cell 2 1,aligny bottom");
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCPF, "flowx,cell 0 2");
		
		chckbxAdmiGluten = new JCheckBox("Gl\u00FAten");
		add(chckbxAdmiGluten, "cell 2 2");
		
		chckbxAdmiDipirona = new JCheckBox("Dipirona");
		add(chckbxAdmiDipirona, "cell 3 2");
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblNome, "flowx,cell 0 3,alignx left");
		
		chckbxAdmiFrutosdoMar = new JCheckBox("Frutos do mar");
		chckbxAdmiFrutosdoMar.setToolTipText("S");
		add(chckbxAdmiFrutosdoMar, "cell 2 3");
		
		chckbxAdmiPenicilina = new JCheckBox("Penicilina");
		add(chckbxAdmiPenicilina, "cell 3 3");
		
		JLabel lblNasc = new JLabel("Data Nasc:");
		lblNasc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblNasc, "flowx,cell 0 4");
		
		JLabel lblDadosAdmissao = new JLabel("Dados da admiss\u00E3o:");
		lblDadosAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblDadosAdmissao, "cell 0 6,aligny bottom");
		
		JLabel lblUnidade = new JLabel("Unidade:");
		lblUnidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblUnidade, "flowx,cell 0 7");
		
		btnAdmiSalvar = new JButton("Salvar");
		btnAdmiSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(btnAdmiSalvar, "flowx,cell 0 9");
		
		fieldAdmiNome = new JTextField();
		fieldAdmiNome.setHorizontalAlignment(SwingConstants.LEFT);
		fieldAdmiNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(fieldAdmiNome, "cell 0 3,growx");
		fieldAdmiNome.setColumns(10);
		
		fieldAdmiCPF = new JTextField();
		fieldAdmiCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(fieldAdmiCPF, "cell 0 2,growx");
		fieldAdmiCPF.setColumns(10);
		
		fieldAdmiDataNasc = new JTextField();
		fieldAdmiDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(fieldAdmiDataNasc, "cell 0 4,growx");
		fieldAdmiDataNasc.setColumns(10);
		
		btnAdmiCancelar = new JButton("Cancelar");
		btnAdmiCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(btnAdmiCancelar, "cell 0 9");
		
		boxAdmiUnidade = new JComboBox<String>();
		boxAdmiUnidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(boxAdmiUnidade, "cell 0 7,growx");
		boxAdmiUnidade.addItem("");
		boxAdmiUnidade.addItem("Ambulatorio");
		boxAdmiUnidade.addItem("Emergencia");
		boxAdmiUnidade.addItem("UTI");
		
		
		
	}
	public JTextField getFieldAdmiNome() {
		return fieldAdmiNome;
	}



	public void setFieldAdmiNome(JTextField fieldAdmiNome) {
		this.fieldAdmiNome = fieldAdmiNome;
	}



	public JTextField getFieldAdmiCPF() {
		return fieldAdmiCPF;
	}



	public void setFieldAdmiCPF(JTextField fieldAdmiCPF) {
		this.fieldAdmiCPF = fieldAdmiCPF;
	}



	public JTextField getFieldAdmiDataNasc() {
		return fieldAdmiDataNasc;
	}



	public void setFieldAdmiDataNasc(JTextField fieldAdmiDataNasc) {
		this.fieldAdmiDataNasc = fieldAdmiDataNasc;
	}



	public JButton getBtnAdmiSalvar() {
		return btnAdmiSalvar;
	}



	public void setBtnAdmiSalvar(JButton btnAdmiSalvar) {
		this.btnAdmiSalvar = btnAdmiSalvar;
	}



	public JButton getBtnAdmiCancelar() {
		return btnAdmiCancelar;
	}



	public void setBtnAdmiCancelar(JButton btnAdmiCancelar) {
		this.btnAdmiCancelar = btnAdmiCancelar;
	}



	public JComboBox<String> getBoxAdmiUnidade() {
		return boxAdmiUnidade;
	}



	public void setBoxAdmiUnidade(JComboBox<String> boxAdmiUnidade) {
		this.boxAdmiUnidade = boxAdmiUnidade;
	}



	public JCheckBox getChckbxAdmiPenicilina() {
		return chckbxAdmiPenicilina;
	}



	public void setChckbxAdmiPenicilina(JCheckBox chckbxAdmiPenicilina) {
		this.chckbxAdmiPenicilina = chckbxAdmiPenicilina;
	}



	public JCheckBox getChckbxAdmiFrutosdoMar() {
		return chckbxAdmiFrutosdoMar;
	}



	public void setChckbxAdmiFrutosdoMar(JCheckBox chckbxAdmiFrutosdoMar) {
		this.chckbxAdmiFrutosdoMar = chckbxAdmiFrutosdoMar;
	}



	public JCheckBox getChckbxAdmiDipirona() {
		return chckbxAdmiDipirona;
	}



	public void setChckbxAdmiDipirona(JCheckBox chckbxAdmiDipirona) {
		this.chckbxAdmiDipirona = chckbxAdmiDipirona;
	}



	public JCheckBox getChckbxAdmiGluten() {
		return chckbxAdmiGluten;
	}



	public void setChckbxAdmiGluten(JCheckBox chckbxAdmiGluten) {
		this.chckbxAdmiGluten = chckbxAdmiGluten;
	}

	public void cancelarAdmi() {
		
		fieldAdmiNome.setText("");
		fieldAdmiCPF.setText("");
		fieldAdmiDataNasc.setText("");
		boxAdmiUnidade.setSelectedIndex(0);
		chckbxAdmiGluten.setSelected(false);
		chckbxAdmiFrutosdoMar.setSelected(false);
		chckbxAdmiDipirona.setSelected(false);
		chckbxAdmiPenicilina.setSelected(false);
		
	}

}