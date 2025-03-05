package com.hcl.datamanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "datasource_master")
public class DataSourceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alt_key")
    private Integer altKey;

    @Column(name = "db_name")
    private String dbName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "db_password")
    private String password;

    @Column(name = "db_portnumber")
    private String portNumber;

    @Column(name = "host_name")
    private String hostName;

    public DataSourceEntity() {
        super();
    }

    public DataSourceEntity(Integer altKey, String dbName, String hostName, String password, String portNumber, String userName) {
        this.altKey = altKey;
        this.dbName = dbName;
        this.hostName = hostName;
        this.password = password;
        this.portNumber = portNumber;
        this.userName = userName;
    }

    public Integer getAltKey() {
        return altKey;
    }

    public void setAltKey(Integer altKey) {
        this.altKey = altKey;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "DataSourceEntity{" + "altKey=" + altKey + ", dbName='" + dbName + '\'' + ", hostName='" + hostName + '\'' + ", password='" + password + '\'' + ", portNumber='" + portNumber + '\'' + ", userName='" + userName + '\'' + '}';
    }
}
