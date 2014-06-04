package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AutenticacaoFilter implements Filter {

    private String loginUrl = null;
    private String loginPath = null;
    
    @Override
    public void init(FilterConfig config) throws ServletException {
	
	this.loginUrl = config.getServletContext().getInitParameter("loginUrl");
	this.loginPath = config.getServletContext().getInitParameter("loginPath");
    }
    
    @Override
    public void destroy() {
	
	this.loginUrl = null;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
	    throws IOException, ServletException {
	
	String caminhoAplicacao = ((HttpServletRequest) request).getServletPath();
	
	//é uma solicitação de login
	if (this.loginUrl.equals(caminhoAplicacao) || this.loginPath.equals(caminhoAplicacao)) {
	    chain.doFilter(request, response);
	}
	
	else {
	    HttpSession session = ((HttpServletRequest)request).getSession();
		String usuarioLogado = (String) session.getAttribute("login");
	    
	    if (usuarioLogado == null) {
		((HttpServletResponse)response).sendRedirect("../login.html");
	    }
	    
	    else {
		    chain.doFilter(request, response);
	    }
	}
    }
}
