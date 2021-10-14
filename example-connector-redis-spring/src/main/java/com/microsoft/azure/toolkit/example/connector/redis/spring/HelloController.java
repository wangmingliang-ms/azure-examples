/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */
package com.microsoft.azure.toolkit.example.connector.redis.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final StringRedisTemplate template;

    @Autowired
    public HelloController(StringRedisTemplate template) {
        this.template = template;
    }

    @RequestMapping("/")
    // Define the Hello World controller.
    public String hello() {

        ValueOperations<String, String> ops = this.template.opsForValue();

        // Add a Hello World string to your cache.
        String key = "greeting";
        if (Boolean.FALSE.equals(this.template.hasKey(key))) {
            ops.set(key, "Hello World!");
        }

        // Return the string from your cache.
        return ops.get(key);
    }
}