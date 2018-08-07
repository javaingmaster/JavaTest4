package com.hand.api.service.impl;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.context.ApplicationContext;

public class FilmServiceRollBack implements FilmService {
    private FilmMapper fm;

    public FilmServiceRollBack(){}

    @Override
    public void addFilm(Film film,ApplicationContext ac) {
        try {
            fm.save(film);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public FilmMapper getFm() {
        return fm;
    }

    public void setFm(FilmMapper fm) {
        this.fm = fm;
    }
}
