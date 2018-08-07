package com.hand.domain.Listener;

import com.hand.domain.Event.AfterInsertFilmEvent;
import org.springframework.context.ApplicationListener;

public class AfterEventListener implements ApplicationListener<AfterInsertFilmEvent> {
    @Override
    public void onApplicationEvent(AfterInsertFilmEvent afterInsertFilmEvent) {
        System.out.println(afterInsertFilmEvent.getMsg());
    }
}
