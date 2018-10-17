FROM payara/micro:5.183
LABEL maintainer="thomas.hanel@haw-landshut.de" app="jee8-servlet"
COPY ./target/jee8-servlet.war ${DEPLOY_DIR}
