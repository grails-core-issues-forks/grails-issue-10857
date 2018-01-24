# Grails issue 10857 #

Test project for issue [10857](https://github.com/grails/grails-core/issues/10857).

Run with:

```
./gradlew bootRun
```

Open browser and go to [http://localhost:8080/test](http://localhost:8080/test). You will see the interceptor being
executed on the console:

```
2018-01-24 15:27:04.410  INFO --- [nio-8080-exec-8] issue10857.ActuatorInterceptor           : --- Interceptor BEFORE --- Controller=test, Action=null
2018-01-24 15:27:04.411  INFO --- [nio-8080-exec-8] issue10857.ActuatorInterceptor           : --- Interceptor AFTER --- Controller=test, Action=index
```

Go to [http://localhost:8080/mgmt/health](http://localhost:8080/mgmt/health). Nothing is displayed on the console meaning
that the interceptor is excluding the `/mgmt/*` URLs.
