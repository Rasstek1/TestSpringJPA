package com.martin.testspringjpa.config;

import com.martin.testspringjpa.Data.EtudiantRepository;
import com.martin.testspringjpa.models.EtudiantDataContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestJPAConfig {
    @Bean
    public EtudiantDataContext etudiantDataContext(EtudiantRepository etudiantReposirory){
        return new EtudiantDataContext(etudiantReposirory);
    }
}
