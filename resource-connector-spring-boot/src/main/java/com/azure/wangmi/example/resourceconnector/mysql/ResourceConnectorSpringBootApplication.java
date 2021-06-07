package com.azure.wangmi.example.resourceconnector.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResourceConnectorSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceConnectorSpringBootApplication.class, args);
        // String url ="jdbc:mysql://qianjin-mysql.mysql.database.azure.com:3306/information_schema?useSSL=true&requireSSL=false";
        // myDbConn = DriverManager.getConnection(url, "qianjin@qianjin-mysql", {your_password});
    }
}
