package com.ebaotech.salesplatform.repository;

import com.ebaotech.salesplatform.domain.City;

import java.util.List;

/**
 * Created by radicsrichard on 15. 05. 14..
 */
public interface CleanRepository {

    public List<City> getCities(Double latitude, Double longitude, Integer count);

}
