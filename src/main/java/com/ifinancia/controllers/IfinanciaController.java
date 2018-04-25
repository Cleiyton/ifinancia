package com.ifinancia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ifinancia.models.Cadastro;
import com.ifinancia.repository.IfinanciaRepository;

@Controller
public class IfinanciaController {
	/*serve para fazer uma injeção de dependencias toda vez e criado uma nova
	 estancia automaticamente*/
	@Autowired
	private IfinanciaRepository ir;
	
	/*estamos definindo o tipo de metodo para */
	@RequestMapping(value="/cadastra", method=RequestMethod.GET)
	public String cadastra() {
		return "financias/cadastroUsuario";
	}	
	
	/*essa requisição e ultilizada quando clicamos em salvar */
	@RequestMapping(value="/cadastra", method=RequestMethod.POST)
	public String cadastra(Cadastro cadastro) {
		ir.save(cadastro);
		
		/*redirect esta redirecionando ele para o method get*/
		return "redirect:/cadastra";
	}	
	
	@RequestMapping("/lancamento")
	public String cadastrarLançamento() {
		return "financias/lancamento";
		
	}	
}
