/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.toolkit.example.connector.postgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectorPostgreSqlApplication {

    public static void main(String[] args) throws SQLException {
        final String prefix = "AZURE_POSTGRE_";
        final String url = System.getenv(prefix + "URL");
        final String username = System.getenv(prefix + "USERNAME");
        final String password = System.getenv(prefix + "PASSWORD");
        final long start = System.currentTimeMillis();
        final Connection connection = DriverManager.getConnection(url, username, password);
        boolean connected = true;
        final Statement statement = connection.createStatement();
        final ResultSet resultSet = statement.executeQuery("select 'hi'");
        if (resultSet.next()) {
            final String result = resultSet.getString(1);
            connected = "hi".equals(result);
        }
        long pingCost = System.currentTimeMillis() - start;
        System.out.println("URL:\t\t" + url);
        System.out.println("USERNAME:\t" + username);
        System.out.println("connected:\t" + connected);
        System.out.println("pingCost:\t" + pingCost);
    }
}
