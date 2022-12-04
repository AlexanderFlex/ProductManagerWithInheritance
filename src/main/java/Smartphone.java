public class Smartphone extends Product {
    private String producer;

    public Smartphone(int id, String name, int cost, String producer) {
        super(id, name, cost);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }


    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        if (getProducer().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}