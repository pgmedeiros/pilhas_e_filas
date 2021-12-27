package structures;

public class Fila {

    private int[] array;
    private int fim;
    private int inicio;
    private int quantidade;
    private int size;

    public Fila(int size){
        this.size = size;
        this.array = new int[size];
    }

    public void push(int value){
        this.array[fim] = value;
        quantidade++;
        fim = quantidade%size; // recebe posição em que será inserido. Esse valor fica.
        if(quantidade > size){
            inicio++;
            if(inicio == size){
                inicio = 0;
            }
        }
    }

    public int pull(){
        int element = this.array[inicio];
        inicio++;
        if(inicio == size){
            inicio = 0;
        }
        return element;
    }

    public boolean isEmpty(){
        return (quantidade == 0);
    }

    public boolean isFull(){
        return (quantidade == size);
    }

    public void cleanAll(){
        this.quantidade = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }
}
