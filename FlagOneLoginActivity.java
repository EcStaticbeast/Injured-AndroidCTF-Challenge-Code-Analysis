package b3nac.injuredandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public final class FlagOneLoginActivity extends androidx.appcompat.app.c {
    private int w;

    /* loaded from: classes.dex */
    static final class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (FlagOneLoginActivity.this.F() == 0) {
                Snackbar X = Snackbar.X(view, "The flag is right under your nose.", 0);
                X.Y("Action", null);
                X.N();
                FlagOneLoginActivity flagOneLoginActivity = FlagOneLoginActivity.this;
                flagOneLoginActivity.G(flagOneLoginActivity.F() + 1);
            } else if (FlagOneLoginActivity.this.F() == 1) {
                Snackbar X2 = Snackbar.X(view, "The flag is also under the GUI.", 0);
                X2.Y("Action", null);
                X2.N();
                FlagOneLoginActivity.this.G(0);
            }
        }
    }

    public final int F() {
        return this.w;
    }

    public final void G(int i) {
        this.w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_one_login);
        j.j.a(this);
        C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new a());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        d.s.d.g.d(editText, "editText2");
        if (d.s.d.g.a(editText.getText().toString(), "F1ag_0n3")) {
            Intent intent = new Intent(this, FlagOneSuccess.class);
            new FlagsOverview().J(true);
            new j().b(this, "flagOneButtonColor", true);
            startActivity(intent);
        }
    }
}
