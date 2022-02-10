FROM openjdk:11

COPY build/libs/kotlinapp-0.0.1-SNAPSHOT.jar .

RUN addgroup --system appuser -gid 1001 && \
    adduser --system -ingroup appuser -u 1001 appuser


RUN chown appuser:appuser kotlinapp-0.0.1-SNAPSHOT.jar
RUN chmod 500 kotlinapp-0.0.1-SNAPSHOT.jar

EXPOSE 8080

USER 1001

CMD ["java", "-jar", "/kotlinapp-0.0.1-SNAPSHOT.jar"]
