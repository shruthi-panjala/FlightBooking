package com.ticket;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TicketServlet
 */
public class TicketServlet extends HttpServlet {
	HashMap<Integer,Ticket> flight=new HashMap<Integer,Ticket>();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TicketServlet() {
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
		PrintWriter out1=response.getWriter();
	}

	/**
	 * @param RequestDispatcher 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response, RequestDispatcher RequestDispatcher) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		String country = request.getParameter("Country");
		String city = request.getParameter("City");
		String doj = request.getParameter("doj");
		String gender=request.getParameter("gender");
		String passportNo = request.getParameter("passportNo");
		String expirydate= request.getParameter("Expirydate");
		out.println("exp:"+expirydate+"doj"+doj);
		
	String[] w1=expirydate.split("-");
	String[] w2=doj.split("-");
	int i=0;
	boolean valid;
int year1=Integer.parseInt(w1[0]);
int year2=Integer.parseInt(w2[0]);
int mon1=Integer.parseInt(w1[1]);
	int mon2=Integer.parseInt(w2[1]);
	int day1=Integer.parseInt(w1[2]);
	int day2=Integer.parseInt(w2[2]);
	if(year1>year2){
		valid=true;
	}
	else if(year1==year2){
				if(mon1>mon2){
				valid=true;
				}
				else if(mon1==mon2)
				{
					if(day1>day2)
					{
						valid=true;
					}
					else
						valid=false;
				}
				else
					valid=false;
			}
			else{
				valid=false;
			}
			
		if(valid==true)	
		{
		Ticket ticket =(Ticket) request.getAttribute("ticket");//new Ticket();
		
		ticket.setTicketNo(12);
		/*ticket.setCountry(country);
		ticket.setCity(city);
		ticket.setDoj(doj);*/
		ticket.setSeatNo(74);
		ticket.setCheckInCounter("SDN12");
		ticket.setGender(gender);
		ticket.setPassportNo(passportNo);
		/*ticket.setExpirydate(expirydate);*/
		
		//request.setAttribute("t34", ticket);
		flight.put(ticket.getTicketNo(), ticket);
		getServletContext().setAttribute("FlightR036", "flight");
		RequestDispatcher d1=getServletContext().getRequestDispatcher("/ticket.jsp");
		d1.forward(request, response);
		}
		
		else
		{
		RequestDispatcher d2=getServletContext().getRequestDispatcher("/ticket2.html");
		d2.forward(request, response);
		}
		/*out.println("Your PASSPORT will be Expired before you travel.....<br>Kindly update....<br><h2><i>Thank you ...!Visit Again!!!<i><h2>");
		out.println("<a href=ticket1.html>Book ticket</a>");}*/

	}

}
