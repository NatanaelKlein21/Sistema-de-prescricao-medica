package visao;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private Inicio painelin;
	private Admissao paineladm;
	private Alta painelAlta;
	private ListaInternados painelLista;
	private Medicamentos painelMed;
	private Prescrever painelPresc;
	private CardLayout card;
	private JPanel painelCards;
	private JMenuItem menuListaInternados;
	private JMenuBar menuBar;
	private JMenu menuPacientes;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Sistema de Prescricao Medica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuPacientes = new JMenu("Pacientes");
		menuBar.add(menuPacientes);
		
		JMenuItem menuAdmissao = new JMenuItem("Admissao");
		menuPacientes.add(menuAdmissao);
		
		menuListaInternados = new JMenuItem("Lista de Internados");
		menuPacientes.add(menuListaInternados);
		
		JMenuItem menuAlta = new JMenuItem("Alta");
		menuPacientes.add(menuAlta);
		
		JMenu menuPrescricao = new JMenu("Prescricao");
		menuBar.add(menuPrescricao);
		
		JMenuItem menuMedicamentos = new JMenuItem("Medicamentos");
		menuPrescricao.add(menuMedicamentos);
		
		JMenuItem menuPrescrever = new JMenuItem("Prescrever");
		menuPrescricao.add(menuPrescrever);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		painelCards = new JPanel();
		contentPane.add(painelCards, BorderLayout.CENTER);
		
		card= new CardLayout();
		
		painelCards.setLayout(card);
		
		painelin=new Inicio();
		paineladm=new Admissao();
		painelAlta=new Alta();
		painelLista=new ListaInternados();
		painelMed=new Medicamentos();
		painelPresc=new Prescrever();
		
		painelCards.add(painelin,"P1");
		painelCards.add(paineladm,"P2");
		painelCards.add(painelLista,"P3");
		painelCards.add(painelAlta,"P4");
		painelCards.add(painelMed,"P5");
		painelCards.add(painelPresc,"P6");
		
		card.show(painelCards, "P1");
		
		menuAdmissao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(painelCards, "P2");
			}
		});
		
		menuListaInternados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(painelCards, "P3");
			}
		});
		
		menuAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(painelCards, "P4");
			}
		});
		
		menuMedicamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(painelCards, "P5");
			}
		});
		
		menuPrescrever.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(painelCards, "P6");
			}
		});
		
		

		
		
		
			
	}

	public Inicio getPainelin() {
		return painelin;
	}

	public void setPainelin(Inicio painelin) {
		this.painelin = painelin;
	}

	public Admissao getPaineladm() {
		return paineladm;
	}

	public void setPaineladm(Admissao paineladm) {
		this.paineladm = paineladm;
	}

	public Alta getPainelAlta() {
		return painelAlta;
	}

	public void setPainelAlta(Alta painelAlta) {
		this.painelAlta = painelAlta;
	}

	public ListaInternados getPainelLista() {
		return painelLista;
	}

	public void setPainelLista(ListaInternados painelLista) {
		this.painelLista = painelLista;
	}

	public Medicamentos getPainelMed() {
		return painelMed;
	}

	public void setPainelMed(Medicamentos painelMed) {
		this.painelMed = painelMed;
	}

	public Prescrever getPainelPresc() {
		return painelPresc;
	}

	public void setPainelPresc(Prescrever painelPresc) {
		this.painelPresc = painelPresc;
	}
	
	
	public void inicio() {
		card.show(painelCards, "P1");
	}
	
	public JMenuItem getMenuListaInternados() {
		return menuListaInternados;
	}

	public void setMenuListaInternados(JMenuItem menuListaInternados) {
		this.menuListaInternados = menuListaInternados;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getMenuPacientes() {
		return menuPacientes;
	}

	public void setMenuPacientes(JMenu menuPacientes) {
		this.menuPacientes = menuPacientes;
	}
	

	

}
