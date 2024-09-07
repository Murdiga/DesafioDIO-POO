import funcionalidades.smartphone.SmartPhone;

public class Iphone {
    public static void main(String[] args) throws Exception {

        SmartPhone celular = new SmartPhone();

        celular.adicionarNovaAba();
        celular.exibirPagina(null);
        celular.atualizarAba();

        celular.iniciarCorreioVoz();
        celular.ligar(null);
        celular.atender();
        
        celular.selecionarMusica(null);
        celular.tocar();
        celular.pausar();

    }
}
