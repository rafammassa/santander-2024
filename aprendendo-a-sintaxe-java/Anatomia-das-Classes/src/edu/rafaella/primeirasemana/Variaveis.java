package edu.rafaella.primeirasemana;

public class Variaveis {
    public static void main(String[] args) {
        String BR = "Brasil";
        double PI = 3.14;
        int estadosBrasileiros = 27;
        int ano = 2000;

        String nome = "Rafaella";
        String sobrenome = "Massa";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);

        int anoDeFabricaca0 = 2022;

        boolean verdadeira = true;
    }
    
        //introduzindo método
    public static String nomeCompleto (String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }
}