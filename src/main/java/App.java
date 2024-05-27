import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean_2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat = applicationContext.getBean("catBean", Cat.class);
        Cat cat_2 = applicationContext.getBean("catBean", Cat.class);
        System.out.println("Результат сравнения bean.HelloWorld и bean_2.HelloWorld: " + (bean  ==  bean_2));
        System.out.println("Результат сравнения cat и cat_2: " + (cat == cat_2));

    }
}