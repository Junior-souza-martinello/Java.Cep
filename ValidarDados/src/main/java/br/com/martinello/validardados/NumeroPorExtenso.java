/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.validardados;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import java.math.BigDecimal;

/**
 *
 * @author kevin.carvalho
 */
public class NumeroPorExtenso {
    public static void main(String[] args) {
       NumericToWordsConverter conversor  = new NumericToWordsConverter(new FormatoDeReal());
        BigDecimal valor = new BigDecimal("75.99"); 
       String valorPorExtenso = conversor.toWords(valor.doubleValue());
        System.out.println(valorPorExtenso );
       
    }
    
}
