# dockernotes

### create docker file to create image
    // add open jdk 17 into package
    from apache/beam_java17_sdk
    // add java app into package and will be put on direcltory /opt/ with app.jar as name
    add target/simpleapp-0.0.1-SNAPSHOT.jar /opt/app.jar
    // add app.jar as new app
    run bash -c 'touch /opt/app.jar'
    // execute the app with this entrypoint/syntax
    entrypoint ["java","-jar","/opt/app.jar"]
### execute the file
    // build -> build docker image
    // -t built it with 'mohamadjaelani/springboot-simpleapp' as tag
    // .(period) indicate that the docker file is exist at current directory (where the docker command is running)
    docker build -t mohamadjaelani/springboot-simpleapp .
### console output
    [+] Building 215.1s (9/9) FINISHED
    => [internal] load build definition from Dockerfile                                                               0.1s
    => => transferring dockerfile: 197B                                                                               0.1s
    => [internal] load .dockerignore                                                                                  0.1s
    => => transferring context: 2B                                                                                    0.0s
    => [internal] load metadata for docker.io/apache/beam_java17_sdk:latest                                           4.7s
    => [auth] apache/beam_java17_sdk:pull token for registry-1.docker.io                                              0.0s
    => [internal] load build context                                                                                  1.1s
    => => transferring context: 17.62MB                                                                               0.9s
    => [1/3] FROM docker.io/apache/beam_java17_sdk@sha256:12924bfa584aa9000047c32fa19946e02577d54f042581d5f3b2618e  206.1s
    => => resolve docker.io/apache/beam_java17_sdk@sha256:12924bfa584aa9000047c32fa19946e02577d54f042581d5f3b2618e30  0.0s
    => => sha256:967757d5652770cfa81b6cc7577d65e06d336173da116d1fb5b2d349d5d44127 5.16MB / 5.16MB                     8.4s
    => => sha256:c357e2c68cb3bf1e98dcb3eb6ceb16837253db71535921d6993c594588bffe04 10.87MB / 10.87MB                  26.9s
    => => sha256:12924bfa584aa9000047c32fa19946e02577d54f042581d5f3b2618e30a5fd2e 4.73kB / 4.73kB                     0.0s
    => => sha256:ee4620e907b35b7cc5b55f468744312630061abf5a40a4b045cf5bd5f74e9772 11.12kB / 11.12kB                   0.0s
    => => sha256:6aefca2dc61dcbcd268b8a9861e552f9cdb69e57242faec64ac120d2355a9c1a 54.94MB / 54.94MB                  49.5s
    => => sha256:c766e27afb21eddf9ab3e4349700ebe697c32a4c6ada6af4f08282277a291a28 54.58MB / 54.58MB                  64.3s
    => => sha256:18e454664a629c8e4cac99685ba1b624982040c45466f197f649234a8e132803 14.07MB / 14.07MB                  50.7s
    => => sha256:303943476b6f5143642c36b70f95ce88a30634496fdbf41b8f5c5deaf16b48f7 187.63MB / 187.63MB               189.7s
    => => extracting sha256:6aefca2dc61dcbcd268b8a9861e552f9cdb69e57242faec64ac120d2355a9c1a                         11.1s
    => => sha256:198a44906bb1e0a08b1826b90d39cbc7442b5743869e92cfd28adfa2b9374ebf 37.04kB / 37.04kB                  51.9s
    => => sha256:e680ab970d5da3a04b4bb8d784ee07f312c3da83da93bd0b4764b2e9f6f4e7e9 7.36kB / 7.36kB                    53.3s
    => => sha256:7fe38635c2d7ba398c2e561154afa95542a0954503edd802a7f74a663abf1b75 83.15MB / 83.15MB                 135.6s
    => => extracting sha256:967757d5652770cfa81b6cc7577d65e06d336173da116d1fb5b2d349d5d44127                          1.0s
    => => extracting sha256:c357e2c68cb3bf1e98dcb3eb6ceb16837253db71535921d6993c594588bffe04                          1.5s
    => => sha256:9e13052d639122f2538ec2caf28e30af56c1b6e062415430613e597c13816881 208.57kB / 208.57kB                66.5s
    => => extracting sha256:c766e27afb21eddf9ab3e4349700ebe697c32a4c6ada6af4f08282277a291a28                         10.0s
    => => sha256:be7091cdec0bb5069c8f8cc51e07cc78d023be4b561c1d890e907074635b5607 3.03MB / 3.03MB                    72.3s
    => => sha256:33f64879dacf98972b935ac1a68f1299d7185871b46a27b5bc90b0ccf8ffec13 74.10kB / 74.10kB                  74.5s
    => => sha256:f64b6d548cd266defd273b1e68c2b160d3fb0752f0dc1fea07504c83c8d0c875 7.16MB / 7.16MB                   110.0s
    => => extracting sha256:18e454664a629c8e4cac99685ba1b624982040c45466f197f649234a8e132803                          1.6s
    => => sha256:4c77010a8b22032d268dd8626e8b06e4fca56f9d89611d12648bffb9869aaef6 6.21kB / 6.21kB                   113.5s
    => => sha256:70f797bf046397550328a2054b0c10d078e16fce5db68cde9e501744028ec208 334B / 334B                       114.2s
    => => sha256:0124ff50cfebae2dbb22f11a06ebe21752b12bcdc69f7299d162c8d387229851 18.40MB / 18.40MB                 173.2s
    => => sha256:4088eb614576d9bd18a870688166bad2346b2871b6c1f7c878264b3f81e85fec 6.41kB / 6.41kB                   137.6s
    => => sha256:550f1c81b79bdd812dd7b57fa8a123d85d89a04945f7a47971764cb2a97039b6 199B / 199B                       138.3s
    => => sha256:317d14757aafccb4bfaba3bc3c993cca0d37240589966f97607b7247c2df693c 17.96kB / 17.96kB                 139.1s
    => => sha256:9fd28faa304581435d49a85ed24331f5767f694046b5f4982cac71911b097b91 230B / 230B                       139.8s
    => => sha256:430f29185065a99fd6cb5c20faea2dd2d60e7055c256d1e43e6d0d27ff2e9b90 4.33MB / 4.33MB                   145.1s
    => => extracting sha256:303943476b6f5143642c36b70f95ce88a30634496fdbf41b8f5c5deaf16b48f7                          8.9s
    => => extracting sha256:198a44906bb1e0a08b1826b90d39cbc7442b5743869e92cfd28adfa2b9374ebf                          0.0s
    => => extracting sha256:e680ab970d5da3a04b4bb8d784ee07f312c3da83da93bd0b4764b2e9f6f4e7e9                          0.0s
    => => extracting sha256:7fe38635c2d7ba398c2e561154afa95542a0954503edd802a7f74a663abf1b75                          3.2s
    => => extracting sha256:9e13052d639122f2538ec2caf28e30af56c1b6e062415430613e597c13816881                          0.1s
    => => extracting sha256:be7091cdec0bb5069c8f8cc51e07cc78d023be4b561c1d890e907074635b5607                          0.2s
    => => extracting sha256:33f64879dacf98972b935ac1a68f1299d7185871b46a27b5bc90b0ccf8ffec13                          0.1s
    => => extracting sha256:f64b6d548cd266defd273b1e68c2b160d3fb0752f0dc1fea07504c83c8d0c875                          0.3s
    => => extracting sha256:4c77010a8b22032d268dd8626e8b06e4fca56f9d89611d12648bffb9869aaef6                          0.0s
    => => extracting sha256:70f797bf046397550328a2054b0c10d078e16fce5db68cde9e501744028ec208                          0.0s
    => => extracting sha256:0124ff50cfebae2dbb22f11a06ebe21752b12bcdc69f7299d162c8d387229851                          0.4s
    => => extracting sha256:4088eb614576d9bd18a870688166bad2346b2871b6c1f7c878264b3f81e85fec                          0.0s
    => => extracting sha256:550f1c81b79bdd812dd7b57fa8a123d85d89a04945f7a47971764cb2a97039b6                          0.0s
    => => extracting sha256:317d14757aafccb4bfaba3bc3c993cca0d37240589966f97607b7247c2df693c                          0.1s
    => => extracting sha256:9fd28faa304581435d49a85ed24331f5767f694046b5f4982cac71911b097b91                          0.0s
    => => extracting sha256:430f29185065a99fd6cb5c20faea2dd2d60e7055c256d1e43e6d0d27ff2e9b90                          0.3s
    => [2/3] ADD target/simpleapp-0.0.1-SNAPSHOT.jar /opt/app.jar                                                     2.7s
    => [3/3] RUN bash -c 'touch /opt/app.jar'                                                                         0.7s
    => exporting to image                                                                                             0.6s
    => => exporting layers                                                                                            0.5s
    => => writing image sha256:192d820525fef119188ab115b8316d61542f445a393531efbf5d5e9be3cee863                       0.0s
    => => naming to docker.io/mohamadjaelani/springboot-simpleapp                                                     0.0s

    Use 'docker scan' to run Snyk tests against images to find vulnerabilities and learn how to fix them
