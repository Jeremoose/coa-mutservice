package nl.coa;

import nl.coa.mqclient.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MutServiceApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MutServiceApplication.class, args);

//        Client client = new Client();
//        client.listen();
    }

}