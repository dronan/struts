package br.com.caelum.teste;

import java.util.Calendar;

import br.com.caelum.struts.bean.Contato;
import br.com.caelum.struts.dao.ContatoDAO;

public class TesteInsere {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEndereco("Rua Sborbous");
		contato.setEmail("bla@bla.com.br");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(contato);
		System.out.println("Gravado!");
	}

}
