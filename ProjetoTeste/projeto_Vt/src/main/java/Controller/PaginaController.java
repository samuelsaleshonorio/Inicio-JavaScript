package Controller;

public class PaginaController {
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "msg", required = false, defaultValue = "Mensagem Teste") String msg,
			@RequestParam(value = "nome", required = true) String nome
	) {
		ModelAndView mv = new ModelAndView("helloworld");
		
		return mv;
	}
	

}
