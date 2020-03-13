package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.dao.ClientDao;
import pl.javastart.dao.OrderDao;
import pl.javastart.dao.ProductDao;
import pl.javastart.model.Client;
import pl.javastart.model.Order;
import pl.javastart.model.Product;

@SpringBootApplication
public class SpringJpaOtmApplication {

    public static void main(String[] args) throws InterruptedException{
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaOtmApplication.class, args);

        Client client = new Client("Jan", "Kowalski", "Krakowskie przedmieście 23, Warszawa");
        Order order = new Order("z dostawą do domu");
        Product product1 = new Product("Telewizor LG 42'", 4800.0, "dolby surround");
        Product product2 = new Product("Telefon Apple iPhone SE", 2200.0, "pokrowiec gratis");
        order.getProducts().add(product1);
        order.getProducts().add(product2);
        client.getOrders().add(order);

        ClientDao clientDao = ctx.getBean(ClientDao.class);
        clientDao.save(client);

        ctx.close();
    }
}
