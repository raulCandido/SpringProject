package br.com.casadocodigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.models.CarrinhoCompras;

@RequestMapping("/pagamento")
@Controller
public class PagamentoController {
	
	@Autowired
	private CarrinhoCompras carrinho;

	@RequestMapping(value="/finalizar", method=RequestMethod.POST)
	public ModelAndView finalizar( RedirectAttributes model) {
		System.out.println("carrinho total" + carrinho.getTotal());
		model.addFlashAttribute("msg", "Pagamento realizado com sucesso!!!");
		return new ModelAndView("redirect:/produtos");
	}
}
