/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ritesh Patidar
 */
public class profile extends HttpServlet 

  {
    

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
                   Connection con = null;
                   Statement st = null; 
                   ResultSet rs = null;
                   PrintWriter out=response.getWriter();

                HttpSession session= request.getSession(true);                
                   
        String user=(String)session.getAttribute("user");
                String pass=(String)session.getAttribute("pass");

        System.out.println("Session username = "+user);
                System.out.println("Session password = "+pass);

      //  HttpSession session= request.getSession(true);
        

  try
             
  {
            
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Driver Loaded");

      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
      System.out.println("Connected");

      st = con.createStatement();
            
     String query = "Select * from user_details where username='"+user+"'";
      System.out.println(query);
      rs = st.executeQuery(query); 
       // out.println("<a href='Logoutpage'>logout</a>");
      
         if(session!=null) 
         {
             
        
           user =(String)session.getAttribute("user");
          out.println("welcome to profile");
         }
         
         else
         {
             
             response.sendRedirect("index.jsp");
                     
         }
  }
 catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        } 
 catch (SQLException e) 
        {
            System.out.println(e);
        } 
    }
       
}

  
   


   
               
               
      