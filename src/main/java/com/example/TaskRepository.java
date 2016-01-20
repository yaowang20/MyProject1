package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Yao on 1/2/2016.
 */

public interface TaskRepository extends CrudRepository<Task, Long> {

}

