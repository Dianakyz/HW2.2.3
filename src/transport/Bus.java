package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int prodactionYear, String prodactionCountry, String color, int maxSpeed) {
        super(brand, model, prodactionYear, prodactionCountry, color, maxSpeed);
    }

    public void busInfo() {
        System.out.println("Брэнд: " + brand +
                ". Модель: " + model +
                ". Год производства: " + prodactionYear +
                ". Страна производства: " + prodactionCountry +
                ". Цвет: " + color +
                ". Максимальная скорость: " + maxSpeed + " км/ч."
        );
    }

    public void refill (){
        System.out.println("Информация по заправке: автобус можно заправлять бензином или дизелем на заправке.");
    }
}
