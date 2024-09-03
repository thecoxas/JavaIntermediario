/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.intermediario.cursojava.enum01;

/**
 *
 * @author Welton
 */
public enum TipoDocumento {
    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cpf();
        }
    },CNPJ {
        @Override
        public String geraNumeroTeste() {
           return GeraCpfCnpj.cnpj();
        }
    };
    
    public abstract String geraNumeroTeste();
}
