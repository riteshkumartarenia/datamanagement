package com.hcl.datamanagement.dao;

import java.util.List;
import java.util.Optional;


import com.hcl.datamanagement.entity.DataSourceEntity;
import com.hcl.datamanagement.repository.DataSourceRepository;
import org.springframework.stereotype.Service;

@Service
public class DataSourceDaoService {

    private final DataSourceRepository repository;

    public DataSourceDaoService(DataSourceRepository repository) {
        this.repository = repository;
    }

    public DataSourceEntity create(DataSourceEntity entity) {
        return repository.save(entity);
    }

    public List<DataSourceEntity> create(List<DataSourceEntity> list) {
        return repository.saveAll(list);
    }

    public List<DataSourceEntity> getAll() {
        return repository.findAll();
    }

    public List<DataSourceEntity> getAllByAltKey(List<Integer> list) {
        return repository.findAllById(list);
    }

    public Optional<DataSourceEntity> getOneByAltKey(int altKey) {
        return repository.findById(altKey);
    }

    public DataSourceEntity update(DataSourceEntity entity){
        return repository.save(entity);
    }

    public String deleteAll() {
        repository.deleteAll();
        return "Data Deleted Successfully";
    }

    public String delete(int altKey) {
        repository.deleteById(altKey);
        return "Data Deleted Successfully";
    }

}
