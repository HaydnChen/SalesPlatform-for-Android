package com.ebaotech.salesplatform.rest.client;

import com.ebaotech.salesplatform.rest.model.SyncStatus;
import com.ebaotech.salesplatform.rest.model.filter.Filter;
import com.ebaotech.salesplatform.rest.model.input.DeviceCheck;
import com.ebaotech.salesplatform.rest.model.input.InputModel;
import com.ebaotech.salesplatform.rest.model.output.OutputModel;
import com.ebaotech.salesplatform.rest.model.output.OutputModelList;
import com.ebaotech.salesplatform.rest.model.prospect.Prospect;
import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * Created by haydn.chen on 4/7/2016.
 */
@Rest(rootUrl = "http://192.168.43.82:8080/sync/services/rest/prospect", converters = MappingJackson2HttpMessageConverter.class)
public interface ProspectSyncClient extends RestClientErrorHandling {

  @Post("/id/{offlineId}") OutputModel<Prospect> get(@Path String offlineId,
      @Body DeviceCheck deviceCheck);

  @Post("/updateList") OutputModelList<SyncStatus> fetchUpdateList(@Body Filter filter);

  @Post("/save")
  SyncStatus saveOrUpdate(@Body InputModel<Prospect> model);
}
