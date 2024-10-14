package web.model;

public class Car {

    private int year;
    private String modelCar;
    private String colorCar;

    public Car( String modelCar, String colorCar, int year) {

        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.year = year;
    }
    public int getId(){ return year; }

    public String getModelCar() { return modelCar; }

    public String getColorCar() { return colorCar; }

    public void setId(){ this.year = year; }

    public void setModelCar(String modelCar) { this.modelCar = modelCar; }

    public void setColorCar(String colorCar) { this.colorCar = colorCar; }

    @Override
    public String toString() {
        return "Car "  +
                " modelCar= " + modelCar + '\'' +
                ", colorCar= " + colorCar + '\'' +
                ", yearCar= " + year  ;
    }
}
