package structures;

public class Pilha {

    private int[] array;
    private int topo;
    private int size;

    public void create(int size){
        this.topo = -1;
        this.size = size;
        this.array = new int[size];
    }
    public boolean isEmpty(){
        if(topo == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(topo == (size - 1) || topo > (size - 1)){
            return true;
        }
        return false;
    }
    public void push(int value){
        topo++;
        array[topo] = value;
    }
    public int pop(){
        int element = array[topo];
        topo--;
        return element;

    }
    public int position(){
        return topo;

    }



}
