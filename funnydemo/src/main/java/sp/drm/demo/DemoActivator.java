package sp.drm.demo;

import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class DemoActivator implements BundleActivator {
	private ServiceRegistration sr;

	public void start(BundleContext bc) throws Exception {
		Demo demo = new Demo();
		sr = bc.registerService(Demo.class.getName(), demo, new Properties());
		demo.demo();
	}

	public void stop(BundleContext bc) throws Exception {
		sr.unregister();
	}
}