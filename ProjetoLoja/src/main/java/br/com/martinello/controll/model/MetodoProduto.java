/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.controll.model;


/**
 *
 * @author kevin.carvalho
 */
public class MetodoProduto {

    private String nome;
    private String dataFabricacao;
    private String descricao;
    private Integer valor;
    private String quantidade;
    private String categoria;
    private String dataExecucao;

    public String getDataExecucao() {
        return dataExecucao;
    }

    public String getNome() {
        return nome;
    }

    public String getDataFabricacao() {

        return dataFabricacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getValor() {
        return valor;
    }



    public String getQuantidade() {
        return quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataExecucao(String dataExecucao) {
        this.dataExecucao = dataExecucao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }



    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
