package es.fpm.sii.servlet;

import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import es.fpm.sii.core.LauncherInformaEmitidas;

/**
 * Servlet implementation class InvocaSIIemitidas
 */
@WebServlet("/InvocaSIIemitidas")
public class InvocaSIIemitidas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvocaSIIemitidas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    Part filePart = request.getPart("fileupload"); // Retrieves <input type="file" name="fileupload">
	    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
	   	String result = lanzaInformaEmitidas (filePart);
		response.getWriter().append("Served at: ").append(request.getContextPath())
		.append(" file procesed = ").append(fileName).append( " result ").append(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private String lanzaInformaEmitidas (Part filePart){
		String result;
		LauncherInformaEmitidas launcher = new LauncherInformaEmitidas();
		
		result = launcher.informaEmitidas(filePart);
				
		return result;
	}
	
}
