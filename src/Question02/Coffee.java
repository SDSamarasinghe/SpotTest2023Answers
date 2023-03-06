package Question02;

public class Coffee extends Beverages{

    @Override
    void addCondimenents() {
        System.out.println("Stripping coffie through filter");

    }

    @Override
    void brew() {
        System.out.println("Add Suger and milk");

    }
}
