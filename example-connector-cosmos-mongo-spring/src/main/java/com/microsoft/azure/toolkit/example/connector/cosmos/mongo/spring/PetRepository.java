/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.toolkit.example.connector.cosmos.mongo.spring;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface PetRepository extends MongoRepository<Pet, UUID> {
}
