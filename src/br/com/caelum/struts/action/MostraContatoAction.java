package br.com.caelum.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.caelum.struts.bean.Contato;
import br.com.caelum.struts.dao.ContatoDAO;
import br.com.caelum.struts.form.MostraContatoForm;

public class MostraContatoAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		MostraContatoForm formulario = (MostraContatoForm) form;
		
		Contato contato = formulario.getContato();
		
		Contato encontrado = new ContatoDAO().procura(contato.getId());
		
		request.setAttribute("contato", encontrado);
		
		return mapping.findForward("mostra");
	}
}
