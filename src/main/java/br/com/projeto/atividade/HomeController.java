package br.com.projeto.atividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	@Qualifier("appSalgado")
	private String appSalgado1;

	@Autowired
	@Qualifier("appDoce")
	private String appSalgado2;



	@GetMapping("/")
	public String home(ModelMap modelMap){
		modelMap.addAttribute("nomeDoAtributo", "Teste");
		return "home";
	}

	@GetMapping("/salgado")
	public String getAppSalgado1() {
		return appSalgado1;
	}

	@GetMapping("/doce")
	public String getAppSalgado2(){return appSalgado2;}

	public static void main(String[] args) {
		SpringApplication.run(HomeController.class, args);
	}
}
