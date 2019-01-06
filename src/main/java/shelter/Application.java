package shelter;

import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Setter
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class);
    }
}
