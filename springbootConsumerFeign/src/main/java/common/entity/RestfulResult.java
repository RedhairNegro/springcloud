package common.entity;

/**
 * @program: 即停科技
 * @description
 * @author: jianghong
 * @create: 2020-06-11 11:43
 **/
public class RestfulResult {

    private String result = "Success";
    private String message;
    private Object data;		// 返回数据
    private int cntPage;		// page数
    private long cntData;		// 返回数据总数

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public int getCntPage() {
        return cntPage;
    }
    public void setCntPage(int cntPage) {
        this.cntPage = cntPage;
    }
    public long getCntData() {
        return cntData;
    }
    public void setCntData(long cntData) {
        this.cntData = cntData;
    }
}
