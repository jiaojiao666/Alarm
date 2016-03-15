package com.owncloud.android.alarm.operate.presenter;

import com.owncloud.android.alarm.operate.model.IOperaAlarmModel;
import com.owncloud.android.alarm.operate.model.OperaAlarmModel;
import com.owncloud.android.alarm.operate.view.IOperaAlarmView;

/**
 * Created by Sniuniu on 2016/03/15.
 */
public class OperaAlarmPresenter {

    private IOperaAlarmModel operaAlarmModel;
    private IOperaAlarmView operaAlarmView;

    public OperaAlarmPresenter(IOperaAlarmView operaAlarmView){
        operaAlarmModel = new OperaAlarmModel();
        this.operaAlarmView = operaAlarmView;
    }




}
