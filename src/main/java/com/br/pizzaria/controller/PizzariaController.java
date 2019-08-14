package com.br.pizzaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.pizzaria.model.PizzariaModel;
import com.br.pizzaria.service.PizzariaService;

@Controller
public class PizzariaController {

	@Autowired
	PizzariaService pizzariaServices;

	@RequestMapping("/")
	public ModelAndView exibir(){
		ModelAndView modelAndView = new ModelAndView("cardapio.html");
		modelAndView.addObject("pizzas", pizzariaServices.mostrarLista());
		return modelAndView;
	}

	@GetMapping("/cadastra")
	public ModelAndView Cadastra() {
		ModelAndView modelAndModel = new ModelAndView("postagens.html");
		return modelAndModel;
	}

	@GetMapping("/favorito")
	public ModelAndView redicionar () {	
		ModelAndView modelAndModel1 = new ModelAndView("cadastrar.html");
		return  modelAndModel1;
	}

	@PostMapping("/favorito")
	public  String salvarPostagem(PizzariaModel pizza) {
		pizzariaServices.CadastrarAeB(pizza);
		return  "redirect:/";
	}	

	@RequestMapping("/voltar")
	public ModelAndView exibirNovamente(){
		ModelAndView modelAndView = new ModelAndView("cardapio.html");
		modelAndView.addObject("pizzas", pizzariaServices.mostrarLista());
		return modelAndView;
	}
	
	@GetMapping
	public PizzariaModel pegarPorSabor() {
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject(());
		return null;
	}
}

