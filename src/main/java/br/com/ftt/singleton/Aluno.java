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
public class Aluno {
    
    private static Aluno uniqueInstance = new Aluno();

     /* Definir o construtor como privado para impedir que outras classes criem novas instâncias*/
        private Aluno() {
	}
        /*Método para retornar a instância única*/
	public static Aluno getInstance() {
		return uniqueInstance;
	}
        
        public void Nome(String nome){
            System.out.println(nome);
}
    
}
