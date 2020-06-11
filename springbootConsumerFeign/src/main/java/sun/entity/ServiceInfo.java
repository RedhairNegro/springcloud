package sun.entity;

import java.io.Serializable;

/**
 * @program: 即停科技
 * @description
 * @author: jianghong
 * @create: 2020-06-11 11:42
 **/

public class ServiceInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
