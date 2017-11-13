package mas.rocketgame;

/**
 * Created by ZackMyrick on 11/13/17.
 */

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.sql.Blob;
import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "https://baggier-sleeve.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, int age, String password, Blob photo, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("password", password);
        params.put("age", age + "");
        params.put("photo", photo + "");

    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
