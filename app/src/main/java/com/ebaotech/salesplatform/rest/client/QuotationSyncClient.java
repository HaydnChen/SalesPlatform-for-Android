package com.ebaotech.salesplatform.rest.client;

import com.ebaotech.salesplatform.rest.model.SyncStatus;
import com.ebaotech.salesplatform.rest.model.filter.Filter;
import com.ebaotech.salesplatform.rest.model.input.DeviceCheck;
import com.ebaotech.salesplatform.rest.model.input.InputModel;
import com.ebaotech.salesplatform.rest.model.output.OutputModel;
import com.ebaotech.salesplatform.rest.model.output.OutputModelList;
import com.ebaotech.salesplatform.rest.model.quotation.Quotation;
import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * Created by haydn.chen on 4/7/2016.
 */
@Rest(rootUrl = "http://localhost:8080/sync/services/rest/quotation", converters = MappingJackson2HttpMessageConverter.class)
public interface QuotationSyncClient extends RestClientErrorHandling {

  @Post("/id/{offlineId}") OutputModel<Quotation> get(@Path String offlineId,
      @Body DeviceCheck deviceCheck);

  @Post("/updateList") OutputModelList<SyncStatus> fetchUpdateList(@Body Filter filter);

  @Post("/save")
  SyncStatus saveOrUpdate(@Body InputModel<Quotation> model);
}
