package com.owncloud.android.alarm.show.presenter;

import com.owncloud.android.alarm.show.model.IShowAlarmModel;
import com.owncloud.android.alarm.show.model.ShowAlarmModel;
import com.owncloud.android.alarm.show.view.IShowAlarmView;

/**
 * Created by Sniuniu on 2016/03/15.
 */
public class ShowAlarmPresenter {

    private IShowAlarmModel showAlarmModel;
    private IShowAlarmView showAlarmView;

    public ShowAlarmPresenter(IShowAlarmView showAlarmView) {
        showAlarmModel = new ShowAlarmModel();
        this.showAlarmView = showAlarmView;
    }



}
