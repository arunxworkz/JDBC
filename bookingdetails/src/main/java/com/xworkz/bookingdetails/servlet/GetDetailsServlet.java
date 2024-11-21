package com.xworkz.bookingdetails.servlet;

import com.xworkz.bookingdetails.dto.BookingDTO;
import com.xworkz.bookingdetails.repository.BookingRepoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(loadOnStartup = 1, urlPatterns = "/details")
public class GetDetailsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String phNo = req.getParameter("phNo");

        BookingDTO bookingDTO = new BookingDTO(phNo);
        BookingRepoImpl bookingRepoImpl = new BookingRepoImpl();
        String getData = bookingRepoImpl.getNameEmail(bookingDTO.getPhNo());

        String delete = req.getParameter("delete");

        String addNo = req.getParameter("aadNo");

        int delete1 = Integer.parseInt(delete);
        bookingRepoImpl.delete(delete1);
        //bookingRepoImpl.update();
        //req.setAttribute("nameEmial", getData);
        req.setAttribute("nameEmail", getData);


        RequestDispatcher dispatcher = req.getRequestDispatcher("Details.jsp");
        dispatcher.forward(req, resp);
    }
}
