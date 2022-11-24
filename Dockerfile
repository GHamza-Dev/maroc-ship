FROM quay.io/wildfly/wildfly

ADD /target/marocShip-1.0-SNAPSHOT /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080

CMD ["cataline.sh", "run"]