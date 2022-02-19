package dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import modelo.Medicamento;

public class DAOMedicamento {
	
	private File arq;
	private FileWriter fw;
	private BufferedWriter bw;
	
	public DAOMedicamento(){
		
		arq = new File("medicamentos.txt");
		
	}
	
	public boolean cadastraMedicamento(Medicamento m) throws IOException {
		
		try {
			fw = new FileWriter(arq, true);
			bw = new BufferedWriter(fw);
			
			bw.write(m.toString());
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
