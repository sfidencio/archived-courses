package br.com.alura.exemplo.annotations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/teste")
@Slf4j
public class ExemploAnnotationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemploAnnotationsApplication.class, args);
    }


    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Cliente obter() {
        return new Cliente(1l,"Diogo");
    }



    /*public CommandLineRunner runner() {
        return args -> {
            System.out.println("OK");
        };
    }*/

}



