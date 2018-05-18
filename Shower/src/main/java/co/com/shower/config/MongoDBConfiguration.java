package co.com.shower.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "co.com.shower.repository")
@Configuration
public class MongoDBConfiguration {

}
