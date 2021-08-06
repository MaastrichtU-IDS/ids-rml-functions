
mvn install
# cp functions_ids.ttl /opt/
# cp target/IdsRmlFunctions-v0.0.1-jar-with-dependencies.jar /opt/IdsRmlFunctions.jar

# RML_PATH=~/sandbox/rmlmapper-java/src/main/resources
# RML_PATH=/opt
RML_PATH=~/develop/bio2rdf/bio2kg-etl/datasets/

cp functions_ids.ttl /opt/
cp functions_ids.ttl $RML_PATH/
cp target/IdsRmlFunctions-v0.0.1-jar-with-dependencies.jar $RML_PATH/IdsRmlFunctions.jar

# cd ~/sandbox/rmlmapper-java
# rm -rf target/
# mvn install -DskipTests
# mv target/rmlmapper-*-all.jar /opt/rmlmapper.jar