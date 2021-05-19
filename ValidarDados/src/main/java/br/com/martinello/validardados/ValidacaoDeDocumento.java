/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.validardados;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

/**
 *
 * @author kevin.carvalho
 */
public class ValidacaoDeDocumento {

    public static void main(String[] args) {

        String cpf = "06121111135";

        CPFValidator validador = new CPFValidator();

        try {
            validarDocumentos(new CPFValidator(), cpf);
            System.out.println("CPF válido");

        } catch (InvalidStateException e) {
            System.out.println("CPF Invádido" + e);
        }
        String cnpj = "82588641000173";
        CNPJValidator validadorCNPJ = new CNPJValidator();

        try {
            validarDocumentos(new CNPJValidator(),cnpj );
            System.out.println("CNPJ Valido");

        } catch (InvalidStateException e) {
            System.out.println("CNPJ Invalido ; " + e);
        }

        String tituloEleitor = "4174530116";
        TituloEleitoralValidator validadorTitulo = new TituloEleitoralValidator();

        try {
            validadorTitulo.assertValid(tituloEleitor);
            System.out.println("Titulo VAlido");

        } catch (InvalidStateException e) {
            System.out.println("Titulo Invalido" + e);
        }
    }
 private static void validarDocumentos(Validator<String> validador, String documento){
 validador.assertValid(documento);
}
}

