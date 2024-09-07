package funcionalidades.smartphone;

import funcionalidades.internet.Internet;
import funcionalidades.musical.Musical;
import funcionalidades.telefonico.Telefonico;

public class SmartPhone implements Internet, Musical, Telefonico{

    public void ligar(String numero) {

        numero = "99786-5443";

        System.out.println("Ligando para o número: " + numero);
        
    }

    public void atender() {

        System.out.println("Atendendo ligação");
       
    }

    public void iniciarCorreioVoz() {

        System.out.println("Iniciando correio de voz");
       
    }

    public void tocar() {
       
        System.out.println("Tocando música");

    }

    public void pausar() {
        
        System.out.println("Musica pausada");

    }

    public void selecionarMusica(String url) {

        url = "https://www.youtube.com/watch?v=A1OqtIqzScI&pp=ygURZ3JlZW4gZGF5IGhvbGlkYXk%3D";

        System.out.println("Link da musica selecionada: " + url);
       
    }

    public void exibirPagina(String url) {
        
        url = "www.google.com";

        System.out.println("Site exibido é: " + url);

    }

    public void adicionarNovaAba() {

        validarInternet();
        
        System.out.println("Nova aba adicionada");

    }

    public void atualizarAba() {

        System.out.println("Atualizando aba");
       
    }

    public void validarInternet() {
       
        System.out.println("Validando conexão com a internet");

    }

    

}
