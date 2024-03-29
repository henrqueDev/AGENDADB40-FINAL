package modelo;

import java.util.ArrayList;
import java.util.List;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programa��o Orientada a Objetos
 * Prof. Fausto Maranh�o Ayres
 **********************************/

public class Participante {
	private String nome; 
	private String email;
	private List <Reuniao> reunioes = new ArrayList <> ();

	public Participante(String nome, String email) 	{
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public List<Reuniao> getReunioes() 	{
		return reunioes;
	}

	public void adicionar(Reuniao r)	{
		reunioes.add(r);
	}

	public void remover(Reuniao r)	{
		reunioes.remove(r);
	}


	public int getTotalReunioes() 	{
		return reunioes.size();
	}

	@Override
	public String toString() 	{
		String texto = "Nome: " + nome + ", email: " + email + ", Reuni�es: ";
		
		if (reunioes.isEmpty())
			texto += " sem reuni�o";
		else 	
			for(Reuniao r : reunioes) {	
				if(r!=null) {
				texto += " " + r.getId();
				}
			}
		return texto;
	}
}

