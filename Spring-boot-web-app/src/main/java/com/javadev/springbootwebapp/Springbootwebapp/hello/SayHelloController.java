package com.javadev.springbootwebapp.Springbootwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello World";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Example</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<p>This is an example of a simple HTML page with one paragraph.</p>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

	@RequestMapping("say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}

}
