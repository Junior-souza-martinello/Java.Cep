/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.projetoloja.Dao;

import br.com.martinello.controll.controll.ConnectionFactory;
import br.com.martinello.controll.model.MetodoProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin.carvalho
 */
public class DaoInsercaoProduto {

    public DaoInsercaoProduto daoProduto(MetodoProduto metodoProduto) throws SQLException {

        try {
            ConnectionFactory factory = new ConnectionFactory();
            Connection connection = factory.recuperaConexao();

            PreparedStatement stm = connection.prepareStatement("INSERT INTO produto "
                    + "(nome,data_fabricacao,descricao,valor,quantidade,"
                    + "categoria,data_execucao) "
                    + "VALUES (?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans

            stm.setString(1, metodoProduto.getNome());
            stm.setString(2, metodoProduto.getDataFabricacao());
            stm.setString(3, metodoProduto.getDescricao());
            stm.setInt(4, metodoProduto.getValor());
            stm.setString(5, metodoProduto.getQuantidade());
            stm.setString(6, metodoProduto.getCategoria());
            stm.setString(7, metodoProduto.getDataExecucao());

            stm.execute();

            JOptionPane.showMessageDialog(null, "Os Dados do Produto foram Gravados");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados não foram Gravados" + e);
        }
        return null;

    }
}
