package com.algaworks.algafood.api.v1.model.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class VendaDiaria {

	private Date data;
	private Long totalVendas;
	private BigDecimal totalFatura;
}
