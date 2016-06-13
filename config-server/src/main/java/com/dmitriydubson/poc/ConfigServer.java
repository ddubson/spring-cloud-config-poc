package com.dmitriydubson.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * Config Server
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigServer
{
    public static void main( String[] args )
    {
        System.out.println( "Config Server Starting." );
        SpringApplication.run(ConfigServer.class, args);
    }
}
