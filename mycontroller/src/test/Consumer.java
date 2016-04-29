import com.yt.inter.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        UserService userService =  context.getBean(UserService.class);
        userService.hello("hehe");
    }

}  