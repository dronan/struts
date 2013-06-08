package br.com.caelum.teste;

import java.util.List;

import br.com.caelum.struts.bean.Contato;
import br.com.caelum.struts.dao.ContatoDAO;

public class TestaPesquisa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContatoDAO dao = new ContatoDAO();
		List<Contato> lista = dao.pesquisar(2);
		for (Contato contato : lista) {
			System.out.println("Id:"+contato.getId());
			System.out.println("Nome:"+contato.getNome());
		}

	}

}
