package io.brookrock.hibernate;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import io.brookrock.hibernate.id.SnowflakeProperties;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(SnowflakeProperties.class)
@EntityScan
public class HibernateBuddyConfiguration {

}