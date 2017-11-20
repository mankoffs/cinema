package сom.manko.cinema.movie.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringCloudApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class MovieApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class);
    }
}
