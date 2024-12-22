package solutions;

public class Refrigerator {
    private  boolean hasWorkToDo = false;

    public  void orderFood(){
        hasWorkToDo = true;
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
}