#### docker image built successfuly and the tag name is ```mohamadjaelani/springboot-simpleapp ```
### Test the image
    docker run mohamadjaelani/springboot-simpleapp
#### console output
              .   ____          _            __ _ _
         /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
        ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
         \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
          '  |____| .__|_| |_|_| |_\__, | / / / /
         =========|_|==============|___/=/_/_/_/
         :: Spring Boot ::                (v2.7.1)

        2022-07-17 06:04:25.289  INFO 1 --- [           main] i.n.a.s.simpleapp.SimpleappApplication   : Starting SimpleappApplication v0.0.1-SNAPSHOT using Java 17.0.2 on a38a1033e719 with PID 1 (/opt/app.jar started by root in /)
        2022-07-17 06:04:25.299  INFO 1 --- [           main] i.n.a.s.simpleapp.SimpleappApplication   : No active profile set, falling back to 1 default profile: "default"
        2022-07-17 06:04:28.101  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
        2022-07-17 06:04:28.135  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
        2022-07-17 06:04:28.136  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.64]
        2022-07-17 06:04:28.340  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
        2022-07-17 06:04:28.341  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2882 ms
        2022-07-17 06:04:29.413  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
        2022-07-17 06:04:29.445  INFO 1 --- [           main] i.n.a.s.simpleapp.SimpleappApplication   : Started SimpleappApplication in 5.535 seconds (JVM running for 6.575)
