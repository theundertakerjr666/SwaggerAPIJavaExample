package com.employee;

import io.swagger.jaxrs.config.BeanConfig;

import javax.servlet.ServletConfig;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

@ApplicationPath("/api")
public class MyApplication extends Application {
    public MyApplication(@Context ServletConfig servletConfig) {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setTitle("SwaggerAPIJavaExample API");
        beanConfig.setBasePath("/SwaggerAPIJavaExample/api");
        beanConfig.setResourcePackage("com.employee");
        beanConfig.setScan(true);
    }
}
