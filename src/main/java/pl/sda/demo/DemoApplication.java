package pl.sda.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.sda.demo.Configuration.Configuration;

@SpringBootApplication
@EntityScan("pl.sda.apka.model")
@EnableJpaRepositories("pl.sda.demo.Repository")
@Import(Configuration.class)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }
}
