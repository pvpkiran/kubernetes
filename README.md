# Getting Started With springboot and kubernetes deployment(not spring-cloud-kubernetes)

Incorporating some of the best practices for  

1. Dockerizing springboot app  
2. Developing with cloud code intellij plugin
3. Using tools like skaffold and kustomize  
4. Deploying/Running on kubernetes  

### Reference Documentation
 https://github.com/GoogleContainerTools/jib    
 
 https://www.youtube.com/watch?v=YTPUNesUIbI
 
### Instructions

```kubectl create deployment demo-app --image=registry.hub.docker.com/pvpkiran/testingjib:first --dry-run -oyaml > k8s/deployement.yaml
kubectl create service loadbalancer demo-app --tcp 8090:8090 --dry-run -oyaml > k8s/service.yaml
kubectl apply -f k8s

kubectl port-forward serivce/demo-app 8090:8090

skaffold dev 

kustomize build ---> to see the comined yaml output
kubectl apply -k . (run from kustomize/base directory)```