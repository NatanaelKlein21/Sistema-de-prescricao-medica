package visao;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;


public class Prescrever extends JPanel {

	private JTextField fieldPrescricaoNome;
	private JTextField fieldPrescricaoCPF;
	private JTextField fieldPrescricaoDataNasc;
	private JButton btnPrescricaoSalvar;
	private JButton btnPrescricaoCancelar;
	private JCheckBox chckbxPrescricaoPenicilina;
	private JCheckBox chckbxPrescricaoFrutosdoMar;
	private JCheckBox chckbxPrescricaoDipirona;
	private JCheckBox chckbxPrescricaoGluten;
	private JLabel lblPrescricaoTitulo;
	private JTextField fieldPrescricaoMed1;
	private JTextField fieldPrescricaoMed2;
	
	public Prescrever() {
		setBounds(100, 100, 640, 480);
		setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[][grow][grow][grow][grow][grow][grow][grow][grow][grow]"));
		
		lblPrescricaoTitulo = new JLabel("Prescricao");
		lblPrescricaoTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblPrescricaoTitulo, "cell 0 0");
		
		
		JLabel lblDadosdoPaciente = new JLabel("Dados do Pasciente:");
		lblDadosdoPaciente.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDadosdoPaciente.setVerticalAlignment(SwingConstants.TOP);
		add(lblDadosdoPaciente, "cell 0 1,aligny bottom");
		
		JLabel lblNewLabel = new JLabel("Alergias:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblNewLabel, "cell 2 1,aligny bottom");
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblCPF, "flowx,cell 0 2");
		
		chckbxPrescricaoGluten = new JCheckBox("Gluten");
		chckbxPrescricaoGluten.setEnabled(false);
		add(chckbxPrescricaoGluten, "cell 2 2");
		
