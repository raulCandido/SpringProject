package br.com.casadocodigo.models;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class Preco {
	private BigDecimal valor;
	private tipoPreco tipoPreco;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public tipoPreco getTipoPreco() {
		return tipoPreco;
	}

	public void setTipoPreco(tipoPreco tipoPreco) {
		this.tipoPreco = tipoPreco;
	}

}
