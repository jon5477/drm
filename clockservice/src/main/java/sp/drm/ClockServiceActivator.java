package sp.drm;

import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;

import sp.drm.interfaces.CalendarService;

public class ClockServiceActivator implements BundleActivator {
	private ServiceRegistration sr;

	public void start(BundleContext bc) throws Exception {
		String bundleName = (String) bc.getBundle().getHeaders().get(Constants.BUNDLE_NAME);
		System.out.println("Started " + bundleName);
		CalendarService service = new ClockService();
		Properties props = new Properties();
		sr = bc.registerService(CalendarService.class.getName(), service, props); // Register service by interface
	}

	public void stop(BundleContext bc) throws Exception {
		sr.unregister();
		String bundleName = (String) bc.getBundle().getHeaders().get(Constants.BUNDLE_NAME);
		System.out.println("Stopped " + bundleName);
	}
}