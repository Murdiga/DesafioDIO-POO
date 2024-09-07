package funcionalidades.musical;

public class Ipod implements Musical {

    public void tocar() {

        System.out.println("Tocando sua musica");

    }

    public void pausar() {

        System.out.println("Pausando sua musica");

    }

    public void selecionarMusica(String musica){

        musica = "Green Day - Holiday";

        System.out.println("A musica selecionada é: " + musica);

    }

}
