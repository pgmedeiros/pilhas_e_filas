package structures.listaencadeada;

public class List {

    private Object inicio = null;

    public void insertFirst(Object object){
        this.inicio = object;
    }

    public void insertNewObject(int value){
        Object object = new Object();
        object.setValue(value);
        object.setObj(null);

        if(inicio == null){
            this.inicio = object;
            return;
        }

        Object next = inicio;

        while(next.getNextObj() != null){
            next = next.getNextObj();
        }
        next.setObj(object);
    }

    public void cleanAll(){
        this.inicio = null;
    }

    public boolean isEmpty(){
        return (inicio == null);
    }

    public void count(){
        if(inicio != null){
            int count = 1;
            Object next = inicio;
            while(next.getNextObj() != null){
                count++;
                next = next.getNextObj();
                System.out.println(count);
            }
        }
    }

    public boolean onlyOne(){
        return (inicio.getNextObj() == null);
    }

    public Object getNextObject(){
        return inicio.getNextObj();
    }



}
