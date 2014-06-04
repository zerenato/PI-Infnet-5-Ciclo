package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.GerenciadorProduto;
import classes.Produto;

/**
 * Servlet implementation class BuscaServlet
 */
@WebServlet("/BuscaServlet")
public class BuscaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, String[]> parametros = request.getParameterMap();
		GerenciadorProduto gp = new GerenciadorProduto();
    	ArrayList<Produto> produtos = new ArrayList<Produto>();
    	String nome = null;
    	
		if(parametros.containsKey("nome") && !request.getParameter("nome").isEmpty())
			nome = request.getParameter("nome");
		
		
//		busca por nome e categoria e estado
		if ((nome != null) && (parametros.containsKey("categoria")) && (parametros.containsKey("estado"))){
			produtos = gp.buscaNomeCategoriaEstado(nome, request.getParameter("categoria"), request.getParameter("estado"));			
//			nome e categoria
		}else if ((nome != null) && (parametros.containsKey("categoria"))){
			produtos = gp.buscaNomeCategoria(nome, request.getParameter("categoria"));
//			nome e estado
		}else if ((nome != null) && (parametros.containsKey("estado"))){
			produtos = gp.buscaNomeEstado(nome, request.getParameter("estado"));
//			categoria e estado
		}else if ((parametros.containsKey("categoria")) && (parametros.containsKey("estado"))){
			produtos = gp.buscaCategoriaEstado((request.getParameter("categoria")), (request.getParameter("estado")));
//			nome
		}else if (nome != null){
			produtos = gp.buscaNome(nome);
//			categoria
		}else if (parametros.containsKey("categoria")){
			produtos = gp.buscaCategoria(request.getParameter("categoria"));
//			estado 
		}else if (parametros.containsKey("estado")){
			produtos = gp.buscaEstado(request.getParameter("estado"));
		}
		
		request.setAttribute("produtos", produtos);
    	request.getRequestDispatcher("busca.jsp").forward(request,response);	
	}	
}
