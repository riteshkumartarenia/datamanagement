package com.hcl.datamanagement.service;

import java.util.List;

import com.hcl.datamanagement.dto.DataSourceDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.hcl.datamanagement.dao.DataSourceDaoService;
import com.hcl.datamanagement.entity.DataSourceEntity;

@Service
public class DataSourceService {

    private final DataSourceDaoService dao;

    private final ModelMapper mapper;

    public DataSourceService(DataSourceDaoService dao, ModelMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    public DataSourceDto create(DataSourceDto dto) {
        DataSourceEntity entity = toEntity(dto);
        DataSourceEntity entity1 = dao.create(entity);
        return toDto(entity1);
    }

    public List<DataSourceDto> create(List<DataSourceDto> list) {
        List<DataSourceEntity> entityList = toEntity(list);
        List<DataSourceEntity> entityList1 = dao.create(entityList);
        return toDto(entityList1);
    }


    public List<DataSourceDto> getAll() {
        List<DataSourceEntity> all = dao.getAll();
        return toDto(all);
    }

    public DataSourceDto getOneByAltKey(int altKey) {
        DataSourceEntity entity = dao.getOneByAltKey(altKey).orElse(null);
        return toDto(entity)  ;
    }


    public DataSourceDto update(DataSourceDto dto) {
        return toDto(dao.update(toEntity(dto)));

    }

    public String deleteAll() {
        return dao.deleteAll();
    }

    public String delete(int altKey) {
        return dao.delete(altKey);
    }

    /*----------------------------------------------------------------------*/


    private DataSourceDto toDto(DataSourceEntity entity) {
        return mapper.map(entity, DataSourceDto.class);
    }

    private DataSourceEntity toEntity(DataSourceDto dto) {
        return mapper.map(dto, DataSourceEntity.class);
    }

    private List<DataSourceDto> toDto(List<DataSourceEntity> entityList) {
        return entityList.stream().map(entity -> mapper.map(entity, DataSourceDto.class)).toList();
    }

    private List<DataSourceEntity> toEntity(List<DataSourceDto> dtoList) {
        return dtoList.stream().map(dto -> mapper.map(dto, DataSourceEntity.class)).toList();
    }
}
