package com.ongidideveloper.CloudVendorAPI.controller;

import com.ongidideveloper.CloudVendorAPI.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorService {

   @PostMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
                return new CloudVendor("C1","CVX","Address 1","254748974489");

    }

}
