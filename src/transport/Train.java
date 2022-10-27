package transport;

public class Train extends Transport{
    private int costRide;
    private int time;
    private final String startStation;
    private final String endStation;
    private int carriage;

    public Train(String brand, String model, int prodactionYear, String prodactionCountry, String color, int maxSpeed, int costRide, int time, String startStation, String endStation, int carriage) {
        super(brand, model, prodactionYear, prodactionCountry, color, maxSpeed);
        setCostRide(costRide);
        setTime(time);
        setCarriage(carriage);

        this.startStation = ValidationUtils.validOrDefault(startStation, "информация не указана");
        this.endStation = ValidationUtils.validOrDefault(endStation, "информация не указана");
    }

    public String getStartStation() {
        return startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public int getCostRide() {
        return costRide;
    }

    public void setCostRide(int costRide) {
        if(costRide <= 0){
            System.out.print("Указана некорреткная цена");
        } else {
        this.costRide = costRide;
        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if(time <= 0){
            System.out.print("Время не указано. ");
        } else {
            this.time = time;
        }
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        if(carriage <= 0){
            System.out.print("Указано некорреткное количество вагонов");
        } else {
            this.carriage = carriage;
        }
    }

    public void trainInfo () {
        System.out.println("Бренд: " + brand + ". Модель: " + model + ". Год производства: " +
                prodactionYear + " год. Страна производства: " + prodactionCountry +
                ". Цвет: " + color + ". Максимальная скорость: " + maxSpeed +
                " км/ч. Цена за поездку: " + costRide + " рублей. Время в пути: " +
                time + ". Станция отбытия: " + startStation + ". Конечная остановка: " +
                endStation + ". Количество вагонов: " + carriage);
    }

    public void refill (){
        System.out.println("Информация по заправке: поезд нужно заправлять дизелем.");
    }
    }

