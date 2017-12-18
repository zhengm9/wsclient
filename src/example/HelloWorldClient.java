package example;

import com.ProposalSaveRequest;
import com.ProposalSaveResponse;
import com.SpringFestivalPolicySaveServiceLocator;
import com.SpringFestivalPolicySaveServiceSoap11BindingStub;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.activation.Activator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhengming on 17/6/2.
 */
public class HelloWorldClient {
    private static final ThreadPoolExecutor threadpool=new ThreadPoolExecutor(3,5,0, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2000),new ThreadPoolExecutor.DiscardOldestPolicy());
    public static void main(String[] argv) {
            for(int i = 120; i<121; i++)
            {
                threadpool.execute(new AliThread(i));
            }
        threadpool.shutdown();
    }
}
