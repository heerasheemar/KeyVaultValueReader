// package com.sapient.keyvaultvaluereader.KeyVaultValueReader.configs;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import com.azure.identity.DefaultAzureCredentialBuilder;
// import com.azure.security.keyvault.secrets.SecretClient;
// import com.azure.security.keyvault.secrets.SecretClientBuilder;

// @Configuration
// public class SecretClientConfiguration {
	
// 	@Value("${spring.cloud.azure.keyvault.secret.endpoint}")
// 	String endpoint;

//     @Bean
//     public SecretClient createSecretClient() {
//         return new SecretClientBuilder()
//             .vaultUrl(endpoint)
//             .credential(new DefaultAzureCredentialBuilder().build())
//             .buildClient();
//     }

// }
