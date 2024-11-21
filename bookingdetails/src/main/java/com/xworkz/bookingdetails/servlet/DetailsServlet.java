package com.xworkz.bookingdetails.servlet;

import com.xworkz.bookingdetails.dto.BookingDTO;
import com.xworkz.bookingdetails.service.BookingServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/data")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String emial = req.getParameter("emial");
        String phNo = req.getParameter("phNo");
        String password = req.getParameter("password");
        String age1 = req.getParameter("age");
        String aadNo = req.getParameter("aadNo");

        int age = Integer.valueOf(age1);

        BookingDTO dto = new BookingDTO(name,  emial, phNo, password, age, aadNo);
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl();

        bookingServiceImpl.save(dto);



        RequestDispatcher dispatcher = req.getRequestDispatcher("getData.html");
        dispatcher.forward(req, resp);
    }
}
