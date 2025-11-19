# Swarm

## swarm

```bash

# check if the docker host or node is already a part of any other swarm
# check the Swarm status in the following command output
> docker info
> docker info | grep Swarm

# initialize a swarm (cluster) using default ip address
> docker swarm init

# initialize a swarm (cluster) using custom ip address
> docker swarm init --advertise-addr <ip>

# remove the current machine from docker swarm
> docker swarm leave --force

# get the token for worker
> docker swarm join-token worker

# get the token for manager
> docker swarm join-token manager

```

## nodes

```bash

# get the list of nodes in the current cluster
> docker node ls

# get the details of selected node
> docker node inspect <node id>

# remove a node from swarm
> docker node rm <node id>

# promote a worker to a manager
> docker node promote <worker id>

# demote a manager to a worker
> docker node demote <manager id>

```

## service

```bash

# get the list of services
> docker service ls

# create a service
> docker service create --name <service name> <image name>
> docker service create --name myservice httpd

# create a service with required desired count
> docker service create --name <service name> --replicas <desired count> <image name>
> docker service create --name myservice --replicas 5 httpd

# create service with port published (port forwarding)
> docker service create --name service name --replicas <desired count> -p <source port>:<service port> <image name>
> docker service create --name myservice --replicas 5 -p 8090:80 httpd

# get the containers created by service
> docker service ps <service name>
> docker service ps myservice

# get the details of service
> docker service inspect <service name>
> docker service inspect myservice

# remove a running service
> docker service rm <service name>
> docker service rm myservice

# scale the service
> docker service scale <service name>=<new desired count>
> docker service scale myservice=10

```

## multi node cluster

- create a vagrant cluster with two machines
  - hostname1: manager
  - hostname2: worker
- install docker in both the machines
- initialize swarm on manager
- add worker in the cluster
