package br.com.casadocodigo.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.casadocodigo.models.Usuario;

public class UsuarioValidation implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return Usuario.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "nome", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "email", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "senha", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "endereco.logradouro", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "endereco.cep", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "endereco.numeroCasa", "field.required");
	}

}
