/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.enum02;

import com.intermediario.cursojava.enum00.DiaSemana;
import com.intermediario.cursojava.enum01.Pessoa;
import com.intermediario.cursojava.enum01.TipoDocumento;

/**
 *
 * @author Welton
 */
public class Teste02 {

    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);

    }
}
