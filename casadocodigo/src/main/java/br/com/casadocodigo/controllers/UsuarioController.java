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

import br.com.casadocodigo.daos.UsuarioDAO;
import br.com.casadocodigo.models.Usuario;
import br.com.casadocodigo.validation.UsuarioValidation;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioDAO usuarioDAO;

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.addValidators(new UsuarioValidation());
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listarUsuario() {
		List<Usuario> listaUsuario = usuarioDAO.listarUsuario();
		ModelAndView modelAndView = new ModelAndView("/usuario/listar");
		modelAndView.addObject("listaUsuario", listaUsuario);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView addUsuario(@Valid Usuario usuario, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		
		if(bindingResult.hasErrors()){
			redirectAttributes.addFlashAttribute("msg", bindingResult.getAllErrors().toString());
			return form();
		}
		usuarioDAO.gravarUsuario(usuario);
		
		return new ModelAndView("redirect:usuario");
	}

	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("usuario/form");
		return modelAndView;
	}
}
