package com.journaldev.navigationviewexpandablelistview;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

public class HeaderGroup {
    public String string;
    public Bitmap bitmap;
    public final List<String> children = new ArrayList<String>();

    public HeaderGroup(String string,Bitmap bitmap) {
        this.string = string;
        this.bitmap = bitmap;
    }
}
