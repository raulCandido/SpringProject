package br.com.casadocodigo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.daos.ProdutoDAO;
import br.com.casadocodigo.models.Produto;
import br.com.casadocodigo.models.tipoPreco;
import br.com.casadocodigo.validation.ProdutoValidation;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
	//injecao de dependencia do DAO
	@Autowired
	private ProdutoDAO produtoDAO;

	//metodo para iniciar classes de validacao	
	@InitBinder
	public void InitBinder(WebDataBinder webDataBinder) {
		webDataBinder.addValidators(new ProdutoValidation());
	}
	//mapeando o request para essa url
	@RequestMapping("/form")
	public ModelAndView form(Produto produto) {
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos", tipoPreco.values());
		return modelAndView;
	}
	//definindo o metodo de request
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView gravar(@Valid Produto produto, BindingResult bindingResult, 	RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()){
			return form(produto);
		}
		produtoDAO.gravar(produto);
		redirectAttributes.addFlashAttribute("msg", "Cadastro efetuado com sucesso!");
		return new ModelAndView("redirect:produtos");

	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
		List<Produto> produtos = produtoDAO.listar();
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos", produtos);
		return modelAndView;
	}

}
