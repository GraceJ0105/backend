
### Requirements

- Java version 17
- Maven 3

#### Percona database

`docker compose up percona` or `docker compose start percona` if the image already exists locally

Connect to the database using mysql entering the password in the docker-compose.yml file when prompted:

`mysql -h 127.0.0.1 -u root -p`
