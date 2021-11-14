package servelets;
//
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;
/********abaixo do tomcat 10   usa o javax*********/


//as serveletes tambem são os controllers
@WebServlet("/serveletLogin")  /*mapeia a url que vem da tela-*/
public class ServeletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ServeletLogin() {
        // TODO Auto-generated constructor stub
    }

	/**recebe dados da tela por parametros*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
     /**recebe dados da tela por formularios*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String nome = request.getParameter("nome");
	  String senha = request.getParameter("senha");
	  
	  System.out.println(nome);
	  System.out.println(senha);
	  
	  ModelLogin user =  new ModelLogin();
	  user.setNome(nome);
	  user.setSenha(senha);
	  
	}

}
