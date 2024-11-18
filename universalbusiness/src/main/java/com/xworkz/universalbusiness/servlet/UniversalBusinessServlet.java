package com.xworkz.universalbusiness.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.universalbusiness.dto.BusinessDTO;
import com.xworkz.universalbusiness.service.BussessServiceImpl;

import lombok.NoArgsConstructor;

@WebServlet(loadOnStartup = 1, urlPatterns = "/verify")
public class UniversalBusinessServlet extends HttpServlet{
	
	public UniversalBusinessServlet() {
		System.out.println("This is servlet class");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phNo = req.getParameter("phNo");
		String age = req.getParameter("age");
		String addNo = req.getParameter("addNo");
		String panNo = req.getParameter("panNo");
		
		int age1 = Integer.valueOf(age);
		
		BusinessDTO businessDTO = new BusinessDTO(name, email, phNo, age1, addNo, panNo);
		
		BussessServiceImpl bussessServiceImpl = new BussessServiceImpl();
		boolean saved = bussessServiceImpl.save(businessDTO);
		
		if(saved) {
			System.out.println("Dtat is saved successfully");
		}else {
			System.out.println("dtat is not saved");
		}
	}

}
