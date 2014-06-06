package filters;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classes.Produto;

public class AutenticacaoFilter implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		String caminhoAplicacao = ((HttpServletRequest) request)
				.getServletPath();
		Map<String, String[]> MapParametros = ((HttpServletRequest) request)
				.getParameterMap();
		String metodo = ((HttpServletRequest) request).getMethod();
		HttpSession session = ((HttpServletRequest) request).getSession();

		String usuarioLogado = (String) session.getAttribute("login");
		Produto produtoComprado = (Produto) session
				.getAttribute("produtoComprado");

		if (produtoComprado == null && !caminhoAplicacao.contains("compra.do")) {
			((HttpServletResponse) response).sendRedirect("../index.jsp");
		} else if (usuarioLogado == null) {
			if (metodo.equalsIgnoreCase("get")) {
				String parametros = montarParametros(MapParametros);
				session.setAttribute("caminhoAplicacao", caminhoAplicacao + "?"
						+ parametros);
			} else {
				session.setAttribute("caminhoAplicacao", caminhoAplicacao);
			}
			((HttpServletResponse) response).sendRedirect("../login.jsp");
		} else {
			chain.doFilter(request, response);
		}
	}

	private String montarParametros(Map<String, String[]> mapParametros) {
		// TODO Auto-generated method stub
		String parametros = "";
		for (Map.Entry<String, String[]> parametro : mapParametros.entrySet()) {
			parametros += "&";
			String nome = parametro.getKey();
			String valores = "";
			for (String valor : parametro.getValue()) {
				valores += "," + valor;
			}
			parametros += nome + "=" + valores.replaceFirst(",", "");
		}
		return parametros.replaceFirst("&", "");
	}
}
