package co.com.blocks.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "co.com.blocks.repository")
@Configuration
public class MongoDBConfiguration {

}
