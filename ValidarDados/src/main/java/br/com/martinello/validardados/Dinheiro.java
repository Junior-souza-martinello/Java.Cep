/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.validardados;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

/**
 *
 * @author kevin.carvalho
 */
public class Dinheiro {

    public static void main(String[] args) {
        CurrencyUnit moeda = Monetary.getCurrency("BRL");
        MonetaryAmount valorDaParcela = Money.of(75, moeda);
        System.out.println(valorDaParcela);
        MonetaryAmount valorTotal = valorDaParcela.multiply(12);
        System.out.println(valorTotal);
        MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
        System.out.println(desconto);
        
       NumberValue descontoSemMoeda =  desconto.getNumber();
        
        NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
        String valorPorExtenso = conversor.toWords(descontoSemMoeda.doubleValue());
        System.out.println(valorPorExtenso);
        System.out.println(" Olá aluno, ganhe " + valorPorExtenso + " ouvindo nosso podCast.Link");
    
    }

}
