package com.kxl.atu.navigationviewexa;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/6/23.
 */
public class ToastUtils {

    public static void showToast(Context context, String str) {
        Toast.makeText(context,str,Toast.LENGTH_SHORT);
    }
}
