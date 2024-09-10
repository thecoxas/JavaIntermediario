/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.classesaninhadas;

/**
 *
 * @author Welton
 */

    public class ExemploClasseAnonima {

    public static void main(String[] args) {
        
        // Classe anônima implementando a interface Runnable
        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando a tarefa em uma classe anônima!");
            }
        };

        // Executando o método run da interface Runnable
        tarefa.run();
    }
}


