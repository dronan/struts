package br.com.caelum.struts.form;

import org.apache.struts.action.ActionForm;

import br.com.caelum.struts.bean.Contato;

@SuppressWarnings("serial")
public class RemoveContatoForm extends ActionForm {
	private Contato contato = new Contato();

	public Contato getContato() {
		return contato;
	}

}
