package app.bokubake.sample;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.bokubake.sample.bean.TestHelloDTO;
import app.bokubake.sample.logic.SampleLogic;


/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SampleLogic logic = new SampleLogic();
		try {
			logic.execute(request);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException("DB select error..");
		}

		List<TestHelloDTO> list = (List<TestHelloDTO>) request.getAttribute(SampleConst.SAMPLE_ATTRIBUTE_TITLE_LIST);
		/*
		for (TestHelloDTO dto : list) {
			System.out.println("title[" + dto.getTitle() + "], id[" + dto.getId() + "]");
		}*/

		String disp = "/view/hello.jsp";
		RequestDispatcher dispatch = request.getRequestDispatcher(disp);

		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
