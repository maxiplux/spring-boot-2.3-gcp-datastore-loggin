package com.livemarket.business.gcp.gcpexample.repository;

import com.livemarket.business.gcp.gcpexample.models.Dog;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends DatastoreRepository<Dog, Long> {}
