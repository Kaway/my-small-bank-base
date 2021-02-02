package fr.paris8.iutmontreuil.mysmallbank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
public class MySmallBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySmallBankApplication.class, args);
    }

    @Bean
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
        return builder
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .build();
    }

}
