package b3nac.injuredandroid;        // declaring the package

import android.os.Bundle;        //importing classes and components
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public class FlagTwoActivity extends androidx.appcompat.app.c {        //declaring class FlagTwoActivity which is inherited from androidx.appcompat.app.c
    int w = 0;        // Initializing integer variable w with the value 0

    public /* synthetic */ void F(View view) {        //declaring a method F() which assigns a parameter View to view
        int i = this.w;        // initializing integer i with the current interface with variable w
        if (i == 0) {        // if conditional block,if the value of integer i is 0 then execute if block
            Snackbar X = Snackbar.X(view, "Key words Activity and exported.", 0);    // creates a snackbar, initiates the snackbar with the message
            X.Y("Action", null);        // declares the snapbar with the method action
            X.N();        //declares method N() to display the message from snackbar
            this.w++;        //in the current instance value of variable w is incremented
        } else if (i == 1) {    // else condition, if the value of integer i is equal to 1 then 
            Snackbar X2 = Snackbar.X(view, "Exported Activities can be accessed with adb or Drozer.", 0);    //creates snackbar x2, initiates the snackbar with the message
            X2.Y("Action", null);        //adds an action "Action" to the snackbar with a null callback
            X2.N();        //declares N() method to display snackbar
            this.w = 0;        //in the current interface,value of variable w is set to 0
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {        // Oncreate method is created,declares Bundle with the name bundle
        super.onCreate(bundle);        //bundle methods is called as a super class
        setContentView(R.layout.activity_flag_two);    // content view is created
        C((Toolbar) findViewById(R.id.toolbar));        //method c is called and view id is specified as R.id.toolbar
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View.OnClickListener() { // from class: b3nac.injuredandroid.d    // OnClickListener is set for the FloatingActionButton with the ID R.id.fab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {        //onClick method is initiated with View parameter named view
                FlagTwoActivity.this.F(view);       // Call the F() method in the class FlagTwoActivity, passing view parameter
            }
        });
    }
}
