package me.loper.configuration;


import me.loper.configuration.adapter.ConfigurationAdapter;

/**
 * Represents a key in the configuration.
 *
 * @param <T> the value type
 */
public interface ConfigKey<T> {

    /**
     * Gets the position of this key within the {@link ConfigKeysManager} enum.
     *
     * <p>This is set shortly after the key is created, during the initialisation
     * of {@link ConfigKeysManager}.</p>
     *
     * @return the position
     */
    int ordinal();

    /**
     * Resolves and returns the value mapped to this key using the given config instance.
     *
     * <p>The {@link Configuration#get(ConfigKey)} method should be used to
     * retrieve the value, as opposed to calling this directly.</p>
     *
     * @param adapter the config adapter instance
     * @return the value mapped to this key
     */
    T get(ConfigurationAdapter adapter);
}
