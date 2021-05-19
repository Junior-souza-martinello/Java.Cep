/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.validardados;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

/**
 *
 * @author kevin.carvalho
 */
public class FormatadorDocumento {

    public static void main(String[] args) {
        String cpf = "061.211.111-35";
        String cnpj = "82.588.641/0001-73";
        String tituloEleitor = "41745301/16";

        CPFFormatter formatadorCPF  = new CPFFormatter();
        String cpfSemFormatacao = formatadorCPF.unformat(cpf);
        System.out.println(cpf);
        System.out.println(cpfSemFormatacao);
        
        CNPJFormatter formatadorCNPJ = new CNPJFormatter();
        String cnpjSemFormatacao = formatadorCNPJ.unformat(cnpj);
        System.out.println(cnpj);
        System.out.println(cnpjSemFormatacao);
        
        TituloEleitoralFormatter formatadorTitulo = new TituloEleitoralFormatter();
        String tituloComFormatacao = formatadorTitulo.format(tituloEleitor);
        System.out.println(tituloEleitor);
        System.out.println(tituloComFormatacao);
        
    }

}
