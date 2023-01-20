 package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/formurl")
public class FormCompsServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		//read from data
		String name=req.getParameter("pname");
		String addrs=req.getParameter("paddrs");
		int age=Integer.parseInt(req.getParameter("page"));
		String gender=req.getParameter("gender");
		String ms=req.getParameter("ms");
		ms=(ms==null)?"single":ms;
		String qlfy=req.getParameter("qlfy");
		String languages[]=req.getParameterValues("languages");
		if(languages==null)
			languages=new String[] {"no languages are selected"};
		String hobies[]=req.getParameterValues("hb");
		if(hobies==null)
			hobies=new String[] {"no hobies are selected"};
		String dob=req.getParameter("dob");
		String tob=req.getParameter("tob");
		String month=req.getParameter("mob");
		String wdb=req.getParameter("wdb");
		int favNumber=Integer.parseInt(req.getParameter("favNumber"));
		long mobileNo=Long.parseLong(req.getParameter("mobileNo"));
		String mail=req.getParameter("mail");
		String favColor=req.getParameter("favColor");
		int income=Integer.parseInt(req.getParameter("income"));
		String url=req.getParameter("fburl");
		String favSS=req.getParameter("favSearch");
		//write binary logic
		if(gender.equalsIgnoreCase("M"))
		{
			if(age<5)
				pw.println("<h1 style='color:blue;text-align:center'>Master::"+name+"You are a baby boy</h1>");
			else if(age<13)
				pw.println("<h1 style='color:blue;text-align:center'>Master::"+name+"You are a child go and Read</h1>");
			else if(age<19)
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"You are a teenaged boy and you are not eligible for marriage</h1>");
			else if(age<35)
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+ "You are Eligible for Marriage and I will Send your profile in our Application</h1>");
			else if(age<50)
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"You are a middle aged man and you have few chance for Marriage</h1>");
			else
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"You are a old man and  you are not Eligible for marriage go and pray GOD for ur Rest Of Life</h1>");
		}
		else
		{
			if(age<5)
				pw.println("<h1 style='color:blue;text-align:center'>Master::"+name+"u r a baby girl</h1>");
			else if(age<13)
				pw.println("<h1 style='color:blue;text-align:center'>Master::"+name+"u r a small girl</h1>");
			else if(age<19) {
				if(ms.equalsIgnoreCase("married"))
				pw.println("<h1 style='color:blue;text-align:center'>Mrs::"+name+"u r a teenaged married girl</h1>");
				else
				pw.println("<h1 style='color:blue;text-align:center'>Miss::"+name+"u r a teenaged girl</h1>");
			}
			else if(age<35) {
				if(ms.equalsIgnoreCase("married"))
				pw.println("<h1 style='color:blue;text-align:center'>Mrs::"+name+"u r a young married girl</h1>");
				else
				pw.println("<h1 style='color:blue;text-align:center'>Miss::"+name+"u r a young girl and you have 100% chance for marriage proposals.</h1>");
			}
			else if(age<50) {
				if(ms.equalsIgnoreCase("married"))
				pw.println("<h1 style='color:blue;text-align:center'>Mrs::"+name+"u r a middle-aged  married women</h1>");
				else
				pw.println("<h1 style='color:blue;text-align:center'>Miss::"+name+"u r a middle-aged women and you have few chance for marriage</h1>");
			}
			else{
				if(ms.equalsIgnoreCase("married"))
				pw.println("<h1 style='color:blue;text-align:center'>Mrs::"+name+"u r a old married woman</h1>");
				else
				pw.println("<h1 style='color:blue;text-align:center'>Miss::"+name+"u r a old woman and you have no chance for marriage proposals</h1>");
			}
			
			
		}
		//display from data
		pw.println("<br><br><b>from data::</b><br>");
		pw.println("<br><b>name:: </b>"+name);
		pw.println("<br><b>age:: </b>"+age);
		pw.println("<br><b>Address:: </b>"+addrs);
		pw.println("<br><b>Gender:: </b>"+gender);
		pw.println("<br><b>Maritial Status:: </b>"+ms);
		pw.println("<br><b>Qualification:: </b>"+qlfy);
		pw.println("<br><b>known language:: </b>"+Arrays.toString(languages));
		pw.println("<br><b>hobies:: </b>"+Arrays.toString(hobies));
		pw.println("<br><b>DOB:: </b>"+dob);
		pw.println("<br><b>TOB:: </b>"+tob);
		pw.println("<br><b>Month of Birth:: </b>"+month);
		pw.println("<br><b>Week of Birth:: </b>"+wdb);
		pw.println("<br><b>Fav Color:: </b>"+favColor);
		pw.println("<br><b>Search String:: </b>"+favSS);
		pw.println("<br><b>income:: </b>"+income);
		pw.println("<br><b>mobileNo:: </b>"+mobileNo);
		pw.println("<br><b>Email:: </b>"+mail);
		pw.println("<br><b>Fav number:: </b>"+favNumber);
		pw.println("<br><b>FB url:: </b>"+url);
		
		//add home hyperlink
		pw.println("<br><br><a href='all_comps_form.html'>home</a>");
		//close stream
		pw.close();
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
