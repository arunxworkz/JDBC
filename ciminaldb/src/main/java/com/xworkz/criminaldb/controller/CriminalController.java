package com.xworkz.criminaldb.controller;

import com.xworkz.criminaldb.dto.CriminalDTO;
import com.xworkz.criminaldb.service.CriminalService;
import com.xworkz.criminaldb.service.CriminalServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CriminalController {

    public CriminalController(){
        System.out.println("This is criminal controller class");
    }

    @PostMapping("/getData")
    public String method(CriminalDTO dto){
        CriminalService cs = new CriminalServiceImpl();
        cs.save(dto);
        return "index.jsp";
    }
}
