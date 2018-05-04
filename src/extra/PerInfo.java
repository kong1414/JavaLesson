package extra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: POJO类
 * @Author: QiuGuanLin
 * @Date: 2018/5/3 18:00
 */
public class PerInfo {
    String name;
    String sex;
    String address;
    String tel;

    public PerInfo() {

    }

    public PerInfo(String name, String sex, String address, String tel) {
        super();
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.tel = tel;
    }

    public static PerInfo getAllFromFile(String fileName) {
        PerInfo perInfo = new PerInfo();
        BufferedReader reader = null;
        try {
            File file = new File(fileName);
            reader = new BufferedReader(new FileReader(file));
            perInfo.setName(reader.readLine());
            perInfo.setSex(reader.readLine());
            perInfo.setAddress(reader.readLine());
            perInfo.setTel(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return perInfo;
    }

    public static int setAllFromFile(PerInfo perinfo, String fileName) {
        BufferedWriter out = null;
        try {
            File file = new File(fileName);
            // 创建新文件
            file.createNewFile();
            out = new BufferedWriter(new FileWriter(file));
            out.write(perinfo.getName() + "\r\n"); // \r\n即为换行
            out.write(perinfo.getSex() + "\r\n");
            out.write(perinfo.getAddress() + "\r\n");
            out.write(perinfo.getTel() + "\r\n");
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return 1;
                }
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


}
