package com.cropdealapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropdealapplication.models.Admin;
import com.cropdealapplication.models.Dealer;
import com.cropdealapplication.models.Farmer;
import com.cropdealapplication.repo.AdminRepo;
import com.cropdealapplication.repo.DealerRepo;
import com.cropdealapplication.repo.FarmerRepo;



@RestController
@RequestMapping("/CropDeal")
public class CropdealController {
	//This is for the Dealer
	@Autowired
	   DealerRepo repo;
	
	@Autowired
	   FarmerRepo repo1;
	
	@Autowired
	   AdminRepo repo2;
	//DEALER---------------------------------------------------
	   
	   @GetMapping("/Dealer/getDealer/{dealerid}")
	   public Optional<Dealer> getDealerProfileById(@PathVariable("dealerid") int dealerid){
		   return repo.findById(dealerid);
	   }
	   
	   
	   @PostMapping("/Dealer/saveProfile")
		   public void saveProfile(@RequestBody Dealer dealer) {
			   repo.insert(dealer);
		   }
	   
	   @PutMapping("/Dealer/updateProfile/{dealerid}")
	   public void updateDealer(@PathVariable("dealerid") int dealerid,@RequestBody Dealer dealer) {
		   repo.save(dealer);
	   }
	   
	 //ADMIN---------------------------------------------------
		
		@GetMapping("/Admin/getAdmin/{adminid}")
		   public Optional<Admin> getAdminProfileById(@PathVariable("adminid") int adminid){
			   return repo2.findById(adminid);
		   }
		@GetMapping("/Admin/getAdmins")
	    public List<Admin> getAllAdmins(){
			return repo2.findAll();
		}
		   @PostMapping("/Admin/saveProfile")
		   public void saveProfile(@RequestBody Admin admin) {
			  repo2.insert(admin);
		   }
		@PutMapping("/Admin/updateAdmin/{Adminid}")
		   public void updateAdmin(@PathVariable("adminid") int adminid,@RequestBody Admin admin) {
			   repo2.save(admin);
		   }
		
		//FARMER-------------------------------------------------
		   @GetMapping("/Farmer/getFarmer/{farmerid}")
		   public Optional<Farmer> getFarmerProfileById(@PathVariable("farmerid") int farmerid){
			   return repo1.findById(farmerid);
		   }
		   
		   
		   @PostMapping("/Farmer/saveProfile")
			   public void saveProfile(@RequestBody Farmer farmer) {
				   repo1.save(farmer);
			   }
		   
		   @PutMapping("/Farmer/updateProfile/{farmerid}")
		   public void updateFarmer(@PathVariable("farmerid") int farmerid,@RequestBody Farmer farmer) {
			   repo1.save(farmer);
		   }
		   
		   
		}
		


