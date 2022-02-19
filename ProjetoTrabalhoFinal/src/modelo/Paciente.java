package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;

public class Paciente {

	private String nome;
	private String cpf;
	private String unidade;
	private String datanasc;
	private boolean gluten;
	private boolean frutosdoMar;
	private boolean dipirona;
	private boolean penicilina;
	private String motivoAlta;
	private String glut;
	private String frut;
	private String dipi;
	private String peni;
	
	
	
	public Paciente(String nome, String cpf, String unidade, String datanasc, boolean gluten, boolean frutosdoMar,
			boolean dipirona, boolean penicilina, String motivoAlta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.unidade = unidade;
		this.datanasc = datanasc;
		this.gluten = gluten;
		this.frutosdoMar = frutosdoMar;
		this.dipirona = dipirona;
		this.penicilina = penicilina;
		this.motivoAlta = motivoAlta;
	}
	
	public Paciente(String cpf, String nome, String unidade, String datanasc, String gluten, String frutosdoMar, String dipirona, String penicilina) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.unidade = unidade;
		this.datanasc = datanasc;
		this.glut=gluten;
		this.frut=frutosdoMar;
		this.dipi=dipirona;
		this.peni=penicilina;
		
	}
	
	public Paciente() {
		
	}
	
	public Paciente(String cpf) {
		super();
		this.cpf=cpf;
	}
	
	
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getUnidade() {
		return unidade;
	}



	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}



	public String getDatanasc() {
		return datanasc;
	}



	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}



	public boolean isGluten() {
		return gluten;
	}



	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}



	public boolean isFrutosdoMar() {
		return frutosdoMar;
	}



	public void setFrutosdoMar(boolean frutosdoMar) {
		this.frutosdoMar = frutosdoMar;
	}



	public boolean isDipirona() {
		return dipirona;
	}



	public void setDipirona(boolean dipirona) {
		this.dipirona = dipirona;
	}



	public boolean isPenicilina() {
		return penicilina;
	}



	public void setPenicilina(boolean penicilina) {
		this.penicilina = penicilina;
	}


	public String getMotivoAlta() {
		return motivoAlta;
	}



	public void setMotivoAlta(String motivoAlta) {
		this.motivoAlta = motivoAlta;
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
	

	public static boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }
	
	  public static boolean isData(String date) {
          try {
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             LocalDate d = LocalDate.parse(date, formatter);
             return true;
          } catch (DateTimeParseException e) {
            return false;
          }
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
	
	  public String printLista() {
		
		  if(gluten) {
			  glut="S";
		  }else {
			  glut = "N";
		  }
		
		  if(frutosdoMar) {
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
		
		  return cpf+";"+
				nome+";"+
				unidade+";"+
				datanasc+";"+
				glut+";"+
				frut+";"+
				dipi+";"+
				peni;	
	  }
	  
	  public String printAlta() {
		  
		  return cpf+";"+
				  motivoAlta;
	  }

	  
	
	
	
	
	
	
}
