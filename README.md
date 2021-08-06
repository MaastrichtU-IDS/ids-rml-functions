# IDS strings Functions

This library provides a standalone library for the [GREL] functions in JAVA. FnO function implementation in JAVA.

Examples:

* RMLStreamer: https://github.com/RMLio/RMLStreamer/tree/development/src/main/resources
* RMLmapper: https://github.com/RMLio/rmlmapper-java/tree/master/src/main/resources
* Grel function: https://github.com/FnOio/grel-functions-java

## Installation

```shell
mvn install
```

Skip tests:

```bash
mvn install -DskipTests
```

Move the jar and functions file next to the RML mapper jar (here in `/opt`):

```bash
cp rmlfunctions.ttl /opt/
cp target/IdsRmlFunctions-v0.0.1-jar-with-dependencies.jar /opt/IdsRmlFunctions.jar
```

## Quick start

`src/main/java/io/fno/grel` contains code to actual functions.
Note how they currently are all public and static.
Their description is taken directly from [GREL].
These implementations are [mapped](https://fno.io/spec/#ontology-concrete) to [FnO] descriptions.
How these descriptions look like, you can find in `src/main/resources/grel_java_mapping.ttl`.
Using the `fno:function` predicate, they are linked to Function descriptions.
The function descriptions, you can find at <http://users.ugent.be/~bjdmeest/function/grel.ttl#>.

## Testing

```shell
mvn test
```

## Best practices

### Use JAVA Classes, not primites

So `Integer` instead of `int`, etc.

> The Function Handler for the moment only handles Classes, not primitives.

[FnO]: https://fno.io/spec/
[GREL]: https://github.com/OpenRefine/OpenRefine/wiki/GREL-Functions
