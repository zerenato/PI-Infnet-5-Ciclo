package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.GerenciadorProduto;
import classes.Produto;

/**
 * Servlet implementation class DetalheServlet
 */
@WebServlet("/DetalheServlet")
public class DetalheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetalheServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id = null;
		if (request.getParameter("id").matches("[0-9]*"))
			id = Integer.parseInt(request.getParameter("id"));
		GerenciadorProduto gp = new GerenciadorProduto();
		Produto produto = new Produto();
    	boolean achou = false;
    	int i = 0;
    	while(!achou && i < gp.getProdutos().size() && id!=null){
    		if (gp.getProdutos().get(i).getId() == id){
    			achou=true;
    			produto = gp.getProdutos().get(i);
    		}else{
    			i++;
    		}
    	}
    	request.setAttribute("produtoEncontrado", achou);
    	request.setAttribute("produto", produto);
    	request.getRequestDispatcher("detalhe.jsp").forward(request,response);
	}
}
