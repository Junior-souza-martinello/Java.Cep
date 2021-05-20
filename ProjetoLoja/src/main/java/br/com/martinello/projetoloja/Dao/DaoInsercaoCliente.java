package br.com.martinello.projetoloja.Dao;

import br.com.martinello.controll.controll.ConnectionFactory;
import br.com.martinello.controll.model.MetodoCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kevin.carvalho
 */
public class DaoInsercaoCliente {

    public DaoInsercaoCliente daoCliente(MetodoCliente metodosCliente) throws SQLException {

        try {

            ConnectionFactory factory = new ConnectionFactory();
            Connection connection = factory.recuperaConexao();

            PreparedStatement stm = connection.prepareStatement("INSERT INTO cliente"
                    + "(nome,cpf,celular,localidade,data_de_nacimento,sexo,"
                    + "email,complemento,bairro,cep,logradouro,data_execucao) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans

            stm.setString(1, metodosCliente.getNome());
            stm.setString(2, metodosCliente.getCpf());
            stm.setString(3, metodosCliente.getCelular());
            stm.setString(4, metodosCliente.getLocalidade());
            stm.setString(5, metodosCliente.getDataNascimento());
            stm.setString(6, metodosCliente.getSexo());
            stm.setString(7, metodosCliente.getEmail());
            stm.setString(8, metodosCliente.getComplemento());
            stm.setString(9, metodosCliente.getBairro());
            stm.setString(10, metodosCliente.getCep());
            stm.setString(11, metodosCliente.getLogradouro());
            stm.setString(12, metodosCliente.getDataExecucao());

            stm.execute();
            JOptionPane.showMessageDialog(null, "Os dados foram gravados ");

//            ResultSet rst = stm.getGeneratedKeys();
//            while (rst.next()) {
//                Integer id = rst.getInt(1);
//                System.out.println("O id criado foi: " + id);
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados não foram Gravados" + e);

        }
        return null;

    }
}
