package br.com.casadocodigo.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.casadocodigo.models.Produto;

public class ProdutoValidation implements Validator {
	private static final Integer NUMERO_PAGINAS = 0;

	@Override
	public boolean supports(Class<?> clazz) {
		return Produto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "titulo", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
		Produto produto = (Produto) object;
		if (produto.getPaginas() <= NUMERO_PAGINAS) {
			ValidationUtils.rejectIfEmpty(errors, "paginas", "field.required");
		}
	}

}
