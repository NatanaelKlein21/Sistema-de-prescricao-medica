package controle;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import dao.DAOPaciente;
import modelo.Paciente;
import visao.JanelaPrincipal;



public class AltaControle implements ActionListener  {
	
	private Paciente p;
	private JanelaPrincipal j;
	private DAOPaciente pacdao;
	
	public AltaControle (Paciente p, JanelaPrincipal j) throws IOException {
		
		this.p=p;
		this.j=j;
		pacdao = new DAOPaciente();
		this.j.getPainelAlta().getBtnAltaCancelar().addActionListener(this);
		this.j.getPainelAlta().getBtnAltaSalvar().addActionListener(this);	
	}
	
	public boolean listaExcecoes() {
		if (j.getPainelAlta().getFieldAltaCPF().getText().isEmpty())
		{
			System.out.println("Campo CPF obrigatório");
			return true;
		}
			else if (!Paciente.isCPF(p.getCpf())) 
			{
				System.out.println("CPF Inválido");
				return true;
			}
		if (j.getPainelAlta().getBoxAltaMotivo().getSelectedItem() == "") 
		{
			System.out.println("Campo MOTIVO obrigatório");
			return true;
		}
		return false;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Salvar")){
			
			p.setCpf(j.getPainelAlta().getFieldAltaCPF().getText());
			p.setMotivoAlta(j.getPainelAlta().getBoxAltaMotivo().getSelectedItem().toString());
			
			if (listaExcecoes()) {
                return;
			}
			
			try {
				pacdao.retornaPacienteAlta(p);
				j.getPainelAlta().cancelarAlta();
				//pacdao.apagaPaciente(p);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getActionCommand().equals("Cancelar")) {
			j.getPainelAlta().cancelarAlta();
			j.inicio();
		}
	}
	
}