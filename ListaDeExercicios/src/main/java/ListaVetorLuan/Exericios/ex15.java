package Exericios;

public class ex15 {
    public static void main(String[] args) {
        int varX = 10;
        int [] vetorA = new int [varX];
        int infquinze=0;
        int quantquinze=0;
        int somasupquinze=0;
        int contsupquinze=0;

        for(int i=0; i <varX; i++){
            vetorA[i]=(i+1)*(i*2); //define valor aleatorio e alimenta o vetor

            //define em qual condição se enquadra

            if(vetorA[i]<15){
                somasupquinze=somasupquinze+vetorA[i];

            }else if(vetorA[i]==15){
                quantquinze=quantquinze+1;
            }else{
                somasupquinze=somasupquinze+vetorA[i];
                contsupquinze=contsupquinze+1;
            }
            System.out.println("Exercicio A, A dos elementos maior que 15 : " + somasupquinze );
            System.out.println("Exercicio B, A quantidade de elementos iguais a 15 : " +quantquinze);
            System.out.println("Exercicio C, a media dos elementos é igual a 15 é : "+ somasupquinze/quantquinze);
        }
    }
}
