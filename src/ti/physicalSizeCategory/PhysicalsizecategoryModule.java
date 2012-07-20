package ti.physicalSizeCategory;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import android.content.res.Configuration;

@Kroll.module(name="Physicalsizecategory", id="ti.physicalSizeCategory")
public class PhysicalsizecategoryModule extends KrollModule
{
	private static final String LCAT = "PhysicalsizecategoryModule";
	private static final boolean DBG = TiConfig.LOGD;

	public PhysicalsizecategoryModule() {
		super();
	}

	@Kroll.getProperty @Kroll.method
	public String getPhysicalSizeCategory() {
		switch(TiApplication.getInstance().getApplicationContext().getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) {
			case Configuration.SCREENLAYOUT_SIZE_SMALL :
				return "small";
			case Configuration.SCREENLAYOUT_SIZE_NORMAL :
				return "normal";
			case Configuration.SCREENLAYOUT_SIZE_LARGE : 
				return "large";
			case 4 : // Configuration.SCREENLAYOUT_SIZE_XLARGE (API 9)
				return "xlarge";
			case Configuration.SCREENLAYOUT_SIZE_UNDEFINED:
			default :
				return "medium";
		}
	}
}

