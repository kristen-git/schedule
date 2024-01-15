import java.util.ArrayList;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-13  10:39
 * @Description: TODO
 */

public class ShowDVD {
    public ArrayList<DVD> showDVDManager(){
        ArrayList<DVD> dvds = new ArrayList<>();
        DVD d1 = new DVD("无间道", false, null, null);
        DVD d2 = new DVD("花样年华", false, null, null);
        DVD d3 = new DVD("甄嬛传", false, null, null);
        DVD d4=new DVD("琅琊榜",false,null,null);
        DVD d5=new DVD("知否",false,null,null);
        dvds.add(d1);
        dvds.add(d2);
        dvds.add(d3);
        dvds.add(d4);
        dvds.add(d5);
        return dvds;
    }

    public ShowDVD() {

    }
}
