package AparelhoCelular;

import funções.AparelhoTelefonico.AparelhoTelefonico;
import funções.NavegadorInternet.NavegadorInternet;
import funções.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{



    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }


    public boolean atender() {
        return false;
    }


    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }


    public void exibirPagina() {

    }


    public void adicionarPagina() {

    }


    public void atualizarPagina() {

    }


    public boolean tocar() {
        return false;
    }


    public boolean pausar() {
        return false;
    }


    public void selecionarMusica() {

    }
}
