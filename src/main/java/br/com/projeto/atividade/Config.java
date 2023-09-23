package br.com.projeto.atividade;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "appSalgado")
    public String appTema() {
        return "salgado";
    }

    @Bean(name = "appDoce")

    public String appAnoNascimento() {
        return "doce";
    }
}