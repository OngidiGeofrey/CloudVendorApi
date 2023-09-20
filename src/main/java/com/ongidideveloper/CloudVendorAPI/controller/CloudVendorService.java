package com.ongidideveloper.CloudVendorAPI.controller;

import com.ongidideveloper.CloudVendorAPI.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorService {

    CloudVendor cloudVendor;
   @PostMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
                return cloudVendor;
//                        new CloudVendor("C1","CVX","Address 1","254748974489");
    }
    @PostMapping("create")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
       this.cloudVendor=cloudVendor;
       return "Cloud Vendor created successfully";
    }
    @PutMapping("edit/{id}")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor updated successfully";
    }

}
