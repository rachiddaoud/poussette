package com.theteam.zf.poussette;

/**
 * Created by DAOUDR on 26/08/2015.
 */
public interface CustomEventListener {
    int BLUETOOTH_PAIRED = 101;
    int STROLLER_GYRO_POSITION = 102;
    int STROLLER_GEO_POSITION = 103;
    int STROLLER_HANDLED = 104;
    int STROLLER_BABY = 105;
    int STROLLER_DISTANCE = 106;

    public void doEvent(int e,Object o);
}
