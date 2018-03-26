package br.org.fundatec.app;

public class Main {
    public static void main(String[] args) {
        InterfaceDoUsuario ui = Configuracao.getUI();
        ui.iniciar();
    }
}