package com.zoezn.bancoservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BancoController {

    @Value("${max_efectivo}")
    private Double maxEfectivo;

    @Value("${denominaciones_billetes}")
    private String[] denominaciones;

    @RequestMapping(method = RequestMethod.GET, path ="/banco/caja/efectivo")
    public Map<String, String> mensajeEfectivo() {
        Map<String, String> response = new HashMap<>();

        response.put("Maximo efectivo permitido", maxEfectivo);


        return response;
    }
    @RequestMapping(method = RequestMethod.GET, path ="/banco/caja/denominaciones")
    public Map<String, String> mensajeDenominaciones() {
        Map<String, String> response = new HashMap<>();

        int i = 1;
        for (String d:denominaciones) {
            response.put("Denominacion" + i, d);
            i++;
        }

        return response;
    }

}
