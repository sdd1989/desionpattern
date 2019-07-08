package com.ql.prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
        Client client = new Client(concretePrototype1);
        client.operation();
    }
}
