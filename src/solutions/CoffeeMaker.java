package solutions;

public class CoffeeMaker {
    private boolean hasWorkToDo = false;

    public void brewCoffee(){
        hasWorkToDo = true;
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

}
