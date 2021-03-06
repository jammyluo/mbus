package com.brzhang.mbus.reponse;

import com.brzhang.mbus.dataobject.Bus;
import com.brzhang.mbus.dataobject.BusRuningInfo;
import com.brzhang.mbus.dataobject.OpenBus;

import java.util.ArrayList;

/**
 * Created by brzhang on 15/5/21.
 */
public class BusResponse extends BaseResponse {
    private ArrayList<Bus>     busArrayList;
    private ArrayList<OpenBus> openBusArrayList;
    private ArrayList<BusRuningInfo> busRuningInfos;

    public ArrayList<Bus> getBusArrayList() {
        return busArrayList;
    }

    public void setBusArrayList(ArrayList<Bus> busArrayList) {
        this.busArrayList = busArrayList;
    }

    public ArrayList<OpenBus> getOpenBusArrayList() {
        return openBusArrayList;
    }

    public void setOpenBusArrayList(ArrayList<OpenBus> openBusArrayList) {
        this.openBusArrayList = openBusArrayList;
    }

    public ArrayList<BusRuningInfo> getBusRuningInfos() {
        return busRuningInfos;
    }

    public void setBusRuningInfos(ArrayList<BusRuningInfo> busRuningInfos) {
        this.busRuningInfos = busRuningInfos;
    }
}
