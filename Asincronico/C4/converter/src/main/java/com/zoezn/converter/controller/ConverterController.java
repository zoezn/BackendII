package com.zoezn.converter.controller;

import com.zoezn.converter.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("converter")
public class ConverterController {

    @Autowired
    private ConverterService converterService;

/*    @GetMapping("?from={from}&to={to}")*/
    @GetMapping()
    public String getCurrencyConverted(@RequestParam String from, @RequestParam String to){
        Double result = converterService.convertCurrency(from, to);
        return "From: " + from + " To: " + to + " = " + result;
    }
}
