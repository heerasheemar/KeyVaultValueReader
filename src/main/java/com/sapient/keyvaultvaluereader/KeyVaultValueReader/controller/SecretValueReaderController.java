package com.sapient.keyvaultvaluereader.KeyVaultValueReader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.security.keyvault.secrets.SecretClient;

@RestController
public class SecretValueReaderController {
	
	// Spring Cloud Azure will automatically inject SecretClient in your ApplicationContext.
// 	@Autowired
//     private SecretClient secretClient;
	
	@GetMapping("/")
	public String welcome() {
		return "Secret Value Reader App to read from Azure Key Vault";
	}
	
// 	@GetMapping("/secret")
// 	public String getSecretValue() {
// 		return "Secret Value from Azure Key Vault is: "+secretClient.getSecret("servicesecret").getValue();
// 	}
}
