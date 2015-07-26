package be.nijs.cinnamon.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"be.nijs.cinnamon"})
@EnableJpaRepositories("be.nijs.cinnamon.core")
public class cinnamonApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(cinnamonApplication.class, args);
    }
}
