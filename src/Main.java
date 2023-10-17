import edu.gsmascena.iphone.IPhone;
import edu.gsmascena.iphone.contato.Contato;

public class Main {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        iPhone.acessarNavegador();

        iPhone.acessarReprodutorMusical();

        iPhone.acessarReprodutorVideo();

        iPhone.ligar(new Contato("Phil Spencer", 67543219));

        iPhone.atender();

        System.out.println(iPhone.iniciarCorreioVoz());
    }
}
