package com.xdq.clazz;

import com.xdq.Adapt;
import com.xdq.Target;

/**
 * Author: 徐东强
 * Date: 2018/9/7 上午11:22
 * Description:
 **/
public class Adapter extends Adapt implements Target {
    public void operate() {
        super.doSomething();
    }
}
