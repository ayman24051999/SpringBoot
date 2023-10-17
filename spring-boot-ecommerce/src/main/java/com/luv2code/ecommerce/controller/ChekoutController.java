package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.dto.Purchase;
import com.luv2code.ecommerce.dto.PurchaseResponse;
import com.luv2code.ecommerce.service.ChekoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping ("/api/chekout")
public class ChekoutController {

    private ChekoutService chekoutService;

    @Autowired
    public ChekoutController(ChekoutService chekoutService){

        this.chekoutService = chekoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder (@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = chekoutService.placeOrder(purchase);
        return  purchaseResponse;
    }


}
