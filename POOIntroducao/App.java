
/**
 * App
 */
public class App {
    public static void main(String[] args) {
        // criar 3 objetos ResgistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        // set do nome usando o setNome()
        ana.setNome("Ana Machado");
        ana.setEndereco("Rua das Flores, 123");
        ana.setIdade(29);
        ana.setNotaCiencias(9.5);
        ana.setNotaMatematica(8.3);
        ana.setNotaPortugues(7.8);

        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");

        //Imprimi usando o método getNome()
        System.out.println("Nome:"+ana.getNome());
        System.out.println("Endereço:"+ana.getEndereco());
        System.out.println("Idade:"+ana.getIdade());
        System.out.println("Média:"+ana.getMedia());
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());
    }
}
