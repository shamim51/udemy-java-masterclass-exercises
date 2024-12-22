package solutions;

public class DishWasher {
    private boolean hasWorkToDo = false;

    public void doDishes(){
        hasWorkToDo = true;
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
}
