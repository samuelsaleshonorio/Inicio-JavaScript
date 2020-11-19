package helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "msg", required = false, defaultValue = "Mensagem Teste") String msg,
			@RequestParam(value = "nome", required = true) String nome
	) {
		ModelAndView mv = new ModelAndView("helloworld");
		
		return mv;
	}

}
