package issue10857

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

@Slf4j
@CompileStatic
class ActuatorInterceptor {

    ActuatorInterceptor() {
        matchAll().excludes(uri: "/mgmt/*")
    }

    boolean before() {
        log.info "--- Interceptor BEFORE --- Controller=${controllerName}, Action=${actionName}"
        return true
    }

    boolean after() {
        log.info "--- Interceptor AFTER --- Controller=${controllerName}, Action=${actionName}"
        return true
    }

    void afterView() { /* no-op */ }
}
