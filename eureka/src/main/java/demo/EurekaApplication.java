package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;
import sun.rmi.runtime.Log;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    private static final Logger LOG = LoggerFactory.getLogger(EurekaApplication.class);



    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EurekaApplication.class);
        Environment env = application.run(args).getEnvironment();
        LOG.info("start application");
        LOG.info("Eureka address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

    }

