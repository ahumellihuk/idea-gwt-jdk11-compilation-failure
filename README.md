# Sample GWT project

## Description
Demonstrates an issue with IntelliJ IDEA where GWT compilation on JDK11 fails to find `java.sql` classes

## Context
We had a problem where compiling GWT on JDK 11 in IDEA would fail due to `java.sql` module classes not being found even with `--add-modules java.sql`, but would succeed when done through Maven, which led me to look into the `CommandLineWrapper` implementation, in particular how it manages the class path entries. I've discovered that `URLClassLoader`, which is constructed in `CommandLineWrapper` has its parent set as null, which stands for the Bootstrap class loader.

With the introduction of modular system I believe this needs to have changed to be the Platform class loader instead or another method of passing classpath entries should be used in the GWT compilation.
I've successfully tested this change by compiling a modified `idea-rt.jar` and replacing it in my local IDEA installation, which has allowed GWT compilation to succeed.

Pull Request: https://github.com/JetBrains/intellij-community/pull/1192
