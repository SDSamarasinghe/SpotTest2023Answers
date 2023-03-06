package Question02;

public abstract class Beverages {
    abstract void addCondimenents();

    abstract void brew();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pour into cup");
    }

    public void prepareRecepie() {
        boilWater();
        brew();
        addCondimenents();
        pourInCup();
    }
}
