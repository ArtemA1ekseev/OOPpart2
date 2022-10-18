import homework.Car;
import homework.Flower;
import homework.Human;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human(1987, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(1993, "Аня", null, "методист образовательных программ");
        Human katya = new Human(-1994, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань", null);

        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.getTown() + ". Я родился в " + maksim.getYearOfBirth() + " году. Я работаю на должности " + maksim.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + ". Я из города " + anna.getTown() + ". Я родился в " + anna.getYearOfBirth() + " году. Я работаю на должности " + anna.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.getTown() + ". Я родился в " + katya.getYearOfBirth() + " году. Я работаю на должности " + katya.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.getTown() + ". Я родился в " + artem.getYearOfBirth() + " году. Я работаю на должности " + artem.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.getTown() + ". Я родился в " + artem.getYearOfBirth() + " году. Я работаю на должности " + artem.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + vladimir.name + ". Я из города " + vladimir.getTown() + ". Я родился в " + vladimir.getYearOfBirth() + " году. Я работаю на должности " + vladimir.job + ". Будем знакомы!");

        System.out.println(" ");

        Car ladaGranta = new Car("Lada", null, 1.7, "желтый", 2015, "России");
        System.out.println("Бренд автомобиля — " + ladaGranta.brand + ", модель — " + ladaGranta.model + ", сборка в " + ladaGranta.productionCountry + ", цвет кузова — " + ladaGranta.color + ", объем двигателя — " + ladaGranta.engineVolume + " л, год выпуска — " + ladaGranta.productionYear + ".");

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 0, "черный", 2020, "Германии");
        System.out.println("Бренд автомобиля — " + audiA8.brand + ", модель — " + audiA8.model + ", сборка в " + audiA8.productionCountry + ", цвет кузова — " + audiA8.color + ", объем двигателя — " + audiA8.engineVolume + " л, год выпуска — " + audiA8.productionYear + ".");

        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021, "Германии");
        System.out.println("Бренд автомобиля — " + bmwZ8.brand + ", модель — " + bmwZ8.model + ", сборка в " + bmwZ8.productionCountry + ", цвет кузова — " + bmwZ8.color + ", объем двигателя — " + bmwZ8.engineVolume + " л, год выпуска — " + bmwZ8.productionYear + ".");

        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 0, null);
        System.out.println("Бренд автомобиля — " + kiaSportage.brand + ", модель — " + kiaSportage.model + ", сборка в " + kiaSportage.productionCountry + ", цвет кузова — " + kiaSportage.color + ", объем двигателя — " + kiaSportage.engineVolume + " л, год выпуска — " + kiaSportage.productionYear + ".");

        Car hyundaiAvante = new Car(null, "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
        System.out.println("Бренд автомобиля — " + hyundaiAvante.brand + ", модель — " + hyundaiAvante.model + ", сборка в " + hyundaiAvante.productionCountry + ", цвет кузова — " + hyundaiAvante.color + ", объем двигателя — " + hyundaiAvante.engineVolume + " л, год выпуска — " + hyundaiAvante.productionYear + ".");

        Flower rosa = new Flower(null, "Голандия", 35.59);
        Flower hrizantema = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower hypsofila = new Flower(null, "Турция", 19.5, 10);

        printInfo(rosa);
        printInfo(hrizantema);
        printInfo(pion);
        printInfo(hypsofila);

        System.out.println(" ");

        printCostFlowers(
                rosa, rosa, rosa,
                hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                hypsofila
        );
    }

    private static void printInfo(Flower flower){
        System.out.println("Цвет: " + flower.getFlowerColor() +
                ", страна: " + flower.getCountry() +
                ", стоимость за штуку: " + flower.getCost() +
                ", срок жизни цветка: " + flower.lifeSpan +
                ".");
    }

    private static void printCostFlowers(Flower... flowers){
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower: flowers) {
            if (flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Стоимость букета: %.2f.", totalCost);
        System.out.println();
        System.out.println("Срок стояния букета: " + minLifeSpan);
    }
}