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
    
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void init() throws ServletException {
	
	this.usuariosAgrupadosComSenhas = new HashMap<String, String>();
	this.usuariosAgrupadosComSenhas.put("qwe@123", "123");
	this.usuariosAgrupadosComSenhas.put("rty@456", "456");
	
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
	super.destroy();
    }
    
    
}
