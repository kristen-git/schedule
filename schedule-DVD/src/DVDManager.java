import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-12  16:42
 * @Description: TODO
 */

public class DVDManager {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    ArrayList<DVD> dvds = new ArrayList<>();

    //add
    public void add(String DVDName) {
        for (int i = 0; i < dvds.size(); i++) {
            if (dvds.get(i).getDVDName().equals(DVDName)) {
                System.out.println("该DVD已存在");
                break;
            } else {
                DVD dvd = new DVD(DVDName, false, null, null);
                dvds.add(dvd);
                System.out.println("已成功添加该DVD");
            }
        }
    }

    //delete
    public void delete(String DVDName) {
        for (int i = 0; i < dvds.size(); i++) {
            if (dvds.get(i).getDVDName().equals(DVDName) && !dvds.get(i).isDVDState()) {
                dvds.remove(i);
                System.out.println("已删除:" + DVDName);
                break;
            } else {
                System.out.println("没有此DVD");
            }
        }
    }

    //lend
    public void lend(String DVDName) {
        int i=0;
        while (true){
            if(dvds.get(i).getDVDName().equals(DVDName) && !dvds.get(i).isDVDState()){
                dvds.get(i).setDVDState(true);
                String format = sdf.format(new Date());
                System.out.println("借出时间为：" + format);
                dvds.get(i).setDVDOutTime(new Date());
                break;
            }else{
                i++;
                if(i==dvds.size()){
                    System.out.println("该DVD已经借出或不存在");
                    break;
                }
                continue;
            }
        }
    }

    //back
    public void back(String DVDName) {
        int i=0;
        while (true){
            if(dvds.get(i).getDVDName().equals(DVDName) && dvds.get(i).isDVDState()){
                dvds.get(i).setDVDState(false);
                String format = sdf.format(new Date());
                System.out.println("返还时间为：" + format);
                dvds.get(i).setDVDInTime(new Date());
                break;
            }else{
                i++;
                if(i==dvds.size()){
                    System.out.println("该DVD还未归还或不存在");
                    break;
                }
                continue;
            }
        }
    }
    //printDVD
    public void printDVD(){
        System.out.println("DVDName    DVDState              DVDOutTime                      DVDInTime");
        for (int i = 0; i < dvds.size(); i++) {
            if(!dvds.get(i).isDVDState()){
                System.out.println(dvds.get(i).getDVDName()+"   "+"    未借出    "+
                        dvds.get(i).getDVDOutTime()+"     "+dvds.get(i).getDVDInTime());
            }else{
                System.out.println(dvds.get(i).getDVDName()+"   "+"    已借出    "+
                        dvds.get(i).getDVDOutTime()+"   "+dvds.get(i).getDVDInTime());
            }
        }
    }

}
