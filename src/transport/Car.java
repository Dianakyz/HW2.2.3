package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int prodactionYear;
    private final String prodactionCountry;
    private String gearBox;
    private final String bodeType;
    private String registrationNumber;
    private final int seats;
    private boolean summerRubber;

    public Car(String brand, String model, double engineVolume, String color, int prodactionYear, String prodactionCountry){
        if (brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null){
            this.model = "default";
        } else {
            this.model = model;
        }

        if (prodactionCountry == null){
            this.prodactionCountry = "default";
        } else {
            this.prodactionCountry = prodactionCountry;
        }

        if(Double.compare(engineVolume,0) == 0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if(color == null){
            this.color = "белый";
        } else {
            this.color = color;
        }

        if(prodactionYear == 0){
            this.prodactionYear = 2000;
        } else {
            this.prodactionYear = prodactionYear;
        }

        this.gearBox = "механика";
        this.bodeType = "седан";
        this.registrationNumber = "х000х000";
        this.seats = 4;
        this.summerRubber = true;
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

    public String getBodeType() {
        return bodeType;
    }

    public int getSeats() {
        return seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setGearBox(String gearBox) {
        if(gearBox == null){
            this.gearBox = "механика";
        } else {
            this.gearBox = gearBox;
        }
    }

    public void carInfo(){
        System.out.println("Марка авто: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume + ". Цвет кузова: " + color + ". Год производства: " + prodactionYear + ". Страна сборки: " + prodactionCountry + ".");
    }

    public void changeRubber(){
        summerRubber = !summerRubber;
    }
}

//очень длинно и сложно. я сдаюсь. как делать - поняла. Но раз тут без проверки, то подклассы пропущу
