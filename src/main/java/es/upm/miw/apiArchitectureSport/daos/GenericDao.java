package es.upm.miw.apiArchitectureSport.daos;

import java.util.List;

public interface GenericDao<T, ID> {

    void create(T entity);

    T read(String nick);

    void update(T entity);

    void deleteById(ID id);

    List<T> findAll();

}
