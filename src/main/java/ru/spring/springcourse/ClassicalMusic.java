package ru.spring.springcourse;


public class ClassicalMusic implements Music {
    private  ClassicalMusic() { }// ограничили создание объектов класса напрямую чз операто new

    public static ClassicalMusic getClassicalMusic() { // паттерн factory method для созд объектов Кл
        return new ClassicalMusic();
    }

    public void doMyInit() { // init
        System.out.println("Do my initialization");
    }

    public void doMyDestroy() { // destroy
        System.out.println("Do my destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
