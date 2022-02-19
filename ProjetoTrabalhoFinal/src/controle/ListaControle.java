package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import dao.DAOLista;
import visao.JanelaPrincipal;
import modelo.Paciente;

public class ListaControle implements ActionListener {
	
	private Paciente p;
	private JanelaPrincipal j;
	private DAOLista lisdao;
	
	public ListaControle (Paciente p, JanelaPrincipal j) throws IOException {
		
		this.p=p;
		this.j=j;
		lisdao= new DAOLista();
		this.j.getPainelLista().getBtnListaCancelar().addActionListener(this);
		this.j.getMenuListaInternados().addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		//////////////////////////////////CANCELAR////////////////////////////////
		
			if(e.getActionCommand().equals("Cancelar")) {
				j.getPainelLista().cancelarLista();
				j.inicio();
				
			}
			
			if(e.getActionCommand().equals("Lista de Internados")){
				
					try {
						j.getPainelLista().cancelarLista();
						Paciente[] pacientes = lisdao.completaLista();
						for(int i=0; i<pacientes.length; i++) {
							if(pacientes[i]!=null) {
								j.getPainelLista().getTextAreaNome().append(pacientes[i].getNome()+"\n"+"\n");
								j.getPainelLista().getTextAreaUnidade().append(pacientes[i].getUnidade()+"\n"+"\n");
								j.getPainelLista().getTextAreaDataNasc().append(pacientes[i].getDatanasc()+"\n"+"\n");
								if(pacientes[i].getGlut().equals("S")) {
									j.getPainelLista().getTextAreaAlergias().append("Gluten, ");
								}
								if(pacientes[i].getFrut().equals("S")) {
									j.getPainelLista().getTextAreaAlergias().append("Frutos do Mar, ");
								}
								
								if(pacientes[i].getPeni().equals("S")) {
									j.getPainelLista().getTextAreaAlergias().append("Penicilina, ");
								}
								if(pacientes[i].getDipi().equals("S")) {
									j.getPainelLista().getTextAreaAlergias().append("Dipirona, ");
								}
								j.getPainelLista().getTextAreaAlergias().append("\n\n");
								
							}
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				
			}
			
	}
}
