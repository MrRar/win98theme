package io.github.mrrar.win98theme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;

public class MainActivity extends Activity
{
	public void nova() {
		Intent intent = new Intent("com.teslacoilsw.launcher.APPLY_ICON_THEME");
		intent.setPackage("com.teslacoilsw.launcher");
		intent.putExtra("com.teslacoilsw.launcher.extra.ICON_THEME_PACKAGE", getPackageName());
		try {
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
			go();
		}
	}
	public void go() {
		Intent goApply = getPackageManager().getLaunchIntentForPackage("com.gau.go.launcherex");
		if (goApply != null) {
			Intent intent = new Intent("com.gau.go.launcherex.MyThemes.mythemeaction");
			intent.putExtra("type",1);
			intent.putExtra("pkgname", getPackageName());
			sendBroadcast(intent);
			startActivity(goApply);
		} else {
			adw();
		}
	}
	public void adw() {
		Intent intent = new Intent("org.adw.launcher.SET_THEME");
		intent.putExtra("org.adw.launcher.theme.NAME",
		"org.adw.launcher");
		try {
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
			apex();
		}
	}
	public void apex() {
		Intent intent = new Intent("com.anddoes.launcher.SET_THEME");
		intent.putExtra("com.anddoes.launcher.THEME_PACKAGE_NAME", getPackageName());
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		try {
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
			holo();
		}
	}
	public void holo() {
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.setComponent(new ComponentName("com.mobint.hololauncher","com.mobint.hololauncher.SettingsActivity"));
		try {
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
		}
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		nova();
		System.exit(0);
	}
}
