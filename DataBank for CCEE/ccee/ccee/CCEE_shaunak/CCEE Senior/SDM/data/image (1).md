# images

### create custom image for websites

- create a file named index.html

```html
<h1>Welcome to my application</h1>
```

- create a file named Dockerfilex

```bash
# create a file named Dockerfile
> vim Dockerfile
```

```dockerfile

# set the base image for this image
FROM httpd

# copy the file named index.html from current directory to
# apache htdocs directory
# COPY <local machine's file path> <container path>
COPY index.html /usr/local/apache2/htdocs/

# expose port 80
EXPOSE 80

```

- build the image

```bash

# build the image
# .: the local of Dockerfile
> docker image build -t <image name> .
# > docker image build -t myimage .

```

## customize image for running python backend application (flask)

- create a python program for flask REST APIs

```python

from flask import Flask

# create flask app
app = Flask(__name__)

# add all the routes
@app.route("/", methods=["GET"])
def root():
    return "welcome to python flask app"


# run the application
app.run(host="0.0.0.0", port=4000, debug=True)

```

- create a file named Dockerfile

```dockerfile

# our image will be created using python
FROM python

# execute the following command at the time of building the image
RUN pip install flask

# set the current working directory
WORKDIR /src

# copy the program file
# here second parameter (.) represents the working directory (/src)
# copy everything from current directory of local machine to /src of image
COPY . .

# expose the port 4000 as the flask server will listen on port 4000
EXPOSE 4000

# run the command to start the server
# execute this command at the time of starting the container
# every image needs one and only one CMD command
# CMD must be the last command in the Dockerfile
CMD python server.py

```

- build the image
- run a container
