/**
 * 
 */
package com.yntech;

import javax.security.auth.message.config.AuthConfigFactory;

import org.apache.catalina.authenticator.jaspic.AuthConfigFactoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author DiaoWenbo
 * 2017年11月6日 下午2:11:49
 */
@Controller
@EnableAutoConfiguration
public class DemoController {
	@RequestMapping("/sb/demo")
	@ResponseBody
    public String greeting() {
		System.out.println("ssssssss");
        return "Hello World!";
    }
	
	public static void main(String[] args) throws Exception {
		/*if (AuthConfigFactory.getFactory() == null) {
            AuthConfigFactory.setFactory(new AuthConfigFactoryImpl());
        }*/
        SpringApplication.run(DemoController.class, args);
    }
}
