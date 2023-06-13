package works;
import java.util.HashMap;
import java.util.Map;
public class task1 {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<String,String>();
        dict.put("name","Ivanov");
        dict.put("country","Russia");
        dict.put("city","Moscow");
        dict.put("age",null);
        System.out.println(where(dict));
    }
    public static String where (Map<String, String> dict)
    {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String,String> mapobj : dict.entrySet())
        {
            if (mapobj.getValue() != null)
            {
                sb.append(mapobj.getKey() +" = '" + mapobj.getValue()+"' and ");
            }
        }
        sb.delete(sb.toString().length()-5,sb.toString().length());
        return sb.toString();
    }
}