package com.hand.api.service;

import com.hand.domain.entity.Film;
import org.springframework.context.ApplicationContext;

public interface FilmService {
    public void addFilm(Film film,ApplicationContext ac);
}
