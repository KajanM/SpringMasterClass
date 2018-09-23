package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.examplebeans.FakeDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {
    private static Logger logger = LoggerFactory.getLogger(DiDemoApplication.class);

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

//		System.out.println(controller.hello());
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean("fakeDataSource");

        logger.debug("user: " + fakeDataSource.getUser());
        logger.debug("password: " + fakeDataSource.getPassword());
        logger.debug("url: " + fakeDataSource.getUrl());
	}
}
