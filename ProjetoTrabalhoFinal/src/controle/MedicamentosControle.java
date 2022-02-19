package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import dao.DAOMedicamento;
import modelo.Medicamento;
import visao.JanelaPrincipal;

public class MedicamentosControle implements ActionListener {

	private Medicamento m;
	private JanelaPrincipal j;
	private DAOMedicamento meddao;
	
	public MedicamentosControle(Medicamento m, JanelaPrincipal j)throws IOException {
		
		this.m=m;
		this.j=j;
		meddao = new DAOMedicamento();
		this.j.getPainelMed().getBtnMedCancelar().addActionListener(this);
		this.j.getPainelMed().getBtnMedSalvar().addActionListener(this);

		
	}
	
	public boolean mediVazio() {
		
		if (j.getPaineladm().getFieldAdmiNome().getText().isEmpty()||
			j.getPaineladm().getFieldAdmiCPF().getText().isEmpty()||
			j.getPaineladm().getFieldAdmiDataNasc().getText().isEmpty()||
			j.getPaineladm().getBoxAdmiUnidade().getSelectedItem().toString().isEmpty()
			) {
			
			return true;
		}
		return false;
	}
	
	public boolean listaExcecoes() {
		if (j.getPainelMed().getFieldMedCod().getText().isEmpty())
		{
			System.out.println("Campo CODIGO DE BARRA obrigatório");
			return true;
		}
			else if (j.getPainelMed().getFieldMedCod().getText().length() > 20)
			{
				System.out.println("Máximo 20 caracteres no campo CODIGO DE BARRA");
				return true;
			}
			
		if(j.getPainelMed().getFieldMedNome().getText().isEmpty())
		{
			System.out.println("Campo NOME obrigatório");
			return true;
		}
			else if (j.getPainelMed().getFieldMedNome().getText().length() > 50)
			{
				System.out.println("Máximo 50 caracteres no campo NOME");
				return true;
			}
			else if (j.getPainelMed().getFieldMedNome().getText().length() < 5)
			{
				System.out.println("Mínimo 5 caracteres no campo NOME");
				return true;
			}
			else if (Medicamento.isAlfanumerico(m.getNomeMED()))
			{
				System.out.println("Apenas caracteres alfanuméricos no campo NOME");
				return true;
			}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		///////////////////////////////CANCELAR////////////////////////////////////
		if(e.getActionCommand().equals("Cancelar")) {
				j.getPainelMed().cancelarMed();
				j.inicio();
			}
		
		////////////////////////////////////SALVAR////////////////////////////////////////
		if(e.getActionCommand().equals("Salvar")){

			m.setCodigo(j.getPainelMed().getFieldMedCod().getText());
			m.setNomeMED(j.getPainelMed().getFieldMedNome().getText());
			m.setGluten(j.getPainelMed().getChckbxMedGluten().isSelected());
			m.setFrutosdomar(j.getPainelMed().getChckbxMedFrutosdoMar().isSelected());
			m.setPenicilina(j.getPainelMed().getChckbxMedPenicilina().isSelected());
			m.setDipirona(j.getPainelMed().getChckbxMedDipirona().isSelected());
			
			if (listaExcecoes()) {
                return;
			}
				
				try {
					if(meddao.cadastraMedicamento(m))
					{
					System.out.println("medicamento cadastrado com sucesso");
					j.getPainelMed().cancelarMed();
					
					}else if (!meddao.cadastraMedicamento(m)) {
					System.out.println("erro ao cadastrar");
					}
					
				} catch (IOException e1) {
				// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}
	
}
