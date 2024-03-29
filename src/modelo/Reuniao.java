package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programa��o Orientada a Objetos
 * Prof. Fausto Maranh�o Ayres
 **********************************/

public class Reuniao {
	private int id; 		// ser� autoincrementado dentro do  metodo create() no DAOreuniao 
	private String datahora;
	private String assunto;
	private List <Participante> participantes = new ArrayList <Participante>();

	public Reuniao(LocalDateTime datahora, String assunto) 	{
		this.datahora = datahora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		this.assunto = assunto;
	}

	public void adicionar(Participante p)	{
		this.participantes.add(p);
	}

	public void remover(Participante p)	{
		this.participantes.remove(p);
	}

	public Participante localizarParticipante(String nome)	{
		for(Participante p: participantes)	{
			if(p.getNome().equals(nome))
				return p;
		}
		return null;
	}

	public List<Participante> getParticipantes() 	{
		return participantes;
	}

	public void setParticipantes(List<Participante> participantes) 	{
		this.participantes = participantes;
	}

	public int getTotalParticipantes()	{
		return participantes.size();
	}

	public int getId() 	{
		return id;
	}

	public void setId(int id) 	{
		this.id = id;
	}

	public LocalDateTime getDatahora() 	{
		
		return LocalDateTime.parse(this.datahora, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}

	public void setDatahora(LocalDateTime dth) 	{
		this.datahora = dth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}

	public String getAssunto() 	{
		return assunto;
	}

	public void setAssunto(String assunto) 	{
		this.assunto = assunto;
	}

	@Override
	public String toString() 	{
		String texto = "id: " + id + ", Hor�rio: " + datahora + ", Assunto: " + assunto;

		texto +=  "\n Participantes:";
		for(Participante p: participantes) {
			if(p != null) {
			texto += " " + p.getNome();
			}}
		return texto ;
		
	}
}





