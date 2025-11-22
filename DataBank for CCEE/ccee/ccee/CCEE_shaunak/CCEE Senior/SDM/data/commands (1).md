# jenkins

- create dockerfile

```dockerfile

FROM httpd
COPY index.html /usr/local/apache2/htdocs
EXPOSE 80

```

- create docker image

```bash
> docker image build -i <docker hub user name>/<image name>
```

- create a docker auth token
-

```bash

# login to docker hub account
# go to account settings
# create a token and make sure that you have copied it somewhere
```

- login to the docker hub account

```bash

> echo <token> | docker login -u <username> --password-stdin

```

- push the image to the docker hub account

```bash
> docker image push <image name>
```

- create a service is it does not exist

```bash
> docker service create --name service1 -p 9090:80 --replicas 2 <image name>
```

- push the code to GitHub repo

```bash

# init a repo
> git init

# add the changes
> git add .

# commit the changes
> git commit -m ""

# check if your local repo is already connected with remote repo
> git remote -v

# if you see the origin in previous command's output please do not take any action

# if not then create a new repo on GitHub
# connect with remote repo
> git remote add origin <url>

# change the master branch name to main
> git branch -m main

# push the changes to remote repo
> git push -u origin main

```

## commands to be automated using jenkins

```bash

# build docker image
> docker image build -t <username>/htmlimage .

# docker login
> echo <token> | docker login -u <username> --password-stdin

# docker image push
> docker image push <username>/htmlimage

# update the service to create new containers with latest image
> docker service update --force service1

# delete existing service
> docker service rm service1

# create with new version
> docker service create --name service1 -p 9090:80 --replicas 2 pythoncpp/htmlimage

```

## add jenkins in docker group

```bash

# add jenkins user in docker group
> sudo usermod -aG docker jenkins

# restart jenkins service
> sudo systemctl restart jenkins

```

## job configuration

```bash
/usr/bin/docker image build -t <username>/htmlimage .
echo <token> | /usr/bin/docker login -u <username> --password-stdin
/usr/bin/docker image push <username>/htmlimage
/usr/bin/docker service rm service1
/usr/bin/docker service create --name service1 -p 9090:80 --replicas 2 <username>/htmlimage

```

## exercise

- create a python flask application to return current version from / url. containerize the same and run it automatically in docker swarm using jenkins.
