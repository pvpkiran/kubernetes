package in.phani.springboot.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ch.sbb.esta.openshift.gracefullshutdown.GracefulshutdownSpringApplication;

@SpringBootApplication
public class KubernetesApplication {

    public static void main(String[] args) {
        //SpringApplication.run(KubernetesApplication.class, args);
        GracefulshutdownSpringApplication.run(KubernetesApplication.class, args);
    }

}
