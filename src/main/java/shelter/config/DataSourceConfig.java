package shelter.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "shelter.persistence.repository")
public class DataSourceConfig {

}
