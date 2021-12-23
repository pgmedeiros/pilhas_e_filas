import pilhas.PilhaGenerica10;

public class Main {
    public static void main(String[] args) {

        PilhaGenerica10 pilha = new PilhaGenerica10();
        pilha.create(10);
        pilha.push(1);
        pilha.push(1);
        pilha.push(1);pilha.push(1);pilha.push(1);pilha.push(1);pilha.push(1);pilha.push(1);
        pilha.push(1);pilha.push(1);

        System.out.println(pilha.isFull());
        System.out.println(pilha.position());

        try{
            pilha.push(2);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(pilha.isFull());
        //MESMO DANDO ERRO, ELE ALTERA A POSIÇÃO, ISSO QUER DIZER OQ?
    }
}
