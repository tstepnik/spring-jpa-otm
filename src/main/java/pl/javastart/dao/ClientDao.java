package pl.javastart.dao;

import org.springframework.stereotype.Repository;
import pl.javastart.model.Client;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ClientDao extends GenericDao<Client,Long> {
}
