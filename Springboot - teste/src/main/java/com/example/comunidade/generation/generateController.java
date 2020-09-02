package com.example.comunidade.generation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/generate")

public class generateController {
	@GetMapping
	public String generate()
	{
		return "Os laços que criamos durante a nossa vida vai nos moldando, nem sempre bom mas também nem sempre ruim, apenas muda. Essa é a diferença que fez na minha vida";
	}
		

}
