package Cacheme;

public class Cache <T>{

    private T value;
    public void save (T value){

        this.value = value;
    }
    public T get(){
        return value;
    }
    public void remove (){
        this.value = null;
    }

}