### push the image into docker repository
#### 1. Login into docker hub and create a repository there
#### 2. Login in docker command
        docker login
#### 3. create local tag of the local image with one of these method
   - When you build them, using ```docker build -t <hub-user>/<repo-name>[:<tag>]```
   - By re-tagging an existing local image ```docker tag <existing-image> <hub-user>/<repo-name>[:<tag>]```
   - By using ```docker commit <existing-container> <hub-user>/<repo-name>[:<tag>]``` to commit changes

   because I already build the image with ```mohamadjaelani/springboot-simpleapp``` tag so I have to re-tagging by

   ```docker tag mohamadjaelani/springboot-simpleapp j43lani/simpleapp:latest```
#### 4. then push local image into repository
    docker push j43lani/simpleapp:latest

  if it success then the output console will be

    The push refers to repository [docker.io/j43lani/simpleapp]
    9ec347540179: Preparing
    dd50fd249f59: Preparing
    5b9b1908ee80: Preparing
    485f9ef7c123: Preparing
    c611bbe8edb8: Preparing
    dc55695bb7d7: Preparing
    999a92464cc2: Preparing
    06685ec10a3d: Preparing
    9ec347540179: Pushed
    dd50fd249f59: Pushed
    5b9b1908ee80: Pushed
    b5d364b54397: Waiting
    8bf41ce37c63: Waiting
    cf3f05349668: Waiting
    ae2d388f7bfb: Waiting
    06685ec10a3d: Pushed
    0d020d3314df: Pushed
    d4e81fe6b97b: Pushed
    6eaeff4c6bd0: Pushed
    b5d364b54397: Pushed
    8bf41ce37c63: Pushed
    cf3f05349668: Pushed
    ae2d388f7bfb: Pushed
    3fb4cdcc0792: Pushed
    16fe83093aa9: Pushed
    3bc383470c05: Pushed
    e93827457889: Pushed
    08fa02ce37eb: Pushed
    a037458de4e0: Pushed
    bafdbe68e4ae: Pushed
    a13c519c6361: Pushed
    latest: digest: sha256:b6c365780a4ae025972e9926e984b3a0ecb57df62371599badf4d238a4384204 size: 5153
