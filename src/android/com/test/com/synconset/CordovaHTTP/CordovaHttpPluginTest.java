import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class CordovaHttpPluginTest
{
    public static void main(String[] args)
    {
        try {
            String testeString = "[{teste:teste},{_username:4646300600401216,_password:250792,_token:m_WMaJUbEaSQA0s-hQZsVNTquL7z4BMrc-BNwrOPDyw}]";
            JSONArray teste = new JSONArray(testeString);
            JSONObject jsonObj = teste.getJSONObject(1);
            System.out.println(testeString);
            System.out.println(teste.getJSONObject(0));
            System.out.println(teste.getJSONObject(1));
            System.out.println(jsonObj.toString());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}