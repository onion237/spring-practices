package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	public HelloController() {
		super();
		System.out.println("sdhfioshfoishdfsadfo");
	}
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/hello2")
	public String hello2(@ModelAttribute("name") String name) {
	
		return "/WEB-INF/views/hello2.jsp";
	}
	@RequestMapping("/hello3")
	public ModelAndView hello3(String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("/WEB-INF/views/hello3.jsp");
		return mv;
	}
	
	@RequestMapping("/hello4")
	public String hello4(Model model, String name) {
		model.addAttribute("name", name);
		return "/WEB-INF/views/hello4.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/hello5")
	public String hello5(String name) {
		return "hello " + name;
	}
	@RequestMapping("/redirect")
	public String redirect() {
		return "redirect:/hello";
	}
}