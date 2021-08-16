package com.fanfiction.expectativamercado.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Expectativas_de_Mercado")
public class ExpectativaMercado implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String indicador;
	private Date data;
	private Date dataReferencia;
	private Double media;
	private Double mediana;
	private Double desvioPadrao;
	private Double coeficienteVariacao;
	private Double minimo;
	private Double maximo;
	private Integer numeroRespondentes;
	private Boolean baseCalculo;
	
	public ExpectativaMercado() {
		
	}

	public ExpectativaMercado(String indicador, Date data, Date dataReferencia, Double media, Double mediana,
			Double desvioPadrao, Double coeficienteVariacao, Double minimo, Double maximo, Integer numeroRespondentes,
			Boolean baseCalculo) {
		super();
		this.indicador = indicador;
		this.data = data;
		this.dataReferencia = dataReferencia;
		this.media = media;
		this.mediana = mediana;
		this.desvioPadrao = desvioPadrao;
		this.coeficienteVariacao = coeficienteVariacao;
		this.minimo = minimo;
		this.maximo = maximo;
		this.numeroRespondentes = numeroRespondentes;
		this.baseCalculo = baseCalculo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIndicador() {
		return indicador;
	}

	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataReferencia() {
		return dataReferencia;
	}

	public void setDataReferencia(Date dataReferencia) {
		this.dataReferencia = dataReferencia;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Double getMediana() {
		return mediana;
	}

	public void setMediana(Double mediana) {
		this.mediana = mediana;
	}

	public Double getDesvioPadrao() {
		return desvioPadrao;
	}

	public void setDesvioPadrao(Double desvioPadrao) {
		this.desvioPadrao = desvioPadrao;
	}

	public Double getCoeficienteVariacao() {
		return coeficienteVariacao;
	}

	public void setCoeficienteVariacao(Double coeficienteVariacao) {
		this.coeficienteVariacao = coeficienteVariacao;
	}

	public Double getMinimo() {
		return minimo;
	}

	public void setMinimo(Double minimo) {
		this.minimo = minimo;
	}

	public Double getMaximo() {
		return maximo;
	}

	public void setMaximo(Double maximo) {
		this.maximo = maximo;
	}

	public Integer getNumeroRespondentes() {
		return numeroRespondentes;
	}

	public void setNumeroRespondentes(Integer numeroRespondentes) {
		this.numeroRespondentes = numeroRespondentes;
	}

	public Boolean getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(Boolean baseCalculo) {
		this.baseCalculo = baseCalculo;
	}
	
	

}
