package br.com.casadocodigo.models;

public enum tipoPreco {
	EBOOK("Ebook"), IMPRESSO("Impresso"), COMBO("Combo");
	private String descricao;

	private tipoPreco(String descricao) {
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
