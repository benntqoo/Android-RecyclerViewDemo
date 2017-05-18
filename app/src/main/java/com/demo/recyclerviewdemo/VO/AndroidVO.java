package com.demo.recyclerviewdemo.VO;

/**
 * Created by Jrtou on 2017/5/18.
 */

public class AndroidVO {
    private String version;
    private String memo;

    public AndroidVO(String version, String memo) {
        this.version = version;
        this.memo = memo;
    }

    public String getVersion() {
        return version;
    }

    public String getMemo() {
        return memo;
    }

}
