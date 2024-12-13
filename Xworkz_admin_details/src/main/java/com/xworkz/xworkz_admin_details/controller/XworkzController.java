package com.xworkz.xworkz_admin_details.controller;

import com.xworkz.xworkz_admin_details.dto.XworkzDTO;
import com.xworkz.xworkz_admin_details.service.XworkzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;

@Controller
@RequestMapping("/")
public class XworkzController {

    @Autowired
    private XworkzService xworkzService;
    public XworkzController(){
        System.out.println("This is controller constructor");
    }

    @PostMapping("/getData")
    public String method(XworkzDTO dto){
        System.out.println("The dto is: "+dto);
        xworkzService.save(dto);


        return "success.jsp";
    }

}
