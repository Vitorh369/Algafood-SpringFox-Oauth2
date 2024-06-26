package com.algaworks.algafood.domain.exception;

public class FotoProdutoNaoEncontradaException extends EntidadeNaoEncotradaException {

	private static final long serialVersionUID = 1L;

	public FotoProdutoNaoEncontradaException(String mensagem) {
		super(mensagem);
	}

	public FotoProdutoNaoEncontradaException(Long restauranteId, Long produtoId) {
		super(String.format("Não existe um cadastro de foto do produto com código %d para o restaurante de código %d",
				produtoId, restauranteId));
	}

}
