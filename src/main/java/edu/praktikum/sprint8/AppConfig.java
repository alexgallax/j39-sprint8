package edu.praktikum.sprint8;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties", "classpath:config.${env}.properties"})
public interface AppConfig extends Config {

    String baseUrl();
}
