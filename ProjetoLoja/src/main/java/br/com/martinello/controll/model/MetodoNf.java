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
public class MetodoNf {
    private String valor;
    private String descricao;
    private String enderecoCliente;
    private String telefone;
    private String email;
    private String data;

    public String getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getData() {
        return data;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
