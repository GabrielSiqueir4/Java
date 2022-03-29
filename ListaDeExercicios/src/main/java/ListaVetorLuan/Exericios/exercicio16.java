package ListaVetorLuan.Exericios;

public class exercicio16 {

    public static void main(String[] args) {
        int [] VetorA = new int[10];
        int somaValores=0;


        for (int i = 0; i < 8; i++) {
            VetorA[i]=3*(i+3);//valor aleatório

        }

        //imprimir VET A


        for (int i = 0; i < 35; i++) {
            System.out.print(VetorA[i]);
            System.out.print(" ");
            if(VetorA[i] < 15){

               somaValores=somaValores+VetorA[i];
                System.out.println(""+somaValores);
            }



        }


    }
}
