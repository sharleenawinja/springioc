package dev.hellospring.config;

import dev.hellospring.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("courseService")
    public CourseService getCourseService() {
        return new CourseService();
    }
}
