package com.br.pizzaria.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PostMapping;

import com.br.pizzaria.model.PizzariaModel;

@Service
public class PizzariaService {

	List<PizzariaModel> listaDePizza = new ArrayList<PizzariaModel>(
			Arrays.asList(new PizzariaModel("Calabresa", "fina", " corda", 1800),
					new PizzariaModel("Queijo", " nova-iorquina", " gravata borboleta", 35.00),
					new PizzariaModel("Atum", " siciliana", "  simples", 20.00)));

	public List<PizzariaModel> mostrarLista() {
		return listaDePizza;
	}
		
	public List<PizzariaModel> CadastrarAeB(PizzariaModel pizza) {
		listaDePizza.add(pizza);
		return listaDePizza;
	}

	public PizzariaModel pegarPorSabor(String sabor) {
			PizzariaModel pizzaRetorno = null;
		for (PizzariaModel pizza : listaDePizza) {
			if( pizza.getSabor().equalsIgnoreCase(sabor));
			pizzaRetorno = pizza;

		}
		return pizzaRetorno;
	}
}