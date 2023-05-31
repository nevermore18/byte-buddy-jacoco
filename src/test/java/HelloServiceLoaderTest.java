import org.junit.jupiter.api.Test;
import org.example.Main;
import org.example.User;

class HelloServiceLoaderTest {

    @Test
    void func() {
        Main main = new Main();
        main.call();
        User user = new User();
        System.out.println(user.get());
    }

}