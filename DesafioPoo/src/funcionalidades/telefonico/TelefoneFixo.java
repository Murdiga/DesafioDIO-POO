package funcionalidades.telefonico;

public class TelefoneFixo implements Telefonico {

    public void ligar(String numero) {
        numero = "9967873425";

        System.out.println("Ligando para número: " + numero);

    }

    public void atender() {

        System.out.println("Atendendo ligação");

    }

    public void iniciarCorreioVoz() {

        System.out.println("Iniciando Correio de Voz");

    }

}
