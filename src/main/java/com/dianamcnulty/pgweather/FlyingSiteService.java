//package com.dianamcnulty.pgweather;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class FlyingSiteService {
//	@Autowired
//	private FlyingSiteRepository flyingSiteRepository;
//	public List<FlyingSiteRecord> getAllFlyingSites(){
//		List<FlyingSiteRecord> flyingSiteRecords = new ArrayList<>();
//		flyingSiteRepository.findAll().forEach(flyingSiteRecords::add);
//		return flyingSiteRecords;
//	}
//	public FlyingSiteRecord getFlyingSite(String id) {
//		return flyingSiteRepository.findOne(id);
//	}
//	public void addFlyingSite(FlyingSiteRecord flyingSiteRecord) {
//		flyingSiteRepository.save(flyingSiteRecord);
//	}
//	public void delete(String id) {
//		flyingSiteRepository.delete(id);
//	}
//
//}
