FROM airhacks/glassfish
COPY ./target/SwaggerAPIJavaExample.war ${DEPLOYMENT_DIR}
