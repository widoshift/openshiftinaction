# Chapter 3 - Containers are Linux

The application component that handles scaling application pods is called the replication controller (RC).

```
oc describe rc app-cli-1
oc describe rc $(oc get rc -l app=app-cli -o=jsonpath='(.items[].metadata.name)')
oc get rc app-cli-1 -o yaml
```

## Delete PODS
```
oc delete pod -l app=app-cli
oc describe svc app-cli | grep Selector
```

## Scale apps
```
oc scale dc app-cli-1 --replicas=1
```

## Readyness
```
oc set probe dc/app-cli --readiness --get-url=http://:8080/notreal --initial-delay-seconds=5

#look for deployed pod after creating readiness probe
oc get pods
```

## Rollback
```
oc rollback app-cli
```


