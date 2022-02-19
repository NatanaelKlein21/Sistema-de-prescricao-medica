package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Paciente;
import visao.JanelaPrincipal;
import modelo.Medicamento;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DAOPresc {
	
	private File arq;
	private FileWriter fw;
	private BufferedWriter bw;
	private File arq2;
	private FileReader fr;
	private BufferedReader br;
	private File arq3;
	
	public DAOPresc() throws IOException{
		
		
		arq = new File("lista-paciente.txt");
		arq2 = new File("medicamentos.txt");
		arq3 = new File("prescricao.txt");
		
		
	}
	
	public Paciente retornaPacienteCPF(Paciente p) throws IOException {
		
		fr = new FileReader(arq);
		br = new BufferedReader(fr);
		
		
		int capacidade = 10;
		int indice = 0;
		Paciente lista = new Paciente();
		
		String linha = br.readLine();
		while (linha != null) {
			if(indice>=capacidade)
				break;
			String[] campos = linha.split(";");
			if(campos[0].equals(p.getCpf())){
				lista = new Paciente(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5],campos[6],campos[7]);
				return lista;
			}
			indice++;
			linha = br.readLine();
		}
		return null;
		
	}
	
	
	
	public Medicamento retornaMedicamentoInfo(Medicamento m) throws IOException {
		
		fr = new FileReader(arq2);
		br = new BufferedReader(fr);
		
		
		int capacidade = 10;
		int indice = 0;
		Medicamento lista = new Medicamento();
		
		String linha = br.readLine();
		while (linha != null) {
			if(indice>=capacidade)
				break;
			String[] campos = linha.split(";");
			if(campos[0].equals(m.getCodigo())){
				lista = new Medicamento(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5]);
				return lista;
			}
			indice++;
			linha = br.readLine();
		}
		return null;
		
	}
	
	public boolean salvaPresc(String cpf, String cod) throws IOException {
		
		
		
		try {
			
			Date d = GregorianCalendar.getInstance().getTime();
			SimpleDateFormat format = new SimpleDateFormat();
			
			fw = new FileWriter(arq3, true);
			bw = new BufferedWriter(fw);
			
			bw.write(format.format(d));
			bw.write(";");
			bw.write(cpf);
			bw.write(";");
			bw.write(cod);
			bw.newLine();
			bw.flush();
			fw.close();
			bw.close();
			
			return true;
		}
		catch(IOException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			if(fw != null)
				fw.close();
			if(bw != null)
				bw.close();
		}
		
		
	}
	
	
}