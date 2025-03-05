package com.hcl.datamanagement.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hcl.datamanagement.dto.DataSourceDto;
import com.hcl.datamanagement.service.DataSourceService;

@RestController
@RequestMapping("/datamanagements")
public class DataSourceController {

    private final DataSourceService service;

    public DataSourceController(DataSourceService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<DataSourceDto> create(@RequestBody DataSourceDto dto) {
        try {
            return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/saveAll")
    public ResponseEntity<List<DataSourceDto>> create(@RequestBody List<DataSourceDto> list) {
        try {
            return new ResponseEntity<>(service.create(list), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<DataSourceDto>> getAll() {
        List<DataSourceDto> all = service.getAll();
        if (!all.isEmpty()) {
            return new ResponseEntity<>(all, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/find/{altKey}")
    public ResponseEntity<DataSourceDto> getOneByAltKey(@PathVariable int altKey) {
        DataSourceDto dto = service.getOneByAltKey(altKey);
        if (dto != null) {
            return new ResponseEntity<>(dto, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/update")
    public ResponseEntity<DataSourceDto> update(@RequestBody DataSourceDto dto) {
        DataSourceDto update = service.update(dto);
        if (update != null) {
            return new ResponseEntity<>(update, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<?> deleteAll() {
        service.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete/{altKey}")
    public ResponseEntity<?> delete(@PathVariable int altKey) {
        service.delete(altKey);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
