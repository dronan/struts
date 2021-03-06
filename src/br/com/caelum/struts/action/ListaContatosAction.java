package br.com.caelum.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.caelum.struts.bean.Contato;
import br.com.caelum.struts.dao.ContatoDAO;

public class ListaContatosAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		List<Contato> lista = new ContatoDAO().getLista();
		request.setAttribute("contatos", lista);
		
		if (lista.isEmpty()) {
			return mapping.findForward("vazia");
		} else {
			return mapping.findForward("lista");
		}
		
	}
}
