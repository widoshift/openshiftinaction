# openshiftinaction

# Chapter Two - Getting Started

image-uploader application source code at https://github.com/widoshift/image-uploader

The other examples from this chapter are used to:

* Create a new project in OpenShift
* Deploy a new application in Openshift
* Create and inspect a new route to access a deployed application in OptnShift

## command

```
oc login -u dev -p dev https://ocp-1.192.168.122.100.nip.io:8443
oc new-project image-uploader --display-name='Image Uploader Project'
oc new-app --image-stream=php --code=https://github.com/widoshift/image-uploader.git --name=app-cli
oc describe svc/app-cli
oc expose svc/app-cli
oc describe route/app-cli
```

# Chapter Three - Containers are Linux


