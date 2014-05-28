package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.GerenciadorProduto;
import classes.Produto;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    	GerenciadorProduto gp = new GerenciadorProduto();
    	ArrayList<Produto> produtos = new ArrayList<Produto>();
    	for (Produto p : gp.getProdutos()) {
			if (p.isDestaque())
				produtos.add(p);
		}
    	request.setAttribute("produtos", produtos);
    	request.getRequestDispatcher("index.jsp").forward(request,response);
    }

}
