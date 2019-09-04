package com.fsd._09_2019_annotationAndXML;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fsd._09_2019_annotationAndXML.bean.Director;
import com.fsd._09_2019_annotationAndXML.bean.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory ctx = new ClassPathXmlApplicationContext("directorContext.xml");
//        Director director = (Director) ctx.getBean("theDirector");
//        director.setName("Alfonso Cuaron");
//        director.setFavoriteMovie("Children of Men");
//        System.out.println(director.getName());
        Movie movie =  (Movie) ctx.getBean("movie");
        System.out.println(movie);
        System.out.println(movie.getDirectedBy());
    }
}
