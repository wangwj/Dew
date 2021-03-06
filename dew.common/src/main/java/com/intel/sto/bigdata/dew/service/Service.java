package com.intel.sto.bigdata.dew.service;

import java.util.Map;

import com.intel.sto.bigdata.dew.conf.DewConf;
import com.intel.sto.bigdata.dew.message.ServiceResponse;

public abstract class Service implements Runnable {

  protected DewConf dewConf;
  protected Map<String, String> context;

  abstract public void stop();

  public ServiceResponse get(Object message) {
    return null;
  }

  public void put(ServiceResponse message) {

  }

  public DewConf getDewConf() {
    return dewConf;
  }

  public void setDewConf(DewConf dewConf) {
    this.dewConf = dewConf;
  }

  public Map<String, String> getContext() {
    return context;
  }

  public void setContext(Map<String, String> context) {
    this.context = context;
  }

}
