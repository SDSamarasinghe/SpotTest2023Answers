package Question02;

public class Tea extends Beverages{


    @Override
    void addCondimenents() {
        System.out.println("Steeping the tea.");

    }

    @Override
    void brew() {
        System.out.println("Adding lemon");

    }
}
