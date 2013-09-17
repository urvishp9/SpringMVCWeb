package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("serial")
@WebServlet(
        name = "Servlet", 
        urlPatterns = {"/controller"}
    )
public class DefaultController extends HttpServlet {
    protected final Log logger = LogFactory.getLog(getClass());
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	handleRequest(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	handleRequest(req, resp);
    }
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
        return new ModelAndView("/WEB_INF/jsp/hello.jsp", "now", now);
    }
}

