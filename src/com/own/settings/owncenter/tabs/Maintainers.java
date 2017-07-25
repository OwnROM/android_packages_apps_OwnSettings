/*
 * Copyright (C) 2015-2017 The OwnROM Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.own.settings.owncenter.tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceScreen;

import com.android.internal.logging.MetricsProto.MetricsEvent;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class Maintainers extends SettingsPreferenceFragment {
	
	public static final String TAG = "maintainers";
	
	// OnePlus
	private String KEY_ONEPLUS3_MAINTAINER_PLUS_LINK = "oneplus3_maintainer_plus_link";
	private String KEY_ONEPLUS2_MAINTAINER_PLUS_LINK = "oneplus2_maintainer_plus_link";
	private String KEY_ONEPLUSONE_MAINTAINER_PLUS_LINK = "oneplusone_maintainer_plus_link";
	
	// Google
	private String KEY_ANGLER_MAINTAINER_PLUS_LINK = "angler_maintainer_plus_link";
	private String KEY_BULLHEAD_MAINTAINER_PLUS_LINK = "bullhead_maintainer_plus_link";
	private String KEY_MAKO_MAINTAINER_PLUS_LINK = "mako_maintainer_plus_link";
	
	// LG
	private String KEY_H850_MAINTAINER_PLUS_LINK = "h850_maintainer_plus_link";
	private String KEY_D852_MAINTAINER_PLUS_LINK = "d852_maintainer_plus_link";
	private String KEY_D855_MAINTAINER_PLUS_LINK = "d855_maintainer_plus_link";
	
	// Lenovo
	private String KEY_A7010a48_MAINTAINER_PLUS_LINK = "A7010a48_maintainer_plus_link";
	private String KEY_Z2PLUS_MAINTAINER_PLUS_LINK = "z2plus_maintainer_plus_link";
	private String KEY_ZUKZ1_MAINTAINER_PLUS_LINK = "zukz1_maintainer_plus_link";
	
	// Motorola
	private String KEY_HARPIA_MAINTAINER_PLUS_LINK = "harpia_maintainer_plus_link";
	private String KEY_POTTER_MAINTAINER_PLUS_LINK = "potter_maintainer_plus_link";
	private String KEY_ATHENE_MAINTAINER_PLUS_LINK = "athene_maintainer_plus_link";
	private String KEY_TITAN_MAINTAINER_PLUS_LINK = "titan_maintainer_plus_link";

	// Sony
	private String KEY_HONAMI_MAINTAINER_PLUS_LINK = "honami_maintainer_plus_link";

	// Xiaomi
	private String KEY_MIDO_MAINTAINER_PLUS_LINK = "mido_maintainer_plus_link";
	private String KEY_KENZO_MAINTAINER_PLUS_LINK = "kenzo_maintainer_plus_link";
	private String KEY_CANCRO_MAINTAINER_PLUS_LINK = "cancro_maintainer_plus_link";
	private String KEY_ARMANI_MAINTAINER_PLUS_LINK = "armani_maintainer_plus_link";
	
	// OnePlus
	private Preference mOneplus3PlusUrl;
	private Preference mOneplus2PlusUrl;
	private Preference mOneplusOnePlusUrl;

	// Google
	private Preference mAnglerPlusUrl;
	private Preference mBullheadPlusUrl;
	private Preference mMakoPlusUrl;
		
	// LG
	private Preference mH850PlusUrl;
	private Preference mD852PlusUrl;
	private Preference mD855PlusUrl;
	
	// Lenovo
	private Preference mA7010a48PlusUrl;
	private Preference mZ2plusPlusUrl;
	private Preference mZukz1PlusUrl;
	
	// Motorola
	private Preference mHarpiaPlusUrl;
	private Preference mPotterPlusUrl;
	private Preference mAthenePlusUrl;
	private Preference mTitanPlusUrl;

	// Sony
	private Preference mHonamiPlusUrl;
	
	// Xiaomi
	private Preference mMidoPlusUrl;
	private Preference mKenzoPlusUrl;
	private Preference mCancroPlusUrl;
	private Preference mArmaniPlusUrl;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.ownrom_maintainers);
        
        // OnePlus
        mOneplus3PlusUrl = findPreference(KEY_ONEPLUS3_MAINTAINER_PLUS_LINK);
        mOneplus2PlusUrl = findPreference(KEY_ONEPLUS2_MAINTAINER_PLUS_LINK);
	mOneplusOnePlusUrl = findPreference(KEY_ONEPLUSONE_MAINTAINER_PLUS_LINK);
        
        // Google
        mAnglerPlusUrl = findPreference(KEY_ANGLER_MAINTAINER_PLUS_LINK);
        mBullheadPlusUrl = findPreference(KEY_BULLHEAD_MAINTAINER_PLUS_LINK);
        mMakoPlusUrl = findPreference(KEY_MAKO_MAINTAINER_PLUS_LINK);
        
        // LG
        mH850PlusUrl = findPreference(KEY_H850_MAINTAINER_PLUS_LINK);
        mD852PlusUrl = findPreference(KEY_D852_MAINTAINER_PLUS_LINK);
        mD855PlusUrl = findPreference(KEY_D855_MAINTAINER_PLUS_LINK);
        
        // Lenovo
        mA7010a48PlusUrl = findPreference(KEY_A7010a48_MAINTAINER_PLUS_LINK);
        mZ2plusPlusUrl = findPreference(KEY_Z2PLUS_MAINTAINER_PLUS_LINK);
        mZukz1PlusUrl = findPreference(KEY_ZUKZ1_MAINTAINER_PLUS_LINK);
        
        // Motorola
        mHarpiaPlusUrl = findPreference(KEY_HARPIA_MAINTAINER_PLUS_LINK);
        mPotterPlusUrl = findPreference(KEY_POTTER_MAINTAINER_PLUS_LINK);
        mAthenePlusUrl = findPreference(KEY_ATHENE_MAINTAINER_PLUS_LINK);
        mTitanPlusUrl = findPreference(KEY_TITAN_MAINTAINER_PLUS_LINK);

		// Sony
		mHonamiPlusUrl = findPreference(KEY_HONAMI_MAINTAINER_PLUS_LINK);

        // Xiaomi
        mMidoPlusUrl = findPreference(KEY_MIDO_MAINTAINER_PLUS_LINK);
        mKenzoPlusUrl = findPreference(KEY_KENZO_MAINTAINER_PLUS_LINK);
        mCancroPlusUrl = findPreference(KEY_CANCRO_MAINTAINER_PLUS_LINK);
        mArmaniPlusUrl = findPreference(KEY_ARMANI_MAINTAINER_PLUS_LINK);
        
    }

    @Override
    public boolean onPreferenceTreeClick(Preference preference) {

		// OnePlus
		if (preference == mOneplus3PlusUrl) {
			launchUrl("https://plus.google.com/+MarkVisser10021991");
		} else if (preference == mOneplus2PlusUrl) {
			launchUrl("https://plus.google.com/+MuhammadHamzaMZO");
		} else if (preference == mOneplusOnePlusUrl) {
			launchUrl("https://plus.google.com/117825170573333341445");

		// Google
		} else if (preference == mAnglerPlusUrl) {
			launchUrl("https://plus.google.com/111706744947764135950");
		} else if (preference == mBullheadPlusUrl) {
			launchUrl("https://plus.google.com/+AkashSrivastava1926");
		} else if (preference == mMakoPlusUrl) {
			launchUrl("https://plus.google.com/+VictorLinfield");
			
		// LG
		} else if (preference == mH850PlusUrl) {
			launchUrl("https://plus.google.com/+MarkVisser10021991");
		} else if (preference == mD852PlusUrl) {
			launchUrl("https://plus.google.com/+VictorLinfield");
		} else if (preference == mD855PlusUrl) {
			launchUrl("https://plus.google.com/+VictorLinfield");
						
		// Lenovo
		} else if (preference == mA7010a48PlusUrl) {
			launchUrl("https://plus.google.com/+MohanCm100");
		} else if (preference == mZ2plusPlusUrl) {
			launchUrl("https://plus.google.com/u/0/+subhrajyotisen12");
		} else if (preference == mZukz1PlusUrl) {
			launchUrl("https://plus.google.com/+JyothishJoshy1231");
			
		// Motorola
		} else if (preference == mHarpiaPlusUrl) {
			launchUrl("https://plus.google.com/u/0/+subhrajyotisen12");
		} else if (preference == mPotterPlusUrl) {
			launchUrl("https://plus.google.com/u/1/110774809129522678759");
		} else if (preference == mAthenePlusUrl) {
			launchUrl("https://plus.google.com/114912018259767227558");
		} else if (preference == mTitanPlusUrl) {
			launchUrl("https://plus.google.com/u/0/118405882948543782913");

		// Sony
		} else if (preference == mHonamiPlusUrl) {
			launchUrl("https://plus.google.com/+AkashSrivastava1926");

		// Xiaomi
		} else if (preference == mMidoPlusUrl) {
			launchUrl("https://plus.google.com/112075683094247160085?hl=tr");
		} else if (preference == mKenzoPlusUrl) {
			launchUrl("https://plus.google.com/+KrittinKalra");
		} else if (preference == mCancroPlusUrl) {
			launchUrl("https://plus.google.com/107725359306238016073?hl=vi");
		} else if (preference == mArmaniPlusUrl) {
			launchUrl("https://plus.google.com/+SujitRoyKumar");
										
        }
        return super.onPreferenceTreeClick(preference);
    }


    private void launchUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        getActivity().startActivity(intent);
    }

               
    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.OWN;
     }
}
