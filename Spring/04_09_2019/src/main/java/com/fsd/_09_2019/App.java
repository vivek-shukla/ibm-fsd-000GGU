package com.fsd._09_2019;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fsd._09_2019.coach.Coach;
import com.fsd._09_2019.coach.CricketCoach;
import com.fsd._09_2019.employee.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context =null;
        context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach myCoach = context.getBean("theCoach",CricketCoach.class);
        myCoach.getWorkout();
        BeanFactory bean = new ClassPathXmlApplicationContext("applicationContext.xml");
        myCoach = bean.getBean("theCoach", CricketCoach.class);
        myCoach.getWorkout();
        context.close();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("employeeContext.xml");
        Employee emp = ctx.getBean("employeeObj", Employee.class);
        System.out.println(emp);
        System.out.println(emp.getAddress());
        System.out.println(emp.getEd());
        double salary = emp.getSalary();
        System.out.println(salary);
        
        System.out.println();
        
        
    }
}
