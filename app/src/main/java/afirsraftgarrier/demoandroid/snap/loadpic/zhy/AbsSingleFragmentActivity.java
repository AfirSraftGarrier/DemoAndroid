package afirsraftgarrier.demoandroid.snap.loadpic.zhy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import afirsraftgarrier.demoandroid.R;

public abstract class AbsSingleFragmentActivity extends FragmentActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(getLayoutId());

		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.id_fragmentContainer);

		if (fragment == null)
		{
			fragment = createFragment();
			fm.beginTransaction().add(R.id.id_fragmentContainer, fragment)
					.commit();
		}

	}

	protected abstract Fragment createFragment();

	protected abstract int getLayoutId();

}
