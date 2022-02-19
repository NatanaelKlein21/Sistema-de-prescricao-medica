package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Paciente;
import visao.JanelaPrincipal;

public class DAOPaciente {
	
	private File arq;
	private FileWriter fw;
	private BufferedWriter bw;
	private File arq2;
	private FileReader fr;
	private BufferedReader br;
	private JanelaPrincipal j;
	
	public DAOPaciente() throws IOException{
		
		
		arq = new File("lista-paciente.txt");
		arq.createNewFile();
		arq2 = new File("alta.txt");
		
	}
	
	public boolean cadastraPaciente(Paciente p) throws IOException {
		
		try {
			fw = new FileWriter(arq, true);
			bw = new BufferedWriter(fw);
			
			bw.write(p.printLista());
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
	
	
	
	public Paciente[] retornaPacienteAlta(Paciente p) throws IOException {
		Paciente[] lista = new Paciente[10];
		
		int flag=0;
		int capacidade = 10;
		int indice = 0;
		fr = new FileReader(arq);
		br = new BufferedReader(fr);
		String linha = br.readLine();
		while (linha != null) {
			if(indice>=capacidade)
				break;
			String[] campos = linha.split(";");
			lista[indice]=new Paciente();
			if(campos[0].equals(p.getCpf()))
			{
				fw = new FileWriter(arq2, true);
				bw= new BufferedWriter(fw);
				bw.write(p.printAlta());
				bw.newLine();
				bw.flush();
				
				fw.close();
				bw.close();
				indice++;
				flag=1;
			}
		
		linha = br.readLine();
		}
		br.close();
		fr.close();
		if (flag==1) {
			System.out.println("paciente encontrado. Alta cadastrada com sucesso");
		}else if(flag==0){
			System.out.println("paciente invalido");
		}
		return null;
	}
	

}
				
		  // substituir true por false


	
	
	//public boolean cadastraAlta(Paciente P) {
		

	

