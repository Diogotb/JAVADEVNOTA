package POOExrcicio2;

public class App {
    public static void main(String[] args) {

        Agenda pessoas[] = new Agenda[10];
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Agenda();//construtor do objeto 
            System.out.println("Informe o nome");
            pessoas[i].setNome(sc.nextLine());
        }
    }
}
