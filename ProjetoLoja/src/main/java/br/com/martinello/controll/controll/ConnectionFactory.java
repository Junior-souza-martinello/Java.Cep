/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.controll.controll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kevin.carvalho
 */
public class ConnectionFactory {
    
    public Connection recuperaConexao() throws SQLException { 
        return DriverManager
                .getConnection("jdbc:mysql://localhost/CadastroLoja?", "kevin", "64100122");

    }
}
