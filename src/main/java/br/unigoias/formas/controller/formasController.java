package br.unigoias.formas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unigoias.formas.model.forma1;
import br.unigoias.formas.model.formas;

@RestController
@RequestMapping("/formas")
public class formasController {
	
	@GetMapping("/teste")
	public String teste() 
	{
		return "teste de get";
	}
	
	@PostMapping("/retangulo/area")
	public formas getArea(@RequestBody formas Formas) {
		return Formas;
		
	//Altura * largura	
		
	}
	
	@RequestMapping("/formas")
	
	@PostMapping("/circulo/{raio}")
	public double multiplica(@PathVariable double raio) {
		return (raio * raio) * 3.1415;
	}
	
	//Area do raio = valor do raio elevado a 2 * valor PI
	
	@PostMapping("/circulo/area")
	public forma1 getArea1(@RequestBody forma1 Forma1) {
		return Forma1;
	
}
	
}
