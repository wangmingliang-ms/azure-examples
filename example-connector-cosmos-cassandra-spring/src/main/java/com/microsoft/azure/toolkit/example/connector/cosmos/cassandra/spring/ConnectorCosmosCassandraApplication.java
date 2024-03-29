/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.toolkit.example.connector.cosmos.cassandra.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = Pet.class)
public class ConnectorCosmosCassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectorCosmosCassandraApplication.class, args);
    }
}
