#!/bin/bash

# Ensure, that docker-compose stopped
docker-compose --env-file .env stop

# Start new deployment with provided env vars in ./target/.env file
docker-compose --env-file .env up --build -d