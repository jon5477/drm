package sp.drm.interfaces;

public interface DependencyResolver {
	void resolveDependencies(String bundleName);
	<T> T getService(Class<T> clazz);
}