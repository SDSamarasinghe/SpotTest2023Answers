package Question02;

public class TestTemplateMethod {
    static Beverages beverages = null;

    public static void main(String[] args) {
        Beverages tea = new Tea();
        tea.prepareRecepie();
        System.out.println("==================");
        Beverages coffie = new Coffee();
        coffie.prepareRecepie();
    }
}
