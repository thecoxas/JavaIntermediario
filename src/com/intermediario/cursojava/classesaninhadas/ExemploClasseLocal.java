/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.classesaninhadas;

/**
 *
 * @author Welton
 */
public class ExemploClasseLocal {

    public void executarProcesso() {
        // Variável local (deve ser final ou efetivamente final)
        int fator = 10;

        // Classe local dentro do método
        class Multiplicador {

            public int multiplicar(int valor) {
                return valor * fator; // Acessa a variável local 'fator'
            }
        }

        // Instanciando a classe local e usando-a
        Multiplicador multiplicador = new Multiplicador();
        int resultado = multiplicador.multiplicar(5);
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        ExemploClasseLocal exemplo = new ExemploClasseLocal();
        exemplo.executarProcesso();
    }
}
