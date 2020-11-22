package helloworld.controller;

import java.io.Console;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.tools.javac.util.Convert;

@Controller
public class HelloWorldController {

	@RequestMapping("/fibonacci")
	public ModelAndView fibonacci(@RequestParam(value = "numA", required = false, defaultValue = "-1") int numA,
			@RequestParam(value = "enviando", required = false, defaultValue = "0") int enviando) {
		ModelAndView mv = new ModelAndView("fibonacci");
		long resultado = 0, EnviarA = 0, numero = 0, i, ultimo = 1, penultimo = 0;

		if (numA >= 0) {
			if (numA <= 2) {
				numero = numA - 1;
			} else {
				for (i = 3; i <= numA; i++) {
					numero = ultimo + penultimo;
					penultimo = ultimo;
					ultimo = numero;
				}
			}
		}

		if (enviando == 1) {
			resultado = numero;
			EnviarA = numA;

		}

		mv.addObject("resultado", resultado);
		mv.addObject("numA", EnviarA);
		return mv;
	}

	@RequestMapping("/impar")
	public ModelAndView impar(@RequestParam(value = "numA", required = false, defaultValue = "-1") int numA,
			@RequestParam(value = "enviando", required = false, defaultValue = "0") int enviando) {
		ModelAndView mv = new ModelAndView("impar");
		String resultado = "";
		int EnviarA = 0;

		for (int i = 0; i <= numA; i++) {

			if (i % 2 != 0) {
				if (i != 0) {
					Integer.toString(i);
					if (i == 1) {

						resultado = resultado + i;
					}
					if (i > 1) {
						resultado = resultado + ", ";
						resultado = resultado + i;
					}
				}
			}
		}

		if (enviando == 1) {
			EnviarA = numA;

		}
		mv.addObject("resultado", resultado);
		mv.addObject("numA", EnviarA);
		return mv;
	}

	@RequestMapping("/par")
	public ModelAndView par(@RequestParam(value = "numA", required = false, defaultValue = "-1") int numA,
			@RequestParam(value = "enviando", required = false, defaultValue = "0") int enviando) {
		ModelAndView mv = new ModelAndView("par");
		String resultado = "";
		int EnviarA = 0;

		for (int i = 0; i <= numA; i++) {

			if (i % 2 == 0) {
				if (i != 0) {
					Integer.toString(i);
					if (i == 2) {

						resultado = resultado + i;
					}
					if (i > 2) {
						resultado = resultado + ", ";
						resultado = resultado + i;
					}
				}
			}
		}

		if (enviando == 1) {
			EnviarA = numA;

		}
		mv.addObject("resultado", resultado);
		mv.addObject("numA", EnviarA);
		return mv;
	}

	@RequestMapping("/raiz")
	public ModelAndView raiz(@RequestParam(value = "numA", required = false, defaultValue = "-1") double numA,
			@RequestParam(value = "enviando", required = false, defaultValue = "0") int enviando) {
		ModelAndView mv = new ModelAndView("raiz");
		int EnviarA = 0, raiz = 0;
		String numero, resultado;
		raiz = (int) Math.sqrt(numA);

		if (Math.pow(raiz, 2) == numA) {
			numero = "É UM QUADRADO PERFEITO";
		} else {
			numero = "NÃO É UM QUADRADO PERFEITO";
		}

		if (enviando == 1) {
			resultado = numero;
			EnviarA = (int) numA;

		}

		mv.addObject("resultado", numero);
		mv.addObject("numA", EnviarA);
		return mv;
	}

	@RequestMapping("/primo")
	public ModelAndView primo(@RequestParam(value = "numA", required = false, defaultValue = "-1") int numA,
			@RequestParam(value = "enviando", required = false, defaultValue = "0") int enviando) {
		ModelAndView mv = new ModelAndView("primo");

		int EnviarA = 0;
		String resultado = null, numero = null;

		if (numA == 0) {
			numero = "ZERO É UM NÚMERO NULO";
		} else {
			if (numA % 1 == 0 & numA % numA == 0) {
				if (numA % 2 == 0) {
					if (numA == 2) {
						numero = "É UM NÚMERO PRIMO";
					} else {
						numero = "NÃO É UM NÚMERO PRIMO";
					}

				} else {
					if (numA % 2 == 0 || numA % 3 == 0) {
						if (numA == 3) {
							numero = "É UM NÚMERO PRIMO";
						} else {
							numero = "NÃO É UM NÚMERO PRIMO";
						}
					} else {
						numero = "É UM NÚMERO PRIMO";
					}
				}
			}
		}

		if (enviando == 1) {
			resultado = numero;
			EnviarA = (int) numA;
		}

		mv.addObject("resultado", resultado);
		mv.addObject("numA", EnviarA);
		return mv;
	}

	@RequestMapping("/quadrado")
	public ModelAndView quadrado(@RequestParam(value = "numA", required = false, defaultValue = "-1") double numA,
			@RequestParam(value = "enviando", required = false, defaultValue = "0") int enviando) {
		ModelAndView mv = new ModelAndView("quadrado");

		int EnviarA = 0, resultado = 0, numero = 0;

		numero = (int) Math.pow(numA, 2);

		if (enviando == 1) {
			resultado = numero;
			EnviarA = (int) numA;

		}

		mv.addObject("resultado", resultado);
		mv.addObject("numA", EnviarA);
		return mv;
	}

}
