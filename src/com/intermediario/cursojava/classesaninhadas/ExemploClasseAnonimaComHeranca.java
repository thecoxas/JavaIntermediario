/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.classesaninhadas;

/**
 *
 * @author Welton
 */
public class ExemploClasseAnonimaComHeranca {

    public static void main(String[] args) {
        
        // Classe anônima que estende a classe abstrata Animal
        Animal cachorro = new Animal() {
            @Override
            public void fazerSom() {
                System.out.println("O cachorro faz: Au Au!");
            }
        };

        cachorro.fazerSom(); // Chama o método sobrescrito
    }
}

// Classe abstrata Animal
abstract class Animal {
    public abstract void fazerSom();
}

    

