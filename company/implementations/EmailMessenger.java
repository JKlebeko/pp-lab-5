package company.implementations;

import company.interfaces.Messanger;

import javax.annotation.processing.Messager;

public class EmailMessenger implements Messanger {


    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
