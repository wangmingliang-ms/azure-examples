/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.toolkit.example.connector.cosmos.cassandra.spring;

import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface PetRepository extends CassandraRepository<Pet, UUID> {
}
