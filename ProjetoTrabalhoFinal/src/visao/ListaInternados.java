package visao;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ListaInternados extends JPanel {
	private JButton btnListaCancelar;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JTextArea textAreaNome;
	private JTextArea textAreaUnidade;
	private JTextArea textAreaDataNasc;
	private JTextArea textAreaAlergias;

	/**
	 * Create the panel.
	 */
	public ListaInternados() {
		setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[][grow 5][grow][][grow 5]"));
		setBounds(100, 100, 640, 480);
		
		JPanel panel = new JPanel();
		add(panel, "cell 0 0");
		
		JLabel lblTituloLista = new JLabel("Lista de Internados");
		lblTituloLista.setVerticalAlignment(SwingConstants.TOP);
		lblTituloLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloLista.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblTituloLista);
		
		JLabel lblListaNome = new JLabel("Nome:");
		lblListaNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblListaNome, "cell 0 1");
		
		JLabel lblListaUnidade = new JLabel("Unidade:");
		lblListaUnidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblListaUnidade, "cell 1 1,grow");
		
		JLabel lblListaDataNasc = new JLabel("Data Nasc:");
		lblListaDataNasc.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblListaDataNasc, "cell 2 1");
		
		JLabel lblListaAlergias = new JLabel("Alergias:");
		lblListaAlergias.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblListaAlergias, "cell 3 1");
		
		scrollPane = new JScrollPane();
		add(scrollPane, "cell 0 2,grow");
		
		textAreaNome = new JTextArea();
		scrollPane.setViewportView(textAreaNome);
		
		scrollPane_1 = new JScrollPane();
		add(scrollPane_1, "cell 1 2,grow");
		
		textAreaUnidade = new JTextArea();
		scrollPane_1.setViewportView(textAreaUnidade);
		
		scrollPane_2 = new JScrollPane();
		add(scrollPane_2, "cell 2 2,grow");
		
		textAreaDataNasc = new JTextArea();
		scrollPane_2.setViewportView(textAreaDataNasc);
		
		scrollPane_3 = new JScrollPane();
		add(scrollPane_3, "cell 3 2,grow");
		
		textAreaAlergias = new JTextArea();
		scrollPane_3.setViewportView(textAreaAlergias);
		
		btnListaCancelar = new JButton("Cancelar");
		btnListaCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(btnListaCancelar, "cell 0 4,growx 30");
	}
	
	

	public JButton getBtnListaCancelar() {
		return btnListaCancelar;
	}

	public void setBtnListaCancelar(JButton btnListaCancelar) {
		this.btnListaCancelar = btnListaCancelar;
	}

	public JTextArea getTextAreaNome() {
		return textAreaNome;
	}

	public void setTextAreaNome(JTextArea textAreaNome) {
		this.textAreaNome = textAreaNome;
	}

	public JTextArea getTextAreaUnidade() {
		return textAreaUnidade;
	}

	public void setTextAreaUnidade(JTextArea textAreaUnidade) {
		this.textAreaUnidade = textAreaUnidade;
	}

	public JTextArea getTextAreaDataNasc() {
		return textAreaDataNasc;
	}

	public void setTextAreaDataNasc(JTextArea textAreaDataNasc) {
		this.textAreaDataNasc = textAreaDataNasc;
	}

	public JTextArea getTextAreaAlergias() {
		return textAreaAlergias;
	}

	public void setTextAreaAlergias(JTextArea textAreaAlergias) {
		this.textAreaAlergias = textAreaAlergias;
	}
	
	public void cancelarLista() {
		
		textAreaNome.setText("");
		textAreaUnidade.setText("");
		textAreaAlergias.setText("");
		textAreaDataNasc.setText("");
	}

}
