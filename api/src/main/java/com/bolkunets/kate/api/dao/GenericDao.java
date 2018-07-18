package com.bolkunets.kate.api.dao;

import java.util.List;

public interface GenericDao<K,Entity> {

    Entity create(Entity entity);

    Entity read(K key);

    Entity update(Entity entity);

    void delete(K key);

    List<Entity> readAll();



}
