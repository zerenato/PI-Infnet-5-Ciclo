package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.Enumerator;

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
			buscaNomeCategoriaEstado(nome, request.getParameter("categoria"), request.getParameter("estado"));			
//			nome e categoria
		}else if ((nome != null) && (parametros.containsKey("categoria"))){
			buscaNomeCategoria(nome, request.getParameter("categoria"));
//			nome e estado
		}else if ((nome != null) && (parametros.containsKey("estado"))){
			buscaNomeEstado(nome, request.getParameter("estado"));
//			categoria e estado
		}else if ((parametros.containsKey("categoria")) && (parametros.containsKey("estado"))){
			buscaCategoriaEstado((request.getParameter("categoria")), (request.getParameter("estado")));
//			nome
		}else if (nome != null){
			buscaNome(nome);
//			categoria
		}else if (parametros.containsKey("categoria")){
			buscaCategoria(request.getParameter("categoria"));
//			estado 
		}else if (parametros.containsKey("estado")){
			buscaEstado(request.getParameter("estado"));
		}
			
	}

	private void buscaEstado(String estado) {
		// TODO Auto-generated method stub
		
	}

	private void buscaCategoria(String categoria) {
		// TODO Auto-generated method stub
		
	}

	private void buscaNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	private void buscaCategoriaEstado(String categoria, String estado) {
		// TODO Auto-generated method stub
		
	}

	private void buscaNomeEstado(String nome, String estado) {
		// TODO Auto-generated method stub
		
	}

	private void buscaNomeCategoria(String nome, String categoria) {
		// TODO Auto-generated method stub
		
	}

	private void buscaNomeCategoriaEstado(String nome, String categoria,
			String estado) {
		// TODO Auto-generated method stub
		
	}
}
