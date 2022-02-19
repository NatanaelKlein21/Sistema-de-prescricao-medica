package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import modelo.Paciente;


public class DAOLista {
	
	private File arq;
	private FileReader fr;
	private BufferedReader br;
	
	
	public DAOLista() throws IOException{
		
		arq = new File("lista-paciente.txt");
		
	}
	
	public Paciente[] completaLista()throws IOException{
		
		fr = new FileReader(arq);
		br = new BufferedReader(fr);
		
		
		
		int capacidade = 10;
		int indice = 0;
		Paciente[] lista = new Paciente[capacidade];
		
		String linha = br.readLine();
		while (linha != null) {
			if(indice>=capacidade)
				break;
			String[] campos = linha.split(";");
			
			lista[indice] = new Paciente(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5],campos[6],campos[7]);
			indice++;
			linha = br.readLine();
		}
		br.close();
		fr.close();
		return lista;
		
	}
	
}
