import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();
        livros.add(new Digital());
        livros.add(new Impresso());

        for (Livro s : livros) {

            System.out.print(s.getClass());

            if (s.ValidaLivro()) { // valida se a marca d agua é nula
                System.out.println("  valido");
            } else {
                System.out.println("  invalido");
            }
        }

    }

}
