package br.com.martinello.validardados;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kevin.carvalho
 */
public class CEP {

    public static void main(String[] args) throws MalformedURLException, IOException {
        ViaCEPClient cliente = new ViaCEPClient();
        try {
            ViaCEPEndereco endereco = cliente.getEndereco("78455000");
            System.out.println(endereco.getBairro());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
