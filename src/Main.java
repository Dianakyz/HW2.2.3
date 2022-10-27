import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(  "Lada", "Granta" , 2000 , "Russia",  null, 100, 1.7, null, null, null, 4, true);
        lada.carInfo();
        lada.refill();

        Car audi = new Car( "Audi","A8 50 L TDI quattro", 2020,"Германия","черный",220, 3.0, null, null, "XT556A999", 4, true);
        audi.carInfo();
        audi.refill();

        Car bmw = new Car("BMW","Z8",2021,"Германия","черный",300, 0, null, null, null, 4, true);
        bmw.carInfo();
        bmw.refill();

        Car kia = new Car("KIA","Sportage 4-го поколения", 2018,"Южная Корея", "красный",250, 2.4, null, null, null, 5, true);
        kia.carInfo();
        kia.refill();

        Car hyundai = new Car("Hyundai","Avante",2016,"Южная Корея","оранжевый",250, 1.6, null, null, null, 4, false);
        hyundai.carInfo();
        hyundai.refill();

        new Car.Key(true,true);
        new Car.Insurance(LocalDate.now().plusDays(3),1000f, "123456789");

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        lastochka.trainInfo();
        lastochka.refill();
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        leningrad.trainInfo();
        leningrad.refill();

        Bus one = new Bus("Буханка", "ВАЗ", 1970, "Россия", "коричневый", 100);
        Bus two = new Bus("Автобус", "ВАЗ", 2000, "Россия", "зеленый", 100);
        Bus three = new Bus("Электробус", null, 2020, "Россия", "синий", 100);
        one.busInfo();
        one.refill();
        two.busInfo();
        two.refill();
        three.busInfo();
        three.refill();
    }
}