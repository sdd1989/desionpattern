package com.ql.command;

public class Client {


    public static void main(String[] args) {
        Reviver reviver = new Reviver();
        ConcreteCommand concreteCommand = new ConcreteCommand(reviver);
        Invoker invoker = new Invoker(concreteCommand);
        invoker.sendCommand();
    }

}