		chckbxPrescricaoDipirona = new JCheckBox("Dipirona");
		chckbxPrescricaoDipirona.setEnabled(false);
		add(chckbxPrescricaoDipirona, "cell 3 2");
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblNome, "flowx,cell 0 3,alignx left");
		
		chckbxPrescricaoFrutosdoMar = new JCheckBox("Frutos do mar");
		chckbxPrescricaoFrutosdoMar.setEnabled(false);
		add(chckbxPrescricaoFrutosdoMar, "cell 2 3");
		
		chckbxPrescricaoPenicilina = new JCheckBox("Penicilina");
		chckbxPrescricaoPenicilina.setEnabled(false);
		add(chckbxPrescricaoPenicilina, "cell 3 3");
		
		JLabel lblNasc = new JLabel("Data Nasc:");
		lblNasc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblNasc, "flowx,cell 0 4");
		
		JLabel lblPrescricao = new JLabel("prescricao:");
		lblPrescricao.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblPrescricao, "cell 0 6,aligny bottom");
		
		fieldPrescricaoNome = new JTextField();
		fieldPrescricaoNome.setEditable(false);
		fieldPrescricaoNome.setHorizontalAlignment(SwingConstants.LEFT);
		fieldPrescricaoNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(fieldPrescricaoNome, "cell 0 3,growx");
		fieldPrescricaoNome.setColumns(10);
		
		fieldPrescricaoCPF = new JTextField();
		fieldPrescricaoCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(fieldPrescricaoCPF, "cell 0 2,growx");
		fieldPrescricaoCPF.setColumns(10);
		
		fieldPrescricaoDataNasc = new JTextField();
		fieldPrescricaoDataNasc.setEditable(false);
		fieldPrescricaoDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(fieldPrescricaoDataNasc, "cell 0 4,growx");
		fieldPrescricaoDataNasc.setColumns(10);
		
		fieldPrescricaoMed2 = new JTextField();
		fieldPrescricaoMed2.setEditable(false);
		add(fieldPrescricaoMed2, "cell 1 7 3 1,growx");
		fieldPrescricaoMed2.setColumns(10);
		
		btnPrescricaoSalvar = new JButton("Salvar");
		btnPrescricaoSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(btnPrescricaoSalvar, "cell 0 9,growx");

		
		btnPrescricaoCancelar = new JButton("Cancelar");
		btnPrescricaoCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(btnPrescricaoCancelar, "cell 0 9,growx");

		JLabel lblMedicamento = new JLabel("Medicamento:");
		lblMedicamento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblMedicamento, "flowx,cell 0 7,alignx trailing");
		
		fieldPrescricaoMed1 = new JTextField();
		add(fieldPrescricaoMed1, "cell 0 7,growx");
		fieldPrescricaoMed1.setColumns(10);
	}

	public JTextField getFieldPrescricaoNome() {
		return fieldPrescricaoNome;
	}

	public void setFieldPrescricaoNome(JTextField fieldPrescricaoNome) {
		this.fieldPrescricaoNome = fieldPrescricaoNome;
	}

	public JTextField getFieldPrescricaoCPF() {
		return fieldPrescricaoCPF;
	}

	public void setFieldPrescricaoCPF(JTextField fieldPrescricaoCPF) {
		this.fieldPrescricaoCPF = fieldPrescricaoCPF;
	}

	public JTextField getFieldPrescricaoDataNasc() {
		return fieldPrescricaoDataNasc;
	}

	public void setFieldPrescricaoDataNasc(JTextField fieldPrescricaoDataNasc) {
		this.fieldPrescricaoDataNasc = fieldPrescricaoDataNasc;
	}

	public JButton getBtnPrescricaoSalvar() {
		return btnPrescricaoSalvar;
	}

	public void setBtnPrescricaoSalvar(JButton btnPrescricaoSalvar) {
		this.btnPrescricaoSalvar = btnPrescricaoSalvar;
	}

	public JButton getBtnPrescricaoCancelar() {
		return btnPrescricaoCancelar;
	}

	public void setBtnPrescricaoCancelar(JButton btnPrescricaoCancelar) {
		this.btnPrescricaoCancelar = btnPrescricaoCancelar;
	}

	public JCheckBox getChckbxPrescricaoPenicilina() {
		return chckbxPrescricaoPenicilina;
	}

	public void setChckbxPrescricaoPenicilina(JCheckBox chckbxPrescricaoPenicilina) {
		this.chckbxPrescricaoPenicilina = chckbxPrescricaoPenicilina;
	}

	public JCheckBox getChckbxPrescricaoFrutosdoMar() {
		return chckbxPrescricaoFrutosdoMar;
	}

	public void setChckbxPrescricaoFrutosdoMar(JCheckBox chckbxPrescricaoFrutosdoMar) {
		this.chckbxPrescricaoFrutosdoMar = chckbxPrescricaoFrutosdoMar;
	}

	public JCheckBox getChckbxPrescricaoDipirona() {
		return chckbxPrescricaoDipirona;
	}

	public void setChckbxPrescricaoDipirona(JCheckBox chckbxPrescricaoDipirona) {
		this.chckbxPrescricaoDipirona = chckbxPrescricaoDipirona;
	}

	public JCheckBox getChckbxPrescricaoGluten() {
		return chckbxPrescricaoGluten;
	}

	public void setChckbxPrescricaoGluten(JCheckBox chckbxPrescricaoGluten) {
		this.chckbxPrescricaoGluten = chckbxPrescricaoGluten;
	}

	public JTextField getFieldPrescricaoMed1() {
		return fieldPrescricaoMed1;
	}

	public void setFieldPrescricaoMed1(JTextField fieldPrescricaoMed1) {
		this.fieldPrescricaoMed1 = fieldPrescricaoMed1;
	}

	public JTextField getFieldPrescricaoMed2() {
		return fieldPrescricaoMed2;
	}

	public void setFieldPrescricaoMed2(JTextField fieldPrescricaoMed2) {
		this.fieldPrescricaoMed2 = fieldPrescricaoMed2;
	}
	
	
	public void cancelarPresc() {
		
		chckbxPrescricaoGluten.setSelected(false);
		chckbxPrescricaoFrutosdoMar.setSelected(false);
		chckbxPrescricaoDipirona.setSelected(false);
		chckbxPrescricaoPenicilina.setSelected(false);
		fieldPrescricaoMed1.setText("");
		fieldPrescricaoMed2.setText("");
		fieldPrescricaoNome.setText("");
		fieldPrescricaoCPF.setText("");
		fieldPrescricaoDataNasc.setText("");
		
	}

}