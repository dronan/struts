package br.com.caelum.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import br.com.caelum.struts.bean.Contato;

public class ContatoForm extends ActionForm {
	private Contato contato = new Contato();

	public Contato getContato() {
		return contato;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors erros = new ActionErrors();

		if (contato.getNome() == null || contato.getNome().equals("")) {
			erros.add("nome", new ActionMessage("erro.campoNome"));
		}

		if (contato.getEmail() == null || contato.getEmail().equals("")) {
			erros.add("email", new ActionMessage("erro.campoEmail"));
		}

		if (contato.getEndereco() == null || contato.getEndereco().equals("")) {
			erros.add("endereco", new ActionMessage("erro.campoEndereco"));
		}

		return erros;
	}
}
