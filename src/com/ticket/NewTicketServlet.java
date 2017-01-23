package com.ticket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewTicketServlet
 */
public class NewTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewTicketServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		PrintWriter out = response.getWriter();
		String country = request.getParameter("Country");
		String city = request.getParameter("City");
		String doj = request.getParameter("doj");
		String returndate = request.getParameter("return");
		String gender = request.getParameter("gender");
		String passportNo = request.getParameter("passportNo");
		String expirydate = request.getParameter("Expirydate");
		String trip = request.getParameter("trip");
		String email = request.getParameter("email");
		/*
		 * out.println("exp:"+expirydate+"doj"+doj);
		 * out.println("gender:"+gender+" "+trip);
		 */
		Ticket1 ticket = new Ticket1();
		String[] w2;
		if (trip == "RoundTrip") {
			w2 = returndate.split("-");
			ticket.setReturndate(returndate);
		} else {
			w2 = doj.split("-");
			ticket.setReturndate("not available");

		}
		String[] w1 = expirydate.split("-");

		int i = 0;
		boolean valid;
		int year1 = Integer.parseInt(w1[0]);
		int year2 = Integer.parseInt(w2[0]);
		int mon1 = Integer.parseInt(w1[1]);
		int mon2 = Integer.parseInt(w2[1]);
		int day1 = Integer.parseInt(w1[2]);
		int day2 = Integer.parseInt(w2[2]);
		if (year1 > year2) {
			valid = true;
		} else if (year1 == year2) {
			if (mon1 > mon2) {
				valid = true;
			} else if (mon1 == mon2) {
				if (day1 > day2) {
					valid = true;
				} else
					valid = false;
			} else
				valid = false;
		} else {
			valid = false;
		}

		if (valid == true) {

			ticket.setTicketNo(12);
			ticket.setCountry(country);
			ticket.setCity(city);
			ticket.setDoj(doj);
			ticket.setSeatNo(74);
			ticket.setCheckInCounter("SDN12");
			ticket.setGender(gender);
			ticket.setPassportNo(passportNo);
			ticket.setExpirydate(expirydate);
			ticket.setEmailId(email);
			ticket.setTrip(trip);
			ticket.setFlightNo("R036");

			request.setAttribute("t34", ticket);

			RequestDispatcher d1 = getServletContext().getRequestDispatcher(
					"/ticketFinal.jsp");
			d1.forward(request, response);
		}

		else {
			RequestDispatcher d2 = getServletContext().getRequestDispatcher(
					"/ticketError.html");
			d2.forward(request, response);
		}
		/*
		 * out.println(
		 * "Your PASSPORT will be Expired before you travel.....<br>Kindly update....<br><h2><i>Thank you ...!Visit Again!!!<i><h2>"
		 * ); out.println("<a href=ticket1.html>Book ticket</a>");}
		 */

	}
	

}
