package homework.day09;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/31 16:48
 */
public class WriteTest {
    public static void main(String[] args) throws Exception {
        WriteBackData data1 = new WriteBackData(1,9,"pass");
        WriteBackData data2 = new WriteBackData(2,9,"fail");
        WriteBackData data3 = new WriteBackData(3,9,"pass");

        ArrayList<WriteBackData> list = new ArrayList<>();
        list.add(data1);
        list.add(data2);
        list.add(data3);

        FileInputStream fis = new FileInputStream("src/test/resources/futureloan_API_Test cases_v2.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);

        for (WriteBackData data:list){
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(data.getRowNum());
            Cell cell = row.getCell(data.getCellNum()-1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            cell.setCellValue(data.getContent());

        }

        //workbook对象回写数据，new出输出流会初始化所有数据，建议备份
        FileOutputStream fos = new FileOutputStream("src/test/resources/futureloan_API_Test cases_v2.xlsx");
        workbook.write(fos);
        fis.close();


    }
}
