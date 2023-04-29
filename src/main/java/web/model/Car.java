package web.model;

public class Car {
    private String model;
    private int cost;
    private int series;

    public Car() {
        this.model = "volga";
        this.cost = 5000;
        this.series = 1;
    }

    public Car(String model, int cost, int series) {
        this.model = model;
        this.cost = cost;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
