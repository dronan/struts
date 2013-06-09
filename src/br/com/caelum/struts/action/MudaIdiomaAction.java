package br.com.caelum.struts.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class MudaIdiomaAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String idioma = request.getParameter("idioma");
		Locale locale = new Locale(idioma);
		System.out.println("mudando o locale para " + locale);
		setLocale(request, locale);

		return mapping.findForward("ok");
	}
}
