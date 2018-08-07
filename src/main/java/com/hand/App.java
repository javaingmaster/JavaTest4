package com.hand;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    private static String title;
    private static String des;
    private static int lang;
    static {
        title=System.getenv("title");
        des=System.getenv("description");
        lang=Integer.parseInt(System.getenv("languageId"));
    }
    public static void main( String[] args )
    {

        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("start");

        FilmService filmService=(FilmService) ac.getBean("filmService");
        FilmService filmServiceRoll=(FilmService) ac.getBean("filmServiceRollBack");

        System.out.println("Film Title:");
        System.out.println(title);
        System.out.println("Film Description:");
        System.out.println(des);
        System.out.println("Film LanguageId:");
        System.out.println(lang);

        //film用作事务回滚测试,该插入数据得language_id取值过大会抛出异常，触发回滚
        Film film=new Film("ttt","rollback2",1997);
        //film2为正常添加对象
        Film film2=new Film(title,des,lang);

        filmServiceRoll.addFilm(film,ac);
        filmService.addFilm(film2,ac);

        System.out.println("stop");
        ((ClassPathXmlApplicationContext) ac).close();
    }
}
