package com.phonegap.plugins.mapkit;

import android.view.View;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.Marker;

/**
 * Created with IntelliJ IDEA.
 * User: lholmquist
 * Date: 5/4/13
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomInfoWindowAdapter implements InfoWindowAdapter {

    private MapView mapView;
    @Override
    public View getInfoWindow(Marker marker) {

        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
