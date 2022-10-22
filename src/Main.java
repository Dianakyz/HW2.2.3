import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(  "Lada", null , 1.7 , null,  0, null);
        lada.carInfo();

        Car audi = new Car( "Audi","A8 50 L TDI quattro", 3.0,"черный",2020,"Германия");
        audi.carInfo();

        Car bmw = new Car("BMW","Z8",0,"черный",2021,"Германия");
        bmw.carInfo();

        Car kia = new Car(null,"Sportage 4-го поколения", 2.4,"красный", 2018,"Южная Корея");
        kia.carInfo();

        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");
        hyundai.carInfo();
    }
}