import java.util.Date;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-12  16:25
 * @Description: TODO
 */

public class DVD {
    // DVD 的名称、状态（是否借出）、创建时间、借出时间和归还时间
    // DVD 中应包含的属性有名称、状态、创建时间、借出时间、归还时间和借出总次数
    //实现 DVD 的新增、删除、查看等功能
    //我们有借出和归还的功能，一个 DVD 的借出和归还，
    // 其实就是这个 DVD 的一个状态，
    // 因此，用一个 int 值来标识即可，0 代表未借出，1- 代表已借出。
    // 这个状态由我们自己来定义，当然你也可以选择 boolean 类型来标识；
    // 同时需要记录时间，这就用到了之前学习的时间 API。
    private String DVDName;
    private boolean DVDState;
    private Date DVDOutTime;
    private Date DVDInTime;


    public String getDVDName() {
        return DVDName;
    }

    public void setDVDName(String DVDName) {
        this.DVDName = DVDName;
    }

    public boolean isDVDState() {
        return DVDState;
    }

    public void setDVDState(boolean DVDState) {
        this.DVDState = DVDState;
    }

    public Date getDVDOutTime() {
        return DVDOutTime;
    }

    public void setDVDOutTime(Date DVDOutTime) {
        this.DVDOutTime = DVDOutTime;
    }

    public Date getDVDInTime() {
        return DVDInTime;
    }

    public void setDVDInTime(Date DVDInTime) {
        this.DVDInTime = DVDInTime;
    }


    public DVD() {
    }

    public DVD(String DVDName, boolean DVDState, Date DVDOutTime, Date DVDInTime) {
        this.DVDName = DVDName;
        this.DVDState = DVDState;
        this.DVDOutTime = DVDOutTime;
        this.DVDInTime = DVDInTime;
    }
}
