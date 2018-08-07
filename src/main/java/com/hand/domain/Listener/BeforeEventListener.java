package com.hand.domain.Listener;

import com.hand.domain.Event.BeforeInsertFilmEvent;
import org.springframework.context.ApplicationListener;

public class BeforeEventListener implements ApplicationListener<BeforeInsertFilmEvent> {
    @Override
    public void onApplicationEvent(BeforeInsertFilmEvent beforeInsertFilmEvent) {
        System.out.println(beforeInsertFilmEvent.getMsg());
    }
}
