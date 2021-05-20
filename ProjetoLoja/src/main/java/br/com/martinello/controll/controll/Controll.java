/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.controll.controll;

import br.com.martinello.controll.model.MetodoBuscaCliente;
import br.com.martinello.controll.model.MetodoCliente;
import br.com.martinello.controll.model.MetodoProduto;
import br.com.martinello.projetoloja.Dao.DaoBuscaCliente;
import br.com.martinello.projetoloja.Dao.DaoInsercaoCliente;
import br.com.martinello.projetoloja.Dao.DaoInsercaoProduto;
import java.sql.SQLException;

/**
 *
 * @author kevin.carvalho
 */
public class Controll {

    DaoInsercaoProduto daoInsercaoProduto = new DaoInsercaoProduto();
    DaoInsercaoCliente daoInsercaoCliente = new DaoInsercaoCliente();
    DaoBuscaCliente daoBuscaCliente = new DaoBuscaCliente();
    MetodoProduto metodoProduto = new MetodoProduto();
    MetodoCliente metodoCliente = new MetodoCliente();
    MetodoBuscaCliente metodoBuscaCliente = new MetodoBuscaCliente();

    public void SalvarProduto(MetodoProduto metodoProduto) throws SQLException {
        this.daoInsercaoProduto.daoProduto(metodoProduto);
    }

    public void SalvarCliente(MetodoCliente metodoCliente) throws SQLException {
        this.daoInsercaoCliente.daoCliente(metodoCliente);
    }

//    public void SalvarBusca(MetodoBuscaCliente metodoBuscaCliente ) throws SQLException {
//        this.daoBuscaCliente.daoBuscarCliente(metodoBuscaCliente);
//    }

}
