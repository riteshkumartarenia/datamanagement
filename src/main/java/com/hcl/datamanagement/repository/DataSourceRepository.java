package com.hcl.datamanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.datamanagement.entity.DataSourceEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSourceRepository extends JpaRepository<DataSourceEntity, Integer> {

}
