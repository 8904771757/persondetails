package com.example.persondetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.persondetails.domain.person;
import com.example.persondetails.service.personService;

@Controller
 public class personController {

	@Autowired
    private personService service;
	private Object listperson;
 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<person> listpersion = service.listAll();
        model.addAttribute("listperson", listperson);
        System.out.print("Get / ");
        return "index";
    }
 
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("person", new person());
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveperson(@ModelAttribute("person") person salry) {
        service.save(salry);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditpersonPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        person salry = service.get(id);
        mav.addObject("person", salry);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")
    public String deleteperson(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
