## image

```bash

# build an image
> docker image build -t <image name> .
> docker image build -t myhtmlimage .

# tag an image
> docker image tag <old name> <new name>
> docker image tag myhtmlimage <dockerhub user name>/myhtmlimage
> docker image tag myhtmlimage pythoncpp/myhtmlimage

# login with docker hub account
> docker login

# push image from local machine to docker hub
> docker image push <docker hub username>/<image name>
> docker image push pythoncpp/myhtmlimage

```
