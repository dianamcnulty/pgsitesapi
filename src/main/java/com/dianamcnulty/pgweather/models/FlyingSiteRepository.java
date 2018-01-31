package com.dianamcnulty.pgweather.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FlyingSiteRepository extends MongoRepository<FlyingSite, String>{
	public FlyingSite findById(String Id);
}
