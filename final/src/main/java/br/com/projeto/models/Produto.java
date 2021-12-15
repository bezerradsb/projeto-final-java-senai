package br.com.projeto.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	@NotEmpty
	private String cod_barra;
	
	@NotEmpty
	private String descricao;
	
	@NotEmpty
	private String marca;
	
	@NotEmpty
	private String modelo;

	@NotEmpty
	private String valor_c;
	
	@NotEmpty
	private String valor_v;
	
	@NotEmpty
	private String peso;
	
	@NotEmpty
	private String fornecedor;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getCod_barra() {
		return cod_barra;
	}

	public void setCod_barra(String cod_barra) {
		this.cod_barra = cod_barra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getValor_c() {
		return valor_c;
	}

	public void setValor_c(String valor_c) {
		this.valor_c = valor_c;
	}

	public String getValor_v() {
		return valor_v;
	}

	public void setValor_v(String valor_v) {
		this.valor_v = valor_v;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

}
