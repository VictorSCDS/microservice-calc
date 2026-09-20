package com.example.mult;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@SpringBootApplication
@RestController
public class MultApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultApplication.class, args);
    }

    @GetMapping("/mult")
    public Map<String, Object> multiply(@RequestParam("op1") double op1, @RequestParam("op2") double op2) {
        Map<String, Object> response = new HashMap<>();
        response.put("operacao", "multiplicacao");
        response.put("resultado", op1 * op2);
        System.out.println("Requisição processada");
        return response;
    }
}
