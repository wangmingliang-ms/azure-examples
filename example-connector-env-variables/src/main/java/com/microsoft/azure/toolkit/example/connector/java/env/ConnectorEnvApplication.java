package com.microsoft.azure.toolkit.example.connector.java.env;

import java.util.Map;

public class ConnectorEnvApplication {
    public static void main(String... args) {
        Map<String, String> env = System.getenv();
        env.entrySet().stream()
                .filter(e -> e.getKey().startsWith("AZURE"))
                .forEach(e -> System.out.format("%s=%s%n", e.getKey(), e.getValue()));
    }
}
