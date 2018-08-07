package com.hand.domain.Event;

import org.springframework.context.ApplicationEvent;

public class BeforeInsertFilmEvent extends ApplicationEvent {
    private String msg;

    public BeforeInsertFilmEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public void sys(){
        System.out.println(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
