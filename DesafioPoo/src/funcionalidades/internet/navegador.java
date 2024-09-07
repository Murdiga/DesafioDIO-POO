
package funcionalidades.internet;

public class navegador implements Internet{

    public void exibirPagina(String url) {

        validarInternet();

        url = "https://www.youtube.com/watch?v=9ou608QQRq8";

        System.out.println("Está é a URL do site: " + url);

    }

    private void validarInternet() {

        System.out.println("Validando conexão");

    }

    public void adicionarNovaAba() {

        System.out.println("Adicionando nova Aba");

    }

    public void atualizarAba(){

        System.out.println("Atualizando o site desta Aba");

    }

}
