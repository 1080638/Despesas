/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.teste;



public class Menu {
    
    public Menu(){
        int op=0;
        System.out.println ("Bem Vindo!");
        System.out.println("1- Registar Despesas\n2- (...)\n0- Sair\n");
        switch(op) {
            case 1: new MenuDespesas();break;
            case 2: ; break;
            case 0: System.exit(0);break;
            default:
                System.out.println("Opção Errada");
        }
    }
    
}
