package servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Produto;


/**
 * Servlet implementation class FinalizacaoServlet
 */
@WebServlet("/FinalizacaoServlet")
public class FinalizacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalizacaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bandeira = request.getParameter("bandeira");
		String numero = request.getParameter("numero");
		String nome = request.getParameter("nome");
		String validade = request.getParameter("validade");
		String digitosSeguranca = request.getParameter("digitosSeguranca");
		
		int ano = Integer.parseInt(validade.split("-")[0]);
		int mes = Integer.parseInt(validade.split("-")[1]);
		Calendar calendar = Calendar.getInstance(); //data atual calendar.getTime()
		Date dataAgora = calendar.getTime();
		calendar.set(Calendar.YEAR, ano);
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		Date dataValidade = calendar.getTime();
		
		boolean deferido = true;
		String mensagem = "";
		
		if(bandeira == null){ //validando se bandeira foi escolhida
			deferido = false;
			mensagem+="Bandeira n�o selecionada";
		}
		if(!numero.matches("[0-9]*")){ //validando se n�mero � realmente n�mero
			deferido = false;
			mensagem+="\nO n�mero do cart�o deve conter apenas n�meros";
		}
		if(dataAgora.after(dataValidade)){//validando se o cart�o est� na validade
			deferido = false;
			mensagem+="\nO cart�o est� fora da validade";
		}
		if(!digitosSeguranca.matches("[0-9]*")){//validando se os d�gitos de seguran�a s�o n�meros
			deferido = false;
			mensagem+="\nOs d�gitos do cart�o devem ser n�meros";
		}
		
		Produto produtoComprado = (Produto) request.getSession().getAttribute("produtoComprado");
		
		request.setAttribute("compraDeferida", deferido);
		request.setAttribute("erros", mensagem);
		request.setAttribute("produtoComprado", produtoComprado);
    	request.getRequestDispatcher("finalizacao.jsp").forward(request,response);
	}

}
