import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import com.sun.security.auth.callback.TextCallbackHandler;

public class JaasDemo{
    public static void main(String[] args){
       try{
            LoginContext lc = new LoginContext("JaasDemo", new TextCallbackHandler());
       }catch(Exception e){

       }

        
    }
}
