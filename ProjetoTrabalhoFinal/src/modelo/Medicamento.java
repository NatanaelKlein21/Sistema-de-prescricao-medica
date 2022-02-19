package modelo;

public class Medicamento {

	private String codigo;
	private String nomeMED;
	private boolean gluten;
	private boolean frutosdomar;
	private boolean penicilina;
	private boolean dipirona;
	private String glut;
	private String frut;
	private String dipi;
	private String peni;
	
	
	public Medicamento(String codigo, String nomeMED, boolean gluten, boolean frutosdomar, boolean penicilina,
			boolean dipirona) {
		super();
		this.codigo = codigo;
		this.nomeMED = nomeMED;
		this.gluten = gluten;
		this.frutosdomar = frutosdomar;
		this.penicilina = penicilina;
		this.dipirona = dipirona;
	}
	
	public Medicamento() {
		
	}
	
	public Medicamento(String codigo, String nomeMED, String glut, String frut, String peni, String dipi) {
		super();
		this.codigo = codigo;
		this.nomeMED = nomeMED;
		this.glut = glut;
		this.frut = frut;
		this.peni = peni;
		this.dipi = dipi;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNomeMED() {
		return nomeMED;
	}


	public void setNomeMED(String nomeMED) {
		this.nomeMED = nomeMED;
	}


	public boolean isGluten() {
		return gluten;
	}


	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}


	public boolean isFrutosdomar() {
		return frutosdomar;
	}


	public void setFrutosdomar(boolean frutosdomar) {
		this.frutosdomar = frutosdomar;
	}


	public boolean isPenicilina() {
		return penicilina;
	}


	public void setPenicilina(boolean penicilina) {
		this.penicilina = penicilina;
	}


	public boolean isDipirona() {
		return dipirona;
	}


	public void setDipirona(boolean dipirona) {
		this.dipirona = dipirona;
	}
	
	
	
	
public String getGlut() {
		return glut;
	}

	public void setGlut(String glut) {
		this.glut = glut;
	}

	public String getFrut() {
		return frut;
	}

	public void setFrut(String frut) {
		this.frut = frut;
	}

	public String getDipi() {
		return dipi;
	}

	public void setDipi(String dipi) {
		this.dipi = dipi;
	}

	public String getPeni() {
		return peni;
	}

	public void setPeni(String peni) {
		this.peni = peni;
	}
	
	public static boolean isAlfanumerico(String placa){
		   boolean valido = true;
		   
		   if(!placa.substring(3).matches("[A-Z]*")){
		      valido = false;
		   }
		   if(!placa.substring(3).matches("[0-9]*")){
		      valido = false;
		   }
		   if(!placa.substring(3).matches("[a-z]*")){
			      valido = false;
			   }
		   return valido;
	}

public String toString() {
		
		if(gluten) {
			glut="S";
		}else {
			glut = "N";
		}
		
		if(frutosdomar) {
			frut="S";
		}else {
			frut = "N";
		}
		
		if(dipirona) { 
			dipi = "S";
		}else {
			dipi = "N";
		}
		
		if(penicilina) {
			peni = "S";
		}else {
			peni = "N";
		}
		
		return codigo+";"+
				nomeMED+";"+
				glut+";"+
				frut+";"+
				peni+";"+
				dipi;
		
		
	}
	
	
	
	
}
