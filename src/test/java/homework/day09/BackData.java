package homework.day09;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/31 18:08
 */
public class BackData {
    private Object value;
    private String expression;

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BackData{" +
                "value='" + value + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }

    public String getExpression() {
        return expression;


    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

}
