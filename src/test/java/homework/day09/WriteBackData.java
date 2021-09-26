package homework.day09;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/31 16:31
 */
public class WriteBackData {
    private int rowNum;
    private int cellNum;
    private String content;

    public WriteBackData(int rowNum,int cellNum,String content){
        this.rowNum = rowNum;
        this.cellNum = cellNum;
        this.content = content;

    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getCellNum() {
        return cellNum;
    }

    public void setCellNum(int cellNum) {
        this.cellNum = cellNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
