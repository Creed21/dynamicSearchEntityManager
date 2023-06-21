package with.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(basePackages = "with.hibernate.model.*")
//@EnableJpaRepositories("with.hibernate.repository")
//@EntityScan("with.hibernate.model")
public class DynamicQuery {
    public static void main(String[] args) {
        SpringApplication.run(DynamicQuery.class, args);
    }
}
