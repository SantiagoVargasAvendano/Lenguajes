import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service simpleService = (Service) context.getBean("simpleServiceProxy");
        simpleService.sayHello();
        context.close();

    }
}