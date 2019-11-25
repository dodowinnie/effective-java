package com.brandon.effective.java.demo1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Brandoncui on 2019/11/20.
 */
public class Demo1 {
    public static void main(String[] args) {

    }

}

interface Service{

}

interface Provider{
    Service newService();
}

class Services{
    private Services(){}

    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefultProvider(Provider p){
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    private static void registerProvider(String providerName, Provider p) {
        providers.put(providerName, p);
    }

    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    private static Service newInstance(String providerName) {
        Provider provider = providers.get(providerName);
        if(provider == null){
            throw new IllegalArgumentException();
        }
        return provider.newService();
    }


}
