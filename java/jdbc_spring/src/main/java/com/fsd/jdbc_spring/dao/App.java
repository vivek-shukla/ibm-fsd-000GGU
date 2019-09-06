package com.fsd.jdbc_spring.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fsd.jdbc_spring.bean.Movie;
import com.fsd.jdbc_spring.configuration.ConfigurationClass;
import com.fsd.jdbc_spring.configuration.bean.NewMovieDao;

import com.fsd.jdbc_spring.configuration.bean.NewMovieClass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        NewMovieDao movieDao = (NewMovieDao) config.getBean("newMovieDao");
        NewMovieClass newMovie = new NewMovieClass("Dark Night rISES","cHRIS nOLAN");
        movieDao.insertMovie(newMovie); 
        List<NewMovieClass> movieList = movieDao.fetchEmployee();
        for(NewMovieClass movie:movieList)
        {
        	System.out.println(movie.getName()+" "+movie.getDirector());
        }
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("annotationContext.xml");
////        MovieDao movieDao = (MovieDao) ctx.getBean("movieDaoObj");
//        MovieAnnotedDao movieAnnotatedObj = ctx.getBean("movieAnnotedDao",MovieAnnotedDao.class);
//        
////        try {
////			movieDao.insertMovie(new Movie("Children of Men","Alfonso Cuaron"));
//        	movieAnnotatedObj.insertMovie(new Movie("Pulp Fiction","Quentin Tarantino"));
////		} 
//        
////        catch (SQLException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////        System.out.println("Enter movie name or director to delete");
//        Scanner scanner = new Scanner(System.in);
////        String deleteCriteria = scanner.next();
////        movieAnnotatedObj.deleteMovie(deleteCriteria);
//        System.out.println("Enter id to update");
//        int id=scanner.nextInt();
//        String name= scanner.next();
//        String director = scanner.next();
//        Movie movie = new Movie(name,director);
//        movie.setId(id);
//        movieAnnotatedObj.update(movie);
//        System.out.println("Showing all employuee");
        
    }
}
