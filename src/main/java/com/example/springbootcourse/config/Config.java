package com.example.springbootcourse.config;

import com.example.springbootcourse.beans.DependentBin;
import com.example.springbootcourse.beans.EnvVarNotDefaultBean;
import com.example.springbootcourse.beans.TestBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    @Profile("test")
    public TestBean testBean() {
        return new TestBean();
    }

    @Bean
    @ConditionalOnBean(value = TestBean.class)
    public DependentBin dependentBin() {
        return new DependentBin();
    }

    @Bean
    @ConditionalOnExpression("'${app.env-var}' != 'default'")
    public EnvVarNotDefaultBean envVarNotDefaultBean() {
        return new EnvVarNotDefaultBean();
    }
}
