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
import es.fpm.sii.core.LauncherInformaRecibidas;

/**
 * Servlet implementation class InvocaSIIemitidas
 */
@WebServlet("/InvocaSIIrecibidas")
public class InvocaSIIrecibidas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvocaSIIrecibidas() {
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
	   	String result = lanzaInformaRecibidas (filePart);
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

	private String lanzaInformaRecibidas (Part filePart){
		String result;
		LauncherInformaRecibidas launcher = new LauncherInformaRecibidas();
		
		result = launcher.informaRecibidas(filePart);
				
		return result;
	}
	
}
