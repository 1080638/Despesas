/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.teste;

import java.util.Scanner;

/**
 *
 * @author João
 */
public class MenuDespesas {
    private float valor;
    private String descricao;
    private Scanner in= new Scanner(System.in);
    
    public MenuDespesas(){
        System.out.println("Insira o valor da Despesa:\n");
        valor = in.nextFloat();
        System.out.println("Insira a Descrição");
        descricao = in.next();
        
    }
}
