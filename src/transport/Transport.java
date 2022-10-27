package transport;

public abstract class Transport {

    public final String brand;
    public final String model;
    public final int prodactionYear;
    public final String prodactionCountry;
    public String color;
    public int maxSpeed;

    public Transport(String brand, String model, int prodactionYear, String prodactionCountry, String color, int maxSpeed) {
        this.brand = ValidationUtils.validOrDefault(brand, "информация не указана");
        this.model = ValidationUtils.validOrDefault(model, "информация не указана");
        this.prodactionYear = prodactionYear >= 0 ? prodactionYear : 2000;
        this.prodactionCountry = ValidationUtils.validOrDefault(prodactionCountry, "информация не указана");
        setColor(color);
        setMaxSpeed(maxSpeed);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProdactionYear() {
        return prodactionYear;
    }

    public String getProdactionCountry() {
        return prodactionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "не указан");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed  = Math.max(maxSpeed,120);
    }

    public abstract void refill ();
}
