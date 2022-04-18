import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<SerHumano> lista = new ArrayList<>();

        lista.add(new Aluno(555));
        lista.add(new Professor());
        lista.add(new Cordenador());

        for (SerHumano s : lista) {

            System.out.print(  s.getClass());

            if(s.ValidaCodigo()){
                System.out.println("  valido");
            }else{
                System.out.println("  invalido");
            }
        }

    }

}
