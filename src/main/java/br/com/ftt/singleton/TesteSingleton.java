/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftt.singleton;

/**
 *
 * @author Ysabela
 */
public class TesteSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno giovana = Aluno.getInstance();
        giovana.Nome("Giovana");
        Aluno caio = Aluno.getInstance();
        caio.Nome("Caio");
        
        System.out.println(giovana.getInstance());
        System.out.println(caio.getInstance());
    }
}
