package br.com.neainformatica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class contribuinte implements Serializable{
	private Integer cod_contribuinte;
	private Integer cod_rua;
	private String nome;
	private String cpf;
	private Integer numero;
	private Integer qtde_imovel;
	public Integer getCod_contribuinte() {
		return cod_contribuinte;
	}
	public void setCod_contribuinte(Integer cod_contribuinte) {
		this.cod_contribuinte = cod_contribuinte;
	}
	public Integer getCod_rua() {
		return cod_rua;
	}
	public void setCod_rua(Integer cod_rua) {
		this.cod_rua = cod_rua;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getQtde_imovel() {
		return qtde_imovel;
	}
	public void setQtde_imovel(Integer qtde_imovel) {
		this.qtde_imovel = qtde_imovel;
	}
	
}
