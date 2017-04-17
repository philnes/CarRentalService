package fh.technikum.wien;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
 
public class CustomApplication extends ResourceConfig 
{
    public CustomApplication() 
    {
        packages("fh.technikum.wien");
        register(LoggingFilter.class);
        //register(GsonMessageBodyHandler.class);
 
        //Register Auth Filter here
        register(AuthenticationFilter.class);
    }
}