package src.main.java;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.luckdraw.client.repository", repositoryFactoryBeanClass = JpaRepositoryStrongFactory.class)
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}