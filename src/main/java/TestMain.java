import org.example.bean.User;
import org.example.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserController userController = ((UserController) ac.getBean("userController"));

        User user = userController.queryUserByName("zk");

        System.out.println(user);

    }

}
