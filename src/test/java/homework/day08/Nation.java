package homework.day08;

import java.util.List;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/29 18:44
 */
public class Nation {

    private String name;
    private List<Object> provinces;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Object> provinces) {
        this.provinces = provinces;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "name='" + name + '\'' +
                ", provinces=" + provinces +
                '}';
    }
}

