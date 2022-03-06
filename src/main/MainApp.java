package main;

import bean.EncryptWithDependency;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:META-INF/beans.xml");
        BeanFactory factory = context;
        EncryptWithDependency test = (EncryptWithDependency) factory
                .getBean("EncryptWithDependency");
        test.run();
    }
}
