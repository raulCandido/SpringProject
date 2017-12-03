package br.com.casadocodigo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long enderecoId;
	private String logradouro;
	private Long cep;
	private Long numeroCasa;

	public Long getId() {
		return enderecoId;
	}

	public void setId(Long id) {
		this.enderecoId = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public Long getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(Long numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

}
