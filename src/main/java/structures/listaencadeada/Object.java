package structures.listaencadeada;

public class Object {

    private Object nextObj;
    private int value;

    public void setObj(Object obj) {
        this.nextObj = obj;
    }

    public Object getNextObj() {
        return nextObj;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
