package com.hand.domain.Event;

import org.springframework.context.ApplicationEvent;

public class AfterInsertFilmEvent extends ApplicationEvent {
    private String msg;

    public AfterInsertFilmEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
