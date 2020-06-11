package common.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: 即停科技
 * @description
 * @author: jianghong
 * @create: 2020-06-11 11:45
 **/
public class JsonUtils {
    public JsonUtils() {
    }

    public static String renderString(HttpServletResponse response, Object object) {
        return renderString(response, JsonMapper.toJsonString(object), "application/json");
    }

    public static String renderString(HttpServletResponse response, String string, String type) {
        try {
            response.setContentType(type);
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
            return null;
        } catch (IOException var4) {
            return null;
        }
    }
}
