package ru.ezhov.springlearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.ezhov.springlearning.book.domain.model.BookRepository;
import ru.ezhov.springlearning.book.infrastructure.repository.InMemoryBookRepository;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class ApplicationConfiguration {
    @Bean
    public Docket swagger() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }


    @Profile("prod")
    @Bean(initMethod = "generateBooks")
    public BookRepository fileBookRepository() {
        System.out.println("--------------PROD---------------");
        return new InMemoryBookRepository();
    }
}
