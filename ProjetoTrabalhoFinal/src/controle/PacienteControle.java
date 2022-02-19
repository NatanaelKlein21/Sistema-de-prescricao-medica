package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import dao.DAOLista;
import dao.DAOPaciente;
import modelo.Paciente;
import visao.JanelaPrincipal;



public class PacienteControle implements ActionListener  {
	
	private Paciente p;
	private JanelaPrincipal j;
	private DAOPaciente pacdao;
	private DAOLista lisdao;
	
	public PacienteControle (Paciente p, JanelaPrincipal j) throws IOException {
		
		this.p=p;
		this.j=j;
		lisdao= new DAOLista();
		pacdao = new DAOPaciente();
		this.j.getPaineladm().getBtnAdmiCancelar().addActionListener(this);
		this.j.getPaineladm().getBtnAdmiSalvar().addActionListener(this);
		
		
	}
public boolean listaExcecoes() {
		
		if (j.getPaineladm().getFieldAdmiCPF().getText().isEmpty())
		{
			System.out.println("Campo CPF obrigatório");
			return true;
		}
			else if (!Paciente.isCPF(p.getCpf())) 
			{
				System.out.println("CPF Inválido");
				return true;
			}
		if(j.getPaineladm().getFieldAdmiNome().getText().isEmpty()) 
		{
			System.out.println("Campo NOME obrigatório");
			return true;
		} 
			else if (Paciente.isAlfanumerico(p.getNome())) 
			{
				System.out.println("Apenas caracteres alfanuméricos no campos NOME");
				return true;
			}
			else if (j.getPaineladm().getFieldAdmiNome().getText().length() < 2)
			{
				System.out.println("Mínimo 2 caracteres no campo NOME");
				return true;
			}
			else if(j.getPaineladm().getFieldAdmiNome().getText().length() > 50)
			{
				System.out.println("Máximo 50 caracteres no campo NOME");
				return true;
			}
		if (j.getPaineladm().getFieldAdmiDataNasc().getText().isEmpty()) 
		{
			System.out.println("Campo DATA DE NASCIMENTO obrigatório");
			return true;
		}
			else if (!Paciente.isData(p.getDatanasc())) 
			{
				System.out.println("Formato DATA DE NASCIMENTO incorreta [dd/mm/aaaa]");
				return true;
			}
		if(j.getPaineladm().getBoxAdmiUnidade().getSelectedItem() == "") 
		{
		System.out.println("Campo UNIDADE obrigatório");
		return true;
		}
		
		return false;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		//////////////////////////////////CANCELAR////////////////////////////////
		
			if(e.getActionCommand().equals("Cancelar")) {
				
				j.getPaineladm().cancelarAdmi();
				j.inicio();
				
			}
		
		
	//////////////////////////////////////SALVAR/////////////////////////////////////
		
		//j.getPaineladm().getBtnAdmiSalvar().addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
				/////////////////////////SALVANDO PAINEL DE ADMISSAO////////////////////
		
		if(e.getActionCommand().equals("Salvar")){
				
				p.setCpf(j.getPaineladm().getFieldAdmiCPF().getText().toString());
				p.setDatanasc(j.getPaineladm().getFieldAdmiDataNasc().getText().toString());
				p.setNome(j.getPaineladm().getFieldAdmiNome().getText());
				p.setUnidade(j.getPaineladm().getBoxAdmiUnidade().getSelectedItem().toString());
				p.setFrutosdoMar(j.getPaineladm().getChckbxAdmiFrutosdoMar().isSelected());
				p.setDipirona(j.getPaineladm().getChckbxAdmiDipirona().isSelected());
				p.setGluten(j.getPaineladm().getChckbxAdmiGluten().isSelected());
				p.setPenicilina(j.getPaineladm().getChckbxAdmiPenicilina().isSelected());
				
				if (listaExcecoes()) {
	                return;
				}
				
				try {
					if(pacdao.cadastraPaciente(p))
					{
						System.out.println("paciente cadastrado com sucesso");
					}
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		}
	}
}		
