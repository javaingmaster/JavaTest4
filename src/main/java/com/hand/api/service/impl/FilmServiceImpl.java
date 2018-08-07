package com.hand.api.service.impl;

import com.hand.api.service.FilmService;
import com.hand.domain.Event.AfterInsertFilmEvent;
import com.hand.domain.Event.BeforeInsertFilmEvent;
import com.hand.domain.entity.Film;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.context.ApplicationContext;

public class FilmServiceImpl implements FilmService {
    private FilmMapper fm;

    public FilmServiceImpl(){}

    @Override
    public void addFilm(Film film,ApplicationContext ac) {
        BeforeInsertFilmEvent before=new BeforeInsertFilmEvent(this,"Before Insert Film Data");
        ac.publishEvent(before);
        fm.save(film);
        AfterInsertFilmEvent after=new AfterInsertFilmEvent(this,"After Insert Film Data");
        ac.publishEvent(after);
    }

    public FilmMapper getFm() {
        return fm;
    }

    public void setFm(FilmMapper fm) {
        this.fm = fm;
    }
}
