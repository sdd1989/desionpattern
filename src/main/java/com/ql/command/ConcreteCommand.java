package com.ql.command;

public class ConcreteCommand implements Command{

    public ConcreteCommand(Reviver reviver) {
        this.reviver = reviver;
    }

    Reviver reviver;

    @Override
    public void command() {
        reviver.excute();
    }
}
