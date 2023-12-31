package mx.com.pokedex.PokedexBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan({"mx.com.pokedex.controlador", "mx.com.pokedex.PokedexBack", "mx.com.pokedex.service"})
public class PokedexBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokedexBackApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
