package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    private Map<String, String> usuariosAgrupadosComSenhas = null;
    private Map<String, String> usuariosAgrupadosComPermissao = null;

    /**
     * {@inheritDoc}
     */
    @Override
    public void init() throws ServletException {
	
	this.usuariosAgrupadosComSenhas = new HashMap<String, String>();
	this.usuariosAgrupadosComSenhas.put("ze@ze", "renato");
	this.usuariosAgrupadosComSenhas.put("renato@renato", "ze");
	
	this.usuariosAgrupadosComPermissao = new HashMap<String, String>();
	this.usuariosAgrupadosComPermissao.put("ze@ze", "admin");
	this.usuariosAgrupadosComPermissao.put("renato@renato", "visitante");
	
	super.init();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	final String loginInformado = request.getParameter("login");
	final String senhaInformada = request.getParameter("senha");
	final String caminhoAplicacao = request.getSession().getAttribute("caminhoAplicacao").toString();
	
	final String senha = this.usuariosAgrupadosComSenhas.get(loginInformado);
	
	if (senha != null && senha.equals(senhaInformada)) {
	    
	    request.getSession().setAttribute("login", loginInformado);
	    request.getSession().setAttribute("papel", this.usuariosAgrupadosComPermissao.get(loginInformado));
	    response.sendRedirect(caminhoAplicacao.replaceFirst("/", ""));
	}
	else
	{
	    response.sendRedirect("login.jsp?error=true");
	}
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void destroy() {
	
	this.usuariosAgrupadosComSenhas = null;
	this.usuariosAgrupadosComPermissao = null;
	super.destroy();
    }
    
    
}
