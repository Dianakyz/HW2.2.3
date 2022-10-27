package transport;

import javax.xml.validation.Validator;
import java.io.ObjectInputValidation;
import java.time.LocalDate;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Car extends Transport {
    private double engineVolume;
    private String gearBox;
    private final String bodeType;
    private String registrationNumber;
    private final int seats;
    private boolean summerRubber;

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keyLessAccess;

        public Key(boolean remoteEngineStart, boolean keyLessAccess){
            this.remoteEngineStart = remoteEngineStart;
            this.keyLessAccess = keyLessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number){
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost,1f);
            if (number == null) {
                this.number = "default";
            } else {
                this.number = number;
            }
        }
    }

    public Car(String brand, String model, int prodactionYear, String prodactionCountry, String color, int maxSpeed, double engineVolume, String gearBox, String bodeType, String registrationNumber, int seats, boolean summerRubber){
        super(brand,model, prodactionYear, prodactionCountry, color, maxSpeed);
        this.bodeType = ValidationUtils.validOrDefault(bodeType, "седан");
        this.seats = Math.max(seats,1);

        setEngineVolume(engineVolume);
        setGearBox(gearBox);
        setRegistrationNumber(registrationNumber);
        setSummerRubber(summerRubber);
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
        if(Double.compare(engineVolume,0) == 0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
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
        System.out.println("Марка авто: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume + ". Цвет кузова: " + color + ". Год производства: " + prodactionYear + ". Страна сборки: " + prodactionCountry + "." +
                "Тип еоробки передач: " + gearBox + ". Тип кузова: " + bodeType + ". Регистрационный номер: " + registrationNumber + ". Количество сидений: " + seats + ". Резина летняя: " + summerRubber);
    }

    public void changeRubber(){
        summerRubber = !summerRubber;
    }

    public boolean isRegValid(){
        if (this.registrationNumber.length() != 9){
            return false;
        }
        char[] regNumberChars = this.registrationNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumber(regNumberChars[4])
                && isNumber(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private  boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol){
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    public void setSummerRubber(boolean summerRubber) {
        this.summerRubber = summerRubber;
    }

    public void refill (){
        System.out.println("Информация по заправке автомобилей: можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
    }
}
