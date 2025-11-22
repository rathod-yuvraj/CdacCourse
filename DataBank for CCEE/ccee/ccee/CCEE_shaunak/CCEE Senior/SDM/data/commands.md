# kubernetes

## minikube commands

```bash

# start the minikube cluster
> minikube start

# stop the minikube cluster
> minikube stop

# destroy the minikube cluster
> minikube destroy

# check the status of minikube cluster
> minikube status

# go inside minikube cluster
> minikube ssh

```

## configure the kubectl tool

```bash

# copy this following line in your .bashrc
> alias kubectl="minikube kubectl --"

# restart the terminal after adding above line or
# use source command to reload all the settings
> source ~/.bashrc

```

## vim configuration

```bash

# add following lines in your ~/.vimrc file
> set expandtab
> set tabstop=2

```

## node related commands

```bash

# get the list of nodes
> kubectl get nodes
> kubectl get node

# get details of selected node
> kubectl describe node <node name>

```

## namespace

```bash

# get the list of namespace
> kubectl get namespaces
> kubectl get ns

# create a new namespace
> kubectl create namespace <namespace name>
> kubectl create namespace ns1
> kubectl create ns ns1

# delete a selected namespace
# when ns gets deleted, all the objects created inside the ns will
# also get deleted
> kubectl delete namespace <namespace name>
> kubectl delete ns <namespace name>
> kubectl delete ns ns1

```

## pod related commands

```bash

# create a pod using yaml file
> kubectl create -f <file name>

# get the list of pods
> kubectl get pods

# get the details of selected pod
# > kubectl describe <object type> <object name>
> kubectl describe pod pod1

# delete a selected pod
> kubectl delete pod <pod name>
> kubectl delete pod pod1


```

## exercises

- create a pod to run nginx
- create a pod to run two containers (httpd and nginx)
- create a port to run nginx and expose the application to outside world
- create a replica set to create 2 replicas of httpd image
