package org.camoiloc.sample.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import org.camoiloc.sample.shared.DTO;

@RemoteServiceRelativePath("SampleService")
public interface SampleService extends RemoteService {

    void setData(DTO data);

    class App {

        private static SampleServiceAsync ourInstance = GWT.create(SampleService.class);

        public static synchronized SampleServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
