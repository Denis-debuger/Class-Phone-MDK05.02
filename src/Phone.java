import java.util.Scanner;

public class Phone {
    private String number;
    private String name;
    private double weight;
    private String model;

    // Конструктор с четырьмя параметрами
    public Phone(String number, String name, double weight, String model) {
        this.number = number;
        this.name = name;
        this.weight = weight;
        this.model = model;
    }

    // Пустой конструктор
    public Phone() {
    }

    // Конструктор с двумя параметрами (номер и модель)
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // Метод для получения звонка
    public void getReceiveCall() {
        System.out.println("Звонит " + name);
    }

    // Метод для получения номера телефона
    public void getNumber() {
        System.out.println("Номер телефона: " + number);
    }

    // Метод для получения имени
    public void getName() {
        System.out.println("Имя: " + name);
    }

    // Метод для получения веса телефона
    public void getWeight() {
        System.out.println("Вес телефона: " + weight + " кг");
    }

    // Метод для получения модели телефона
    public void getModel() {
        System.out.println("Модель телефона: " + model);
    }

    // Сеттеры для всех полей
    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1-й способ: через конструктор с четырьмя параметрами
        Phone phone1 = new Phone("+7-123-456-78-90", "Иван", 1.5, "iPhone 13");
        System.out.println("Phone1 (через конструктор с четырьмя параметрами):");
        phone1.getReceiveCall();
        phone1.getNumber();
        phone1.getModel();
        phone1.getWeight();

        // 2-й способ: через пустой конструктор и сеттеры
        Phone phone2 = new Phone();
        System.out.println("\nВведите данные для phone2 (пустой конструктор и сеттеры):");
        System.out.print("Введите номер телефона: ");
        phone2.setNumber(scanner.nextLine());
        System.out.print("Введите имя владельца: ");
        phone2.setName(scanner.nextLine());
        System.out.print("Введите вес телефона: ");
        phone2.setWeight(scanner.nextDouble());
        scanner.nextLine(); // Очищаем буфер после nextDouble()
        System.out.print("Введите модель телефона: ");
        phone2.setModel(scanner.nextLine());

        // Вызов методов для phone2
        System.out.println("\nPhone2:");
        phone2.getReceiveCall();
        phone2.getNumber();
        phone2.getModel();
        phone2.getWeight();

        // 3-й способ: через конструктор с двумя параметрами и сеттеры для остальных
        Phone phone3 = new Phone("+7-555-444-33-22", "Xiaomi");
        phone3.setName("Ольга");
        phone3.setWeight(1.7);
        System.out.println("\nPhone3 (через конструктор с двумя параметрами и сеттеры для остальных):");
        phone3.getReceiveCall();
        phone3.getNumber();
        phone3.getModel();
        phone3.getWeight();

        // Закрываем Scanner
        scanner.close();
    }
}
