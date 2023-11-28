package org.microsoft.azure.toolkit.example.connector.keyvault.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class KeyVaultController {

    @Value("${spring.datasource.password}")
    private String password;

    @GetMapping("/password")
    public String getPassword() throws IOException {
        return password;
    }
}