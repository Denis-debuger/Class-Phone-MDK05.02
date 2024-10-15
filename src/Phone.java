import java.util.Scanner;

public class Phone {
    private String number;
    private String name;
    private double weight;
    private String model;

    public Phone(String number, String name, double weight, String model) {
        this.number = number;
        this.name = name;
        this.weight = weight;
        this.model = model;
    }

    public Phone(){

    }

    public Phone(String number,String model) {
        this.number = number;
        this.model = model;
    }

    public void getReceiveCall() {
        System.out.println("Звонит "+ name);
    }
    public void getNumber() {
        System.out.println("Номер телефона "+ number);
    }
    public void getName() {
        System.out.println("Имя " + name);
    }

    public void getWeight() {
        System.out.println("Вес телефона "+ weight);
    }
    public void getModel() {
        System.out.println("Модель телефона "+ model);
    }

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

    public static void main(String[] args){
        // Второй способ: через пустой конструктор и сеттеры
        Phone phone2 = new Phone();
        phone2.setNumber("+7-987-654-32-10");
        phone2.setName("Иван");
        phone2.setWeight(2.0);
        phone2.setModel("Samsung");
        phone2.getReceiveCall();
        phone2.getNumber();
        phone2.getModel();
        phone2.getWeight();

        // Третий способ: через конструктор с частичными параметрами
        Phone phone3 = new Phone("+7-555-444-33-22", "Xiaomi");
        phone3.setName("Ольга");
        phone3.setWeight(1.7);
        phone3.getReceiveCall();
        phone3.getNumber();
        phone3.getModel();
        phone3.getWeight();

        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone();


        /*String[] param = {
                "Введите модель", "Введите номер телефона", "Введите имя", "Введите вес"
        };

        // Цикл для динамического ввода значений
        for (int i = 0; i < param.length; i++) {
            System.out.println(param[i]);
            String input = scanner.nextLine();

            switch (i) {
                case 0 -> phone.setModel(input);
                case 1 -> phone.setNumber(input);
                case 2 -> phone.setName(input);
                case 3 -> phone.setWeight(Double.parseDouble(input));
            }
        }


        phone.getModel();
        phone.getNumber();
        phone.getName();
        phone.getWeight();*/
    }
}




// Phone phone = new Phone("+7-281-828-38-44", "Витёк", 2.15, "Samsung");
// phone.getReceiveCall();
// phone.getNumber();
// phone.getName();
// phone.getWeight();
// phone.getModel();
// Phone phone2 = new Phone();
// phone2.setModel(str);
        /*  String[] param = {
                "Введите модель", "Введите номер телефона", "Введите имя", "Введите вес"
        };

        for(String parameter : param){
            System.out.println(parameter);
            String str = scanner.nextLine();

        }*/








/*
public static void main(String[] args) {

}*/