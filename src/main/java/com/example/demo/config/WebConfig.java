package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by Андрей on 10.06.2017.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/site/index");

        registry.addViewController("/site/index")
                .setViewName("site/index");
    }

//    @Bean
//    public ViewResolver viewResolver() {
//        UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
//        urlBasedViewResolver.setViewClass(JstlView.class);
//        urlBasedViewResolver.setPrefix("/WEB-INF/templates/");
//        urlBasedViewResolver.setSuffix(".jspx");
//
//        return urlBasedViewResolver;
//    }
}
