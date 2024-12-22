package solutions;

public class SmartKitchen {
    //brewMaster
    //dishWasher
    //iceBox

    CoffeeMaker brewMaster = new CoffeeMaker();
    DishWasher dishWasher = new DishWasher();
    Refrigerator iceBox = new Refrigerator();
    public void addWater(){
        brewMaster.setHasWorkToDo(true);

    }

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void doKitchenWork(boolean s1, boolean s2, boolean s3){
        brewMaster.setHasWorkToDo(s1);
        iceBox.setHasWorkToDo(s2);
        dishWasher.setHasWorkToDo(s3);
    }
}
