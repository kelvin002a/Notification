package view;

import android.util.Log;
import android.view.View;

public class onClickListner implements View.OnClickListener {
    private Log log;

    @Override
    public void onClick(View v) {
        log.i("TAg" , "Button pressed");
    }
}
