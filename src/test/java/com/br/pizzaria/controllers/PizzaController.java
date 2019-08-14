package com.br.pizzaria.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.br.pizzaria.model.PizzariaModel;

@RunWith(SpringRunner.class)
public class PizzaController {
	private PizzariaModel pizza;

	@Before
	public void preparar() {
		pizza = new PizzariaModel();

		pizza.setSabor("Queijo");
		pizza.setBorda("Fina");
		pizza.setMassa("fina");
		pizza.setValor(98.2D);
	}

	@Test
	public void testflavor() {
		pizza.setSabor("Calabresa");
		assertEquals("Calabresa", pizza.getSabor());
	}

	@Test
	public void testEdge() {
		pizza.setBorda("cheder");
		assertEquals("cheder", pizza.getBorda());
	}
	@Test
	public void testValue() {
		pizza.setValor(12.00);;
		assertEquals("",pizza.getValor());
	}
	@Test
	public void testPasta() {
		pizza.setMassa("Fina");;
		assertEquals("Fina",pizza.getMassa());
	}
}
