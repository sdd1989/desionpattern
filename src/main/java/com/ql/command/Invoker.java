package com.ql.command;

public class Invoker {

    Command command;


    public Invoker(Command command) {
        this.command = command;
    }

    public void sendCommand(){
        command.command();
    }
}
