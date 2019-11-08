package org.camoiloc.sample.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import org.camoiloc.sample.shared.DTO;

public interface SampleServiceAsync {

    void setData(DTO data, AsyncCallback<Void> async);
}
