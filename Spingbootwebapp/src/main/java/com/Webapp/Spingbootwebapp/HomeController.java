package com.Webapp.Spingbootwebapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	@RequestMapping("/home")
	@ResponseBody
	public String Home(@RequestAttribute("aname") String name, HttpSession session)
	{   
		
		System.out.println("hi" +name);
		session.setAttribute("name", name); // to send the object to .jsp
		return "home.jsp";
	}

}
