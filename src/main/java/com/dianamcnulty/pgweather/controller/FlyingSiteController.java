package com.dianamcnulty.pgweather.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dianamcnulty.pgweather.models.FlyingSite;
import com.dianamcnulty.pgweather.models.FlyingSiteRepository;

@RestController
@CrossOrigin
public class FlyingSiteController {
	@Autowired 	
	private FlyingSiteRepository flyingSiteRepository;
//	private FlyingSiteService flyingSiteService;
	
	
	@RequestMapping("/")
	public Map<String, Object> readAll() {
		  List<FlyingSite> flyingSites = flyingSiteRepository.findAll();
		  Map<String, Object> dataMap = new HashMap<String, Object>();
		  dataMap.put("message", "Site found successfully");
		  dataMap.put("totalSites", flyingSites.size());
		  dataMap.put("status", "1");
		  dataMap.put("flyingSites", flyingSites);
		     return dataMap;
		 }
	
//	public List<FlyingSiteRecord> getAllFlyingSites(){
//		return flyingSiteService.getAllFlyingSites();
//	}
	@RequestMapping(value = "/add-site", method = RequestMethod.POST)
	public Map<String,Object> create( FlyingSite flyingSite){
		flyingSiteRepository.save(flyingSite);
//		return new ResponseEntity<>("Saved", HttpStatus.OK);
		Map<String,Object> dataMap = new HashMap<String,Object>();
		 dataMap.put("message", "Flying Site created successfully");
		  dataMap.put("status", "1");
		  dataMap.put("flyingSite", flyingSite);
		     return dataMap;
	}
	
	
//	public void addFlyingSite(@RequestBody FlyingSiteRecord flyingSiteRecord) {
//		flyingSiteService.addFlyingSite(flyingSiteRecord);
//	}
	@RequestMapping(value = "/site/", method = RequestMethod.GET)
	public Map<String, Object> read(@RequestParam String id){
	FlyingSite flyingSite = (FlyingSite) flyingSiteRepository.findOne(id);
	Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Site found successfully");
	  dataMap.put("status", "1");
	  dataMap.put("flyingSite", flyingSite);
	     return dataMap;
//	public FlyingSiteRecord getFlyingSite(@PathVariable String id){
//		return flyingSiteService.getFlyingSite(id);
	}
	@RequestMapping(value = "/delete-site/", method = RequestMethod.DELETE)
	 public Map<String, Object> delete(@RequestParam String id) {
		  flyingSiteRepository.delete(id);
		  Map<String, Object> dataMap = new HashMap<String, Object>();
		  dataMap.put("message", "site deleted successfully");
		  dataMap.put("status", "1");
		     return dataMap;
		 }
	
//	public void delete(@PathVariable String id){
//		flyingSiteService.delete(id);
//	}

}
