/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.samples.spring;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;

import java.util.UUID;

public interface PetRepository extends ReactiveCosmosRepository<Pet, UUID> {
}
