package com.faisal.sfgpetclinic.controllers;


import com.faisal.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/owners")
@Controller
public class OwnerController {



    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("owners" , ownerService.findAll());
        return "owners/index";
    }

}
