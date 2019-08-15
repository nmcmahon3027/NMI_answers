package com.webapp;

import com.webapp.model.ProjectService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
		name = "selectprojectservlet",
		urlPatterns = "/SelectProject"

)

public class SelectProjectServlet extends HttpServlet {
	//@Override
	protected void doPost(HttpServlet req, HttpServletResponse resp) throws ServletException, IOException{

		String projectType = req.getInitParameter("Type");

		ProjectService projectService = new ProjectService();
		ProjectType p = ProjectType.valueOf(projectType);

		List projectGame = projectService.getAvailableGames(p);



		((ServletRequest) req).setAttribute("games", projectGame);
		((ServletRequest) resp).getAttribute("result.jsp");

		//req.doPut("games", projectGame);
		RequestDispatcher view = ((ServletRequest) req).getRequestDispatcher("result.jsp");

		view.forward((ServletRequest) req, resp);

	}

}
