public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int prodactionYear;
    String prodactionCountry;

    Car(String brand, String model, double engineVolume, String color, int prodactionYear, String prodactionCountry){
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
    }

    void carInfo(){
        System.out.println("Марка авто: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume + ". Цвет кузова: " + color + ". Год производства: " + prodactionYear + ". Страна сборки: " + prodactionCountry + ".");
    }
}
