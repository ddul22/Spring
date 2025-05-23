package com.yedam.app.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    			new AnnotationConfigApplicationContext(ContextConfigure.class);
//    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	//상속과 다형성
    	//같은코드지만 참조하는 대상에 따라서 실행결과 다름
        //LgTv tv = newLgtv();
    	TV tv = (TV)context.getBean("tv");
    	tv.powerOn();
    	tv.volumeUp();
    }
}
